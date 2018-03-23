package model;

public class Vegetables extends Goods {
    private DateTerm dateTerm;
    private String sort;

    public Vegetables(int id, String name, int quantity, String description, Double price, DateTerm dateTerm, String sort) {
        super(id, name, quantity, description, price);
        this.dateTerm = dateTerm;
        this.sort = sort;
    }
}
