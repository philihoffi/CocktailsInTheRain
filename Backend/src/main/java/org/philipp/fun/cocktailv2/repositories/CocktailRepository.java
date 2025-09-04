package org.philipp.fun.cocktailv2.repositories;

import org.philipp.fun.cocktailv2.models.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocktailRepository extends JpaRepository<Cocktail, Integer> {
    // This interface will automatically provide CRUD operations for Cocktail entities.
    // Additional custom query methods can be defined here if needed.
}