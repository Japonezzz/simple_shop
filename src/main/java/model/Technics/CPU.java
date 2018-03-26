package model.Technics;

//клас для опису центрального процесора пристрою - CPU

public class CPU {
    private int cores;                              //поле для запису кількості ядер процесора
    private Double frequency;                       //поле для запису робочої частоти процесора

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

    @Override                                                   //перегрузка методу toString()
    public String toString() {
        return  "\n\tCores count: " + this.cores +
                "\n\tFrequency: " + this.frequency + "GHz";
    }
}
