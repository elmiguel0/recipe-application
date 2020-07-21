package org.miguelramos.recipeapplication.converters;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.miguelramos.recipeapplication.commands.CategoryCommand;
import org.miguelramos.recipeapplication.domain.Category;

import static org.junit.jupiter.api.Assertions.*;

class CategoryCommandToCategoryTest {

    Long id = 1L;
    CategoryCommandToCategory categoryCommandToCategory;

    @BeforeEach
    public void setUp(){
        categoryCommandToCategory = new CategoryCommandToCategory();
    }

    @Test
    void convert() {
        //categoryCommandToCategory = new CategoryCommandToCategory();
        CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(id);
        categoryCommand.setDescription("description");

        Category category = categoryCommandToCategory.convert(categoryCommand);

        assertEquals(id,category.getId());
        assertEquals("description",category.getDescription());
    }
}