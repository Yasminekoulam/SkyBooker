package skybooker.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import skybooker.server.entity.Vol;

@Repository
public interface VolRepository extends JpaRepository<Vol, Long> {
}
