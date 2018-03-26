package model.Technics;

import model.Goods;

public abstract class Technics extends Goods {
    private int guarantee;                      // поле для гарантії (місяці)
    private RAM ramSpecific;                    // поле типу оперативної пам'яті (DDR1, DDR2 чи інше)
    private CPU cpuSpecific;                    // поле характеристик центрального процесора

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
