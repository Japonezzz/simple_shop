package model;

//проміжний клас для опису предметів одягу. Похідних від абстрактного класу товарів - Goods

import java.util.Date;

public class Clothes extends Goods {
    private Date dateCreation;          //поле для запису дати виготовлення товару
    private String nameBrend;           //поле для запису назви бренду
    private int countWorkers;           //поле для запису кількості працівників фірми-виробника
    private int countCountry;           //поле для запису кількості країн, в яких продається бренд

    public Clothes() {                  //клас за замовчуванням
    }

    public Clothes(int id, String name, int quantity, String description, Double price, String category, Date dateCreation, String nameBrend, int countWorkers, int countCountry) {
        super(id, name, quantity, description, price, category);
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

    public void Show() {                                                        //метод виводу на екран полів об'єкта
        System.out.println(this);
    }
}
