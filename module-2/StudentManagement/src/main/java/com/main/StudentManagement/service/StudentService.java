package com.main.StudentManagement.service;


@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    @PreAuthorize("hasRole('ADMIN')")
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // Method-level Security: Users can only retrieve their own record, unless they are an ADMIN
    // Caching: Results are cached based on the ID
    @Cacheable(value = "students", key = "#id")
    @PostAuthorize("returnObject.email == authentication.name or hasRole('ADMIN')")
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    // Pagination and Sorting applied here
    public Page<Student> getAllStudents(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @CachePut(value = "students", key = "#id")
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = getStudentById(id);
        student.setName(studentDetails.getName());
        student.setCourse(studentDetails.getCourse());
        student.setMarks(studentDetails.getMarks());
        return studentRepository.save(student);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @CacheEvict(value = "students", key = "#id")
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    // File Upload Logic
    @PreAuthorize("hasRole('ADMIN')")
    public void uploadProfileImage(Long id, MultipartFile file) throws IOException {
        Student student = getStudentById(id);
        student.setProfileImage(file.getBytes());
        studentRepository.save(student);
    }

    @PreAuthorize("hasRole('ADMIN')")
    public void uploadAssignment(Long id, MultipartFile file) throws IOException {
        Student student = getStudentById(id);
        student.setAssignmentFile(file.getBytes());
        studentRepository.save(student);
    }
}