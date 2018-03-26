package model.Eating;

import model.DateTerm;
import model.Goods;

//клас овочів з переліку харчових продуктів

public class Vegetables extends Goods {
    private DateTerm dateTerm;                                          //поле для запису терміну придатності
    private String sort;

    public Vegetables() {
        dateTerm = new DateTerm();
    }

    public Vegetables(int id, String name, int quantity, String description, Double price, String category, DateTerm dateTerm, String sort) {
        super(id, name, quantity, description, price, category);
        this.dateTerm = dateTerm;
        this.sort = sort;
    }

    public DateTerm getDateTerm() {
        return dateTerm;
    }

    public void setDateTerm(DateTerm dateTerm) {
        this.dateTerm = dateTerm;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void Show() {
        System.out.println(this);
    }                       //метод виводу на екран полів об'єкта

//    @Override
//    public String toString() {                                              //перегрузка метода toString()
//        return "Name: " + this.getName() +
//                "\nQuantity: " + this.getQuantity() +
//                "\nDescription: " + this.getDescription() +
//                "\nPrice: " + this.getPrice() + " $" +
//                "\nCreation date: " + this.getDateTerm().getDateCreating() +
//                "\nTemperature save: " + this.getDateTerm().getTemperatureSave() +
//                "\nTerm save: " + this.getDateTerm().getTermSave() + " month" +
//                "\nSort: " + this.getSort();
//    }
}
