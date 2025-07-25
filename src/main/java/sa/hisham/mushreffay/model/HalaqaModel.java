package sa.hisham.mushreffay.model;

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
public class HalaqaModel {
    @Column(name = "halaqa_name", nullable = false)
    String halaqaName;
    @OneToMany(mappedBy = "halaqa")
    List<TeacherEnrollmentModel> teachersEnrollments;
    @OneToMany(mappedBy = "halaqa")
    List<StudentEnrollmentModel> studentsEnrollments;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
}
