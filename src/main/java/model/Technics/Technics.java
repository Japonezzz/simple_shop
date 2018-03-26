package model.Technics;

import model.Goods;

//абстрактний клас для товарів технічного напрямку. Наслідується від абстрактного клсу Goods(товари)

public abstract class Technics extends Goods {
    private int guarantee;                                              //поле гарантійного терміну в місяцях
    private RAM ramSpecific;                                            //поле для запису обсягу ОЗУ. У поле записуються об'єкти класу RAM(оперативної пам'яті)
    private CPU cpuSpecific;                                            //поле для запису частоти центрального процесеора пристрою. У поле записуються об'єкти класу CPU(центрального процесора)

    public Technics() {
    }

    public Technics(int id, String name, int quantity, String description, Double price, int guarantee, RAM ramSpecific, CPU cpuSpecific) {
        super(id, name, quantity, description, price);
        this.guarantee = guarantee;
        this.ramSpecific = ramSpecific;
        this.cpuSpecific = cpuSpecific;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    public RAM getRamSpecific() {
        return ramSpecific;
    }

    public void setRamSpecific(RAM ramSpecific) {
        this.ramSpecific = ramSpecific;
    }

    public CPU getCpuSpecific() {
        return cpuSpecific;
    }

    public void setCpuSpecific(CPU cpuSpecific) {
        this.cpuSpecific = cpuSpecific;
    }
}
