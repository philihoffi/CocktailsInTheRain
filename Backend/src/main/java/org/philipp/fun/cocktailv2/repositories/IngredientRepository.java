package org.philipp.fun.cocktailv2.repositories;

import org.philipp.fun.cocktailv2.models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {

    // This interface will automatically provide CRUD operations for Ingredient entities.
    // Additional custom query methods can be defined here if needed.
}
