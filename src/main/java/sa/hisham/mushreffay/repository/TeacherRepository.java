package sa.hisham.mushreffay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.hisham.mushreffay.domain.TeacherEntity;

public interface TeacherRepository extends JpaRepository<TeacherEntity, String> {
}
