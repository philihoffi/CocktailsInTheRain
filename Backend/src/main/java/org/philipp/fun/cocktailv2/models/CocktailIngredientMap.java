package org.philipp.fun.cocktailv2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
public class CocktailIngredientMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private int orderIndex;

    @NotNull
    private int amount;

    @NotNull
    private Unit unit;

    @NotNull
    private Ingredient ingredient;




}
