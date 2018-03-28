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
        System.out.println(DetailsInformation());
    }                           //метод виводу на екран полів об'єкта

    @Override
    public String DetailsInformation() {
        return "Назва товару: " + getName() +
                "\nКатегорія товару: " + getCategory() +
                "\nКількість товару: " + getQuantity() +
                "\nОпис товару: " + getDescription() +
                "\nЦіна товару: " + getPrice() + "$";
    }
}
