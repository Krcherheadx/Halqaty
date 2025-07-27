package sa.hisham.mushreffay.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "teacher")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeacherEntity {
    @ManyToMany(fetch = FetchType.LAZY)
    List<StudentEntity> students;
    @OneToMany(mappedBy = "teacher")
    List<TeacherEnrollmentEntity> enrollments;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
