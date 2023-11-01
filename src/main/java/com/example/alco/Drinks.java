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

    public Drinks(int id,String label, AlcoCategory category, String subcategory,String country,  int sugar,int cask, int level, int yearproduction) {
        this.id=id;
        this.label = new SimpleStringProperty(label);
        this.category = category;
        this.subcategory = new SimpleStringProperty(subcategory);
        this.country = new SimpleStringProperty(country);
        this.level = new SimpleIntegerProperty(level);
        this.sugar = new SimpleIntegerProperty(sugar);
        this.cask = new SimpleIntegerProperty(cask);
        this.yearproduction = new SimpleIntegerProperty(yearproduction);
    }
}