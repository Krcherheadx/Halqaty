package sa.hisham.mushreffay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.hisham.mushreffay.domain.HalaqaEntity;

public interface HalaqaRepository extends JpaRepository<HalaqaEntity, String> {
}
