package model.Eating;

import model.DateTerm;
import model.Goods;

/**
 * Клас використовується для солодких напоїв
 * з переліку харчових товарів
 * @author
 * @version
 */

public class SweetDrinks extends Goods {

    /** Поле для запису терміну придатності */
    private DateTerm dateTerm;

    /**
     * Конструктор за замовчуванням
     * Ініціалізує поле {@link SweetDrinks#dateTerm)
     * */
    public SweetDrinks() {
        dateTerm = new DateTerm();
    }
    /** Конструктор з параметрами
     * Ініціалізує поля {@link SweetDrinks#id}, {@link SweetDrinks#name}, {@link SweetDrinks#quantity},
     * {@link SweetDrinks#description}, {@link SweetDrinks#price}, {@link SweetDrinks#category},
     * {@link SweetDrinks#dateTerm}}
     * @see SweetDrinks
     **/
    public SweetDrinks(int id, String name, int quantity, String description, Double price, String category, DateTerm dateTerm) {
        super(id, name, quantity, description, price, category);
        this.dateTerm = dateTerm;
    }
    /**  @return dateTerm (термін придатності товару) */
    public DateTerm getDateTerm() {
        return dateTerm;
    }
    /** Приймає і встановлює термін придатності продукту
     *  @param dateTerm
     * */
    public void setDateTerm(DateTerm dateTerm) {
        this.dateTerm = dateTerm;
    }
    /** Абстрактний метод виводу полів класу на екран */
    public void Show() {
        System.out.println(DetailsInformation());
    }               //метод виводу на екран полів об'єкта

    @Override
    public String DetailsInformation() {
        return "Назва товару: " + getName() +
                "\nКатегорія товару: " + getCategory() +
                "\nКількість товару: " + getQuantity() +
                "\nОпис товару: " + getDescription() +
                "\nЦіна товару: " + getPrice() + "$" +
                "\nДата виготовлення товару: " + dateTerm.getDateCreating() +
                "\nТемпература зберігання: " + dateTerm.getTemperatureSave() +
                "\nТермін придатності(у місяцях): " + dateTerm.getTermSave();
    }
}
