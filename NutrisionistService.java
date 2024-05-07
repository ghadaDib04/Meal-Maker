package MealMaker.MealMakerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NutrisionistService {
    @Autowired
    private NutritionistRepository nutritionistRepository;

    public Nutritionist addNutritionist(Nutritionist nutritionist) {
        // Gérer l'ajout d'un nutritionniste
        return nutritionistRepository.save(nutritionist);
    }

    public Nutritionist updateNutritionist(Nutritionist nutritionist) {
        // Gérer la mise à jour d'un nutritionniste
        return nutritionistRepository.save(nutritionist);
    }

    public Nutritionist getNutritionistById(int nutritionistId) {
        // Récupérer un nutritionniste par son identifiant
        return nutritionistRepository.findById(nutritionistId).orElse(null);
    }

    public void deleteNutritionist(int nutritionistId) {
        // Supprimer un nutritionniste par son identifiant
        nutritionistRepository.deleteById(nutritionistId);
    }

    public String generateUsername(Nutritionist nutritionist) {
        // Générer le nom d'utilisateur d'un nutritionniste
        return nutritionist.getFirstnameNutri() + nutritionist.getLastnameNutri() + nutritionist.getNutritionistID();
    }
}
