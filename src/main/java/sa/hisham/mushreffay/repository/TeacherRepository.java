package sa.hisham.mushreffay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.hisham.mushreffay.model.TeacherModel;

public interface TeacherRepository extends JpaRepository<TeacherModel, String> {
}
