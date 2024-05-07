package MealMaker.MealMakerApp;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/MealMakerApp")
public class NutrisionistController {
    @Autowired
    private NutrisionistService nutrisionistService; // Corrected variable name

    @PostMapping("/nutritionists")
    public Nutritionist addNutritionist(@RequestBody Nutritionist nutritionist) {
        // Ajouter un nutritionniste
        return nutrisionistService.addNutritionist(nutritionist);
    }

    @PutMapping("/nutritionists/{id}")
    public Nutritionist updateNutritionist(@PathVariable int id, @RequestBody Nutritionist nutritionist) {
        // Mettre à jour un nutritionniste
        nutritionist.setNutritionistID(id);
        return nutrisionistService.updateNutritionist(nutritionist);
    }

    @GetMapping("/nutritionists/{id}")
    public Nutritionist getNutritionist(@PathVariable int id) {
        // Récupérer les informations d'un nutritionniste
        return nutrisionistService.getNutritionistById(id);
    }

    @DeleteMapping("/nutritionists/{id}")
    public void deleteNutritionist(@PathVariable int id) {
        // Supprimer un nutritionniste
        nutrisionistService.deleteNutritionist(id);
    }

    @GetMapping("/nutritionists/{id}/generateUsername")
    public String generateUsername(@PathVariable int id) {
        // Générer le nom d'utilisateur pour un nutritionniste donné
        Nutritionist nutritionist = nutrisionistService.getNutritionistById(id);
        if (nutritionist != null) {
            return nutrisionistService.generateUsername(nutritionist);
        } else {
            return "Nutritionist not found!";
        }
    }
}
