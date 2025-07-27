package sa.hisham.mushreffay.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "student")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    @ManyToMany(mappedBy = "students")
    List<TeacherEntity> teachers;
    @OneToMany(mappedBy = "student")
    List<StudentEnrollmentEntity> enrollments;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "date_of_birth")
    private LocalDateTime dateOfBirth;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private GuardianEntity guardian;


}
