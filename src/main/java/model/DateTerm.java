package model;

import java.util.Date;

public class DateTerm {
    private Date dateCreating;
    private Double temperatureSave;
    private int termSave;

    public DateTerm() {
    }

    public DateTerm(Date dateCreating, Double temperatureSave, int termSave) {
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
