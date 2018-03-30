package model.Technics;

import enums.CategoryType;
import enums.CellOperationSystem;

import java.util.ArrayList;

//клас мобільних телефонів з переліку технічних товарів. Насліує клас Technics

public class Cellphone extends Technics {
    private CellOperationSystem OS;
    private Double diagonal;
    private int timeWork;

    public Cellphone() {
    }

    public Cellphone(int id, String name, int quantity, String description, Double price, String category,
                     int guarantee, RAM ramSpecific, CPU cpuSpecific, String OS, Double diagonal, int timeWork) {
        super(id, name, quantity, description, price, category, guarantee, ramSpecific, cpuSpecific);
        this.OS = CellOperationSystem.valueOf(OS);
        this.diagonal = diagonal;
        this.timeWork = timeWork;
    }

    public CellOperationSystem getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = CellOperationSystem.valueOf(OS);
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

    public void Show() {
        System.out.println(DetailsInformation());
    }                               //метод виводу на екран полів об'єкта

    @Override
    public String DetailsInformation() {
        return "Назва товару: " + getName() +
                "\nКатегорія товару: " + getCategory() +
                "\nКількість товару: " + getQuantity() +
                "\nОпис товару: " + getDescription() +
                "\nЦіна товару: " + getPrice() + "$" +
                "\nГарантія: " + getGuarantee() +
                "\nRAM інформація: " + getRamSpecific() +
                "\nCPU інформація: " + getCpuSpecific() +
                "\nДіагональ: " + getDiagonal() +
                "\nЧас роботи: " + getTimeWork() + " год.";
    }
}
