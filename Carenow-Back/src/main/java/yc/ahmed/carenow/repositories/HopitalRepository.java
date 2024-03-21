package yc.ahmed.carenow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yc.ahmed.carenow.models.Hopital;

@Repository
public interface HopitalRepository extends JpaRepository<Hopital, Long> {
}
