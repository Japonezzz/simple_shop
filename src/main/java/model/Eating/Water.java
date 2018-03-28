package model.Eating;

import model.Goods;

/**
 * Клас використовується для питної води
 * з переліку харчових товарів
 * @author
 * @version
 */

public class Water extends Goods {

    /** конструктор за замовчуванням */
    public  Water() {
    }

    /** Конструктор з параметрами
     * Ініціалізує поля {@link Water#id}, {@link Water#name}, {@link Water#quantity},
     * {@link Water#description}, {@link Water#price}, {@link Water#category},
     * @see Water
     **/
    public Water(int id, String name, int quantity, String description, Double price, String category) {
        super(id, name, quantity, description, price, category);
    }

    /** Метод виводу полів класу на екран */
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
