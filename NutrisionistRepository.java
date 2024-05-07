package MealMaker.MealMakerApp;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
 interface NutritionistRepository extends JpaRepository<Nutritionist, Integer> {
    // repository methods
}