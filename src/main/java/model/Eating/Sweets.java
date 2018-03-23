package model.Eating;

import model.DateTerm;
import model.Goods;

public class Sweets extends Goods {
    private DateTerm dateTerm;

    public Sweets(int id, String name, int quantity, String description, Double price, DateTerm dateTerm) {
        super(id, name, quantity, description, price);
        this.dateTerm = dateTerm;
    }

    public DateTerm getDateTerm() {
        return dateTerm;
    }

    public void setDateTerm(DateTerm dateTerm) {
        this.dateTerm = dateTerm;
    }
}
