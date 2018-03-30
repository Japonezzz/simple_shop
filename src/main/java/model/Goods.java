package model;

//абстрактний клас товарів. Містить п'ять полів, обов'язкових для будь-якого товару

import enums.CategoryType;

import java.util.ArrayList;

public abstract class Goods {

    //fields
    private int id;                 //поле ID товару
    private String name;            //поле назви товару
    private int quantity;           //поле кількості одиниць товару на складі
    private String description;     //поле опису товару
    private Double price;           //поле ціни за одиницю товару
    private CategoryType category;        //pole kategorii

    //constructors
    public Goods() {
    }

    public Goods(int id, String name, int quantity, String description, Double price, String category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
        this.category = CategoryType.valueOf(category);
    }

    //get set methodos for fields
    public CategoryType getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = CategoryType.valueOf(category);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String GetListItem(){
        return this.name + "\t" + this.price + "$";
    }

    public String DetailsInformation(){
        return "";
    }

    @Override
    public String toString() {
        return "Name: " + name+ "\t" + "Category: " + category + "\tPrice: " + price;
    }

    // abstract methods
    public abstract void Show();                                //абстрактний метод виводу на екран полів


}
