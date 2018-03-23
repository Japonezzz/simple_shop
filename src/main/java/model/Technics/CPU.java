package model.Technics;

public class CPU {
    private int cores;
    private Double frequency;

    public CPU() {
    }

    public CPU(int cores, Double frequency) {
        this.cores = cores;
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public Double getFrequency() {
        return frequency;
    }

    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }
}
