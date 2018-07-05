package me.chenjr.teatracing.repositories;

import me.chenjr.teatracing.domain.Factory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactoryRepository extends JpaRepository<Factory,Long> {
    Factory findByName(String name);



}
