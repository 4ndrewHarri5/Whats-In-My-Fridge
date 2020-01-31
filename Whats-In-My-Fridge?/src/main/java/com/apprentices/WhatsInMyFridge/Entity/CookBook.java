package com.apprentices.WhatsInMyFridge.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CookBook {

    @JsonProperty("cookbook")
    private List<Recipe> recipeList;

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }
}
