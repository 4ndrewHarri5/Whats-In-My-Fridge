package com.apprentices.WhatsInMyFridge.Enitiy;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CookBook {

    @JsonProperty("cookbook")
    private List<Recipie> recipeList;

    public List<Recipie> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(List<Recipie> recipeList) {
        this.recipeList = recipeList;
    }
}
