package yc.ahmed.carenow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import yc.ahmed.carenow.models.Docteur;

@Repository
public interface DocteurRepository extends JpaRepository<Docteur, Long> {
}
