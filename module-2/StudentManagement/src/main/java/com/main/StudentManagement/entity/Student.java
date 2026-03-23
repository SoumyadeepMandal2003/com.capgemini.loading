package com.main.StudentManagement.entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String course;
    private Integer marks;

    @Lob
    private byte[] profileImage;

    @Lob
    private byte[] assignmentFile;
}