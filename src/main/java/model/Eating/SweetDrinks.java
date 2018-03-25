package model.Eating;

import model.DateTerm;
import model.Goods;

public class SweetDrinks extends Goods {
    private DateTerm dateTerm;

    public SweetDrinks() {
        dateTerm = new DateTerm();
    }

    public SweetDrinks(int id, String name, int quantity, String description, Double price, DateTerm dateTerm) {
        super(id, name, quantity, description, price);
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
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() +
                "\nQuantity: " + this.getQuantity() +
                "\nDescription: " + this.getDescription() +
                "\nPrice: " + this.getPrice() + " $" +
                "\nCreation date: " + this.getDateTerm().getDateCreating() +
                "\nTemperature save: " + this.getDateTerm().getTemperatureSave() +
                "\nTerm save: " + this.getDateTerm().getTermSave() + "month";
    }
}
