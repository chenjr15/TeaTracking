package me.chenjr.teatracing.repositories;

import me.chenjr.teatracing.domain.TeaPkg;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeaPkgRepository extends JpaRepository<TeaPkg,Long> {
    TeaPkg findByFactory(int id);
    TeaPkg findByTeacode(Long tea_code);
    TeaPkg findBySeller(int id);
//    TeaPkg findById(Long id);

}
