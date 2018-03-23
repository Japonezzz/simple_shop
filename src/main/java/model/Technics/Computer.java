package model.Technics;

public class Computer extends Technics {
    private CPU gpuProc;
    private RAM gpuRAM;

    public Computer() {
    }

    public Computer(int id, String name, int quantity, String description, Double price, int guarantee, RAM ramSpecific, CPU cpuSpecific, CPU gpuProc, RAM gpuRAM) {
        super(id, name, quantity, description, price, guarantee, ramSpecific, cpuSpecific);
        this.gpuProc = gpuProc;
        this.gpuRAM = gpuRAM;
    }

    public CPU getGpuProc() {
        return gpuProc;
    }

    public void setGpuProc(CPU gpuProc) {
        this.gpuProc = gpuProc;
    }

    public RAM getGpuRAM() {
        return gpuRAM;
    }

    public void setGpuRAM(RAM gpuRAM) {
        this.gpuRAM = gpuRAM;
    }
}
