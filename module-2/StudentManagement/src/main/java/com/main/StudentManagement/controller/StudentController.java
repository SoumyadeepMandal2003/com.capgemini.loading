package com.main.StudentManagement.controller;


@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createStudent(student));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    // Example URL: GET /api/students?page=0&size=10&sort=name,asc
    @GetMapping
    public ResponseEntity<Page<Student>> getAllStudents(Pageable pageable) {
        return ResponseEntity.ok(studentService.getAllStudents(pageable));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return ResponseEntity.ok(studentService.updateStudent(id, student));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    // --- File Uploads ---
    @PostMapping(value = "/{id}/profile-image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadProfileImage(@PathVariable Long id, @RequestParam("file") MultipartFile file) throws IOException {
        studentService.uploadProfileImage(id, file);
        return ResponseEntity.ok("Profile image uploaded successfully");
    }

    @PostMapping(value = "/{id}/assignment", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadAssignment(@PathVariable Long id, @RequestParam("file") MultipartFile file) throws IOException {
        studentService.uploadAssignment(id, file);
        return ResponseEntity.ok("Assignment uploaded successfully");
    }

    // --- File Downloads ---
    @GetMapping("/{id}/profile-image")
    public ResponseEntity<byte[]> downloadProfileImage(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"profile_" + id + ".jpg\"")
                .body(student.getProfileImage());
    }

    @GetMapping("/{id}/assignment")
    public ResponseEntity<byte[]> downloadAssignment(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"assignment_" + id + ".pdf\"")
                .body(student.getAssignmentFile());
    }
}