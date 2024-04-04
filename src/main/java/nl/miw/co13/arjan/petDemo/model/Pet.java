package nl.miw.co13.arjan.petDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @Auteur Arjan Cnossen
 * Represents a pet that can play with toys
 **/
@Entity
public class Pet {
    @Id @GeneratedValue
    private Long petId;
    private String species;
    private String petName;
    private String owner;

    public Pet(String species, String petName, String owner) {
        this.species = species;
        this.petName = petName;
        this.owner = owner;
    }

    public Pet() {

    }
    public String getSpecies() {
        return species;
    }

    public String getPetName() {
        return petName;
    }
    public String getOwner() {
        return owner;
    }
}
