package com.apprentices.WhatsInMyFridge.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Recipe {

    @JsonProperty("id")
    private int id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("image")
    private String image;
    @JsonProperty("imageType")
    private String imageType;
    @JsonProperty("usedIngredientCount")
    private int usedIngredientCount;
    @JsonProperty("missedIngredientCount")
    private int missedIngredientCount;
    @JsonProperty("missedIngredients")
    private List<Ingredient> missedIngredients;
    @JsonProperty("usedIngredients")
    private List<Ingredient> usedIngredients;
    @JsonProperty("unusedIngredients")
    private List<Ingredient> unusedIngredients;
    @JsonProperty("likes")
    private int likes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public int getUsedIngredientCount() {
        return usedIngredientCount;
    }

    public void setUsedIngredientCount(int usedIngredientCount) {
        this.usedIngredientCount = usedIngredientCount;
    }

    public int getMissedIngredientCount() {
        return missedIngredientCount;
    }

    public void setMissedIngredientCount(int missedIngredientCount) {
        this.missedIngredientCount = missedIngredientCount;
    }

    public List<Ingredient> getMissedIngredients() {
        return missedIngredients;
    }

    public void setMissedIngredients(List<Ingredient> missedIngredients) {
        this.missedIngredients = missedIngredients;
    }

    public List<Ingredient> getUsedIngredients() {
        return usedIngredients;
    }

    public void setUsedIngredients(List<Ingredient> usedIngredients) {
        this.usedIngredients = usedIngredients;
    }

    public List<Ingredient> getUnUsedIngredients() {
        return unusedIngredients;
    }

    public void setUnUsedIngredients(List<Ingredient> unusedIngredients) {
        this.unusedIngredients = unusedIngredients;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
