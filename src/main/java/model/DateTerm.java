package model;

import java.util.Date;

//клас для запису терміну придатності продуктів

public class DateTerm {
    private Date dateCreating;              //поле для дати вироблення продукту
    private Double temperatureSave;         //поле для запису температури зберігання
    private int termSave;                   //поле для запису терміну придатності у місяцях

    public DateTerm() {                     //конструктор за замовчуванням
    }

    public DateTerm(Date dateCreating, Double temperatureSave, int termSave) {      //конструктор з параметрами
        this.dateCreating = dateCreating;
        this.temperatureSave = temperatureSave;
        this.termSave = termSave;
    }

    public Date getDateCreating() {
        return dateCreating;
    }

    public void setDateCreating(Date dateCreating) {
        this.dateCreating = dateCreating;
    }

    public Double getTemperatureSave() {
        return temperatureSave;
    }

    public void setTemperatureSave(Double temperatureSave) {
        this.temperatureSave = temperatureSave;
    }

    public int getTermSave() {
        return termSave;
    }

    public void setTermSave(int termSave) {
        this.termSave = termSave;
    }
}
