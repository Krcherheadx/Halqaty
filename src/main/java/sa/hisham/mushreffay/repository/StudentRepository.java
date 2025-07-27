package sa.hisham.mushreffay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.hisham.mushreffay.domain.StudentEntity;


public interface StudentRepository extends JpaRepository<StudentEntity, String> {

}
