package model.Eating;

import model.Goods;

public class Water extends Goods {

    public  Water() {
    }

    public Water(int id, String name, int quantity, String description, Double price) {
        super(id, name, quantity, description, price);
    }

    public void Show() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() +
                "\nQuantity: " + this.getQuantity() +
                "\nDescription: " + this.getDescription() +
                "\nPrice: " + this.getPrice() + " $";
    }
}
