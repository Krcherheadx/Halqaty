package sa.hisham.mushreffay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.hisham.mushreffay.domain.GuardianModel;

public interface GuardianRepository extends JpaRepository<GuardianModel, String> {
}
