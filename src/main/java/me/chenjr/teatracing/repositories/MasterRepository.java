package me.chenjr.teatracing.repositories;

;
import me.chenjr.teatracing.domain.Master;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterRepository extends JpaRepository<Master,Long> {
    Master findByName(String name);
}
