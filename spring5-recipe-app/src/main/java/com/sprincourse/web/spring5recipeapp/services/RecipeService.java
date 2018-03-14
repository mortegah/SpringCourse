package com.sprincourse.web.spring5recipeapp.services;

import com.sprincourse.web.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long id);
}
