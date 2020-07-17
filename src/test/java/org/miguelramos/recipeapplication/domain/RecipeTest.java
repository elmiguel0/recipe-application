package org.miguelramos.recipeapplication.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RecipeTest {

    Recipe recipe;
    Ingredient ingredient;
    Set<Ingredient> ingredients = new HashSet<>();


    @BeforeEach
    void setUp() {
        recipe = mock(Recipe.class);
        ingredient = mock(Ingredient.class);
    }

    @Test
    void getId() {
        when(recipe.getId()).thenReturn(4L);
        assertEquals(recipe.getId(),4L);
    }

    @Test
    void getDescription() {
        when(recipe.getDescription()).thenReturn("some example text");
        assertEquals(recipe.getDescription(),"some example text");
    }

    @Test
    void getPrepTime() {
        when(recipe.getPrepTime()).thenReturn(50);
        assertEquals(recipe.getPrepTime(),50);
    }

    @Test
    void getIngredients() {
       ingredients.add(ingredient);
       when(recipe.getIngredients()).thenReturn(ingredients);
       assertTrue(recipe.getIngredients().contains(ingredient));
    }

    @Test
    void getDifficulty() {
        when(recipe.getDifficulty()).thenReturn(Difficulty.EASY);
        assertEquals(recipe.getDifficulty(),Difficulty.EASY);
    }

}