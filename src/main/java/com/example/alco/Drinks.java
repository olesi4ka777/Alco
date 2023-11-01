package com.example.alco;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Drinks {
    int id;
    AlcoCategory category;
    SimpleStringProperty subcategory;
    SimpleStringProperty country;
    SimpleStringProperty label;
    SimpleIntegerProperty sugar;
    SimpleIntegerProperty cask;
    SimpleIntegerProperty level;
    SimpleIntegerProperty yearproduction;

    public Drinks (AlcoCategory category, String subcategory,String country, String label , int sugar,int cask, int level, int yearproduction) {
        this.label = new SimpleStringProperty(label);
        this.category = category;
        this.subcategory = new SimpleStringProperty(subcategory);
        this.country = new SimpleStringProperty(country);
        this.level = new SimpleIntegerProperty(level);
        this.sugar = new SimpleIntegerProperty(sugar);
        this.cask = new SimpleIntegerProperty(cask);
        this.yearproduction = new SimpleIntegerProperty(yearproduction);
    }

    public Drinks(int id, String l, AlcoCategory c, String s, String cn, Float st, Float sg, Integer y, Integer a) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label.get();
    }

    public SimpleStringProperty labelProperty() {
        return label;
    }

    public void setLabel(String label) {
        this.label.set(label);
    }

    public AlcoCategory getCategory() {
        return category;
    }

    public void setCategory(AlcoCategory category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory.get();
    }

    public SimpleStringProperty subcategoryProperty() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory.set(subcategory);
    }

    public String getCountry() {
        return country.get();
    }

    public SimpleStringProperty countryProperty() {
        return country;
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public int getLevel() {
        return level.get();
    }

    public SimpleIntegerProperty levelProperty() {
        return level;
    }

    public void setLevel(int level) {
        this.level.set(level);
    }

    public int getSugar() {
        return sugar.get();
    }

    public SimpleIntegerProperty sugarProperty() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar.set(sugar);
    }

    public int getCask() {
        return cask.get();
    }

    public SimpleIntegerProperty caskProperty() {
        return cask;
    }

    public void setYear(int cask) {
        this.cask.set(cask);
    }

    public int getYearproduction() {
        return yearproduction.get();
    }
    public SimpleIntegerProperty yearproductionProperty() {
        return yearproduction;
    }

    public void setYearproduction(int yearproduction) {
        this.yearproduction.set(yearproduction);
    }

    public void setCask(int cask) {
        this.cask.set(cask);
    }

    public Drinks (int id, String label, int volume, AlcoCategory category,
                   String subcategory, String country, int strength, int sugar,
                   int year, int age) {
        this.id = id;
        this.label = new SimpleStringProperty(label);
        this.yearproduction = new SimpleIntegerProperty(yearproduction);
        this.category = category;
        this.subcategory = new SimpleStringProperty(subcategory);
        this.country = new SimpleStringProperty(country);
        this.level = new SimpleIntegerProperty(level);
        this.sugar = new SimpleIntegerProperty(sugar);
        this.cask = new SimpleIntegerProperty(cask);
    }
}