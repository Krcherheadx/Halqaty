package sa.hisham.mushreffay.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "student_enrollment")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentEnrollmentEntity<T> {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private boolean isActive;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "student_id")
    private StudentEntity student;
    @JoinColumn(name = "halaqa_id")
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    private HalaqaEntity halaqa;


}
