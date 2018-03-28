package model.Eating;

import model.DateTerm;
import model.Goods;

//клас солодощів з переліку харчових товарів

public class Sweets extends Goods {
    private DateTerm dateTerm;                                  // поле для запису терміну придатності

    public Sweets() {
        dateTerm = new DateTerm();
    }

    public Sweets(int id, String name, int quantity, String description, Double price, String category, DateTerm dateTerm) {
        super(id, name, quantity, description, price, category);
        this.dateTerm = dateTerm;
    }

    public DateTerm getDateTerm() {
        return dateTerm;
    }

    public void setDateTerm(DateTerm dateTerm) {
        this.dateTerm = dateTerm;
    }

    public void Show() {
        System.out.println(DetailsInformation());
    }                               //метод виводу на екран полів об'єкта

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
