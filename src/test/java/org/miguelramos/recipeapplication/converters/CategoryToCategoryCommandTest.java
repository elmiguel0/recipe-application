package org.miguelramos.recipeapplication.converters;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.miguelramos.recipeapplication.commands.CategoryCommand;
import org.miguelramos.recipeapplication.domain.Category;

import static org.junit.jupiter.api.Assertions.*;

class CategoryToCategoryCommandTest {

    Long id = 1L;
    CategoryToCategoryCommand categoryToCategoryCommand;

    @BeforeEach
    void setUp() {
        categoryToCategoryCommand = new CategoryToCategoryCommand();
    }

    @Test
    void convert() {
        Category category = new Category();
        category.setId(id);
        category.setDescription("description");

        CategoryCommand categoryCommand = categoryToCategoryCommand.convert(category);

        assertEquals(id,categoryCommand.getId());
        assertEquals("description",categoryCommand.getDescription());

    }
}