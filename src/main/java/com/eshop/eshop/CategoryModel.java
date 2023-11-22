package com.eshop.eshop;

public class CategoryModel {
    private String name;
    private Long id;
    private String image;

    // getter and setters
    public String getNameCategory() {
        return this.name;
    }

    public void setNameCategory(String name) {
        this.name = name;
    }

    public Long getIdCategory() {
        return this.id;
    }

    public void setIdCategory(Long id) {
        this.id = id;
    }

    public String getImageCategory() {
        return this.image;
    }

    public void setImageCategory(String image) {
        this.image = image;
    }
}
