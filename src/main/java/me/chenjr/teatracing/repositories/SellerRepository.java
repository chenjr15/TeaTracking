package me.chenjr.teatracing.repositories;
import me.chenjr.teatracing.domain.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller,Long> {
    Seller findByName(String name);
}
