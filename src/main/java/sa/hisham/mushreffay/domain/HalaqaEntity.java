package sa.hisham.mushreffay.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "halaqa")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HalaqaEntity {
    @Column(name = "halaqa_name", nullable = false)
    String halaqaName;
    @OneToMany(mappedBy = "halaqa")
    List<TeacherEnrollmentEntity> teachersEnrollments;
    @OneToMany(mappedBy = "halaqa")
    List<StudentEnrollmentEntity> studentsEnrollments;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
}
