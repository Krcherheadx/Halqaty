package sa.hisham.mushreffay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.hisham.mushreffay.model.StudentModel;


public interface StudentRepository extends JpaRepository<StudentModel, String> {

}
