package com.apprentices.WhatsInMyFridge.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Ingredient {

    @JsonProperty("id")
    private int id;
    @JsonProperty("amount")
    private double amount;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("unitLong")
    private String unitLong;
    @JsonProperty("unitShort")
    private String unitShort;
    @JsonProperty("aisle")
    private String aisle;
    @JsonProperty("name")
    private String name;
    @JsonProperty("original")
    private String original;
    @JsonProperty("originalString")
    private String originalString;
    @JsonProperty("originalName")
    private String originalName;
    @JsonProperty("metaInformation")
    private List<String> metaInformation;
    @JsonProperty("meta")
    private List<String> meta;
    @JsonProperty("extendedName")
    private String extendedName;  //optional
    @JsonProperty("image")
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUnitLong() {
        return unitLong;
    }

    public void setUnitLong(String unitLong) {
        this.unitLong = unitLong;
    }

    public String getUnitShort() {
        return unitShort;
    }

    public void setUnitShort(String unitShort) {
        this.unitShort = unitShort;
    }

    public String getAisle() {
        return aisle;
    }

    public void setAisle(String aisle) {
        this.aisle = aisle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getOriginalString() {
        return originalString;
    }

    public void setOriginalString(String originalString) {
        this.originalString = originalString;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public List<String> getMetaInformation() {
        return metaInformation;
    }

    public void setMetaInformation(List<String> metaInformation) {
        this.metaInformation = metaInformation;
    }

    public List<String> getMeta() {
        return meta;
    }

    public void setMeta(List<String> meta) {
        this.meta = meta;
    }

    public String getExtendedName() {
        return extendedName;
    }

    public void setExtendedName(String extendedName) {
        this.extendedName = extendedName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
