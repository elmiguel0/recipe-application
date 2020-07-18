package org.miguelramos.recipeapplication.repositories;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.miguelramos.recipeapplication.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJdbcTest
class CategoryRepositoryTest {
    /**
     * First configure h2db. Create the file name application.yaml in test -> resources path:
     */
    @Autowired
    CategoryRepository categoryRepository;

    @BeforeEach
    void beforeEach(){
    }

    @Test
    void findByDescriptionTest(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("Mexican");
        assertEquals("Mexican",categoryOptional.get().getDescription());
    }
}