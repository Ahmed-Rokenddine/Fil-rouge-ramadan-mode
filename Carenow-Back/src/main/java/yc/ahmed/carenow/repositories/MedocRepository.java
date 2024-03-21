package yc.ahmed.carenow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import yc.ahmed.carenow.models.Medoc;

@Repository
public interface MedocRepository  extends JpaRepository<Medoc, Long> {
}
