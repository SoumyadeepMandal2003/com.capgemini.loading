package com.main.StudentManagement.entity;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email; // Used as the username

    private String password;
    private String role; // e.g., "ROLE_ADMIN", "ROLE_USER"
}