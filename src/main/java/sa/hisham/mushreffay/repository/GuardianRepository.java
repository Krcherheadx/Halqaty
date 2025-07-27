package sa.hisham.mushreffay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.hisham.mushreffay.domain.GuardianEntity;

public interface GuardianRepository extends JpaRepository<GuardianEntity, String> {
}
