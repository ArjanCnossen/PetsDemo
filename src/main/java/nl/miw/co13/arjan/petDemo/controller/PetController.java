package nl.miw.co13.arjan.petDemo.controller;

import nl.miw.co13.arjan.petDemo.model.Pet;
import nl.miw.co13.arjan.petDemo.repositories.PetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auteur Arjan Cnossen
 * Purpose of the class
 **/
@Controller
public class PetController {
    private final PetRepository petRepository;

    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @GetMapping("/")
    private String showPetOverview(Model model) {

        model.addAttribute("allPets", petRepository.findAll());

        return "petOverview";
    }

    @GetMapping("/pet/new")
    private String getPetForm(Model model) {
        model.addAttribute("pet", new Pet());
        return "petForm";
    }

    @PostMapping("/pet/new")
    private String savePet(@ModelAttribute("pet") Pet petToBeSaved, BindingResult result) {
        if (!result.hasErrors()) {
            petRepository.save(petToBeSaved);
        }
        return "redirect:/";
    }
}