package nl.miw.co13.arjan.petDemo.repositories;

import nl.miw.co13.arjan.petDemo.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auteur Arjan Cnossen
 * Purpose of the class
 **/
public interface PetRepository extends JpaRepository<Pet, Long> {
}
