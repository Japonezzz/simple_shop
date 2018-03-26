package model.Eating;

import model.DateTerm;
import model.Goods;

//клас солодких напоїв з переліку харчових товарів

public class SweetDrinks extends Goods {
    private DateTerm dateTerm;                                      //поле для запису терміну придатності

    public SweetDrinks() {
        dateTerm = new DateTerm();
    }

    public SweetDrinks(int id, String name, int quantity, String description, Double price, String category, DateTerm dateTerm) {
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
        System.out.println(this);
    }               //метод виводу на екран полів об'єкта
}
