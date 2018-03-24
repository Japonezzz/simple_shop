package model;

import java.util.Date;

public class Clothes extends Goods {
    private Date dateCreation;
    private String nameBrend;
    private int countWorkers;
    private int countCountry;

    public Clothes(int id, String name, int quantity, String description, Double price, Date dateCreation, String nameBrend, int countWorkers, int countCountry) {
        super(id, name, quantity, description, price);
        this.dateCreation = dateCreation;
        this.nameBrend = nameBrend;
        this.countWorkers = countWorkers;
        this.countCountry = countCountry;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getNameBrend() {
        return nameBrend;
    }

    public void setNameBrend(String nameBrend) {
        this.nameBrend = nameBrend;
    }

    public int getCountWorkers() {
        return countWorkers;
    }

    public void setCountWorkers(int countWorkers) {
        this.countWorkers = countWorkers;
    }

    public int getCountCountry() {
        return countCountry;
    }

    public void setCountCountry(int countCountry) {
        this.countCountry = countCountry;
    }

    public void Show() {

    }
}
