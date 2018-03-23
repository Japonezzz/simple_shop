package model.Technics;

public class Cellphone extends Technics {
    private String OS;
    private Double diagonal;
    private int timeWork;

    public Cellphone() {
    }

    public Cellphone(int id, String name, int quantity, String description, Double price, int guarantee, RAM ramSpecific, CPU cpuSpecific, String OS, Double diagonal, int timeWork) {
        super(id, name, quantity, description, price, guarantee, ramSpecific, cpuSpecific);
        this.OS = OS;
        this.diagonal = diagonal;
        this.timeWork = timeWork;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Double diagonal) {
        this.diagonal = diagonal;
    }

    public int getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(int timeWork) {
        this.timeWork = timeWork;
    }
}
