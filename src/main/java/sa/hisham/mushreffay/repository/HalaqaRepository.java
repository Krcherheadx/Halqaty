package sa.hisham.mushreffay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.hisham.mushreffay.model.HalaqaModel;

public interface HalaqaRepository extends JpaRepository<HalaqaModel, String> {
}
