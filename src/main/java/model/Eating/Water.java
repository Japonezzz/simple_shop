package model.Eating;

import model.Goods;

//клас питної води з переліку продуктів

public class Water extends Goods {

    public  Water() {
    }

    public Water(int id, String name, int quantity, String description, Double price, String category) {
        super(id, name, quantity, description, price, category);
    }

    public void Show() {
        System.out.println(this);
    }                           //метод виводу на екран полів об'єкта
}
