package nl.miw.co13.arjan.petDemo.controller;

import nl.miw.co13.arjan.petDemo.model.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auteur Arjan Cnossen
 * Purpose of the class
 **/
@Controller
public class PetController {
    @GetMapping("/")
    private String showPetOverview(Model model) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("Cat", "Croki", "Arjan Cnossen"));
        pets.add(new Pet("Cat", "Flugel", "Arjan Cnossen"));

        model.addAttribute("allPets", pets);

        return "petOverview";

    }
}
