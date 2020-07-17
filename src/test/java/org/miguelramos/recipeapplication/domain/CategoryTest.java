package org.miguelramos.recipeapplication.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;
    Set<Recipe> recipes;
    Recipe recipe;
    Long idValue = 4L;
    String exampleText = "some example description";

    @BeforeEach
    void setUp() {
        recipe = new Recipe();
        category = new Category();
        recipes = new HashSet<>();
    }

    @Test
    void getId() {
        category.setId(idValue);
        assertEquals(idValue,category.getId());
    }

    @Test
    void getDescription() {
        category.setDescription(exampleText);
        assertEquals(exampleText,category.getDescription());
    }

    @Test
    void getRecipes() {
        recipes.add(recipe);
        category.setRecipes(recipes);
        assertTrue(recipes.contains(recipe));
    }
}