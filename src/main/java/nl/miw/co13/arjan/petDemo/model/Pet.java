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

    public Pet(String species, String petName, String ownerName) {
        this.species = species;
        this.petName = petName;
        this.owner = ownerName;
    }

    public Pet() {

    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
