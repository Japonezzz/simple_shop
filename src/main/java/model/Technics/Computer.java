package model.Technics;

//клас комп'ютерів з переліку технічних товарів. Наслідується від абстрактного класу Tchnics

public class Computer extends Technics {
    private CPU gpuProc;                    //поле опису графічного адаптера. Реалізовано, оскільки в батьківському класі (Technics) такого поля немає
    private RAM gpuRAM;                     //поле обсягу відеопам'яті графічного прискорювача. Реалізовано, оскільки в батьківському класі (Technics) такого поля немає

    public Computer() {
    }

    public Computer(int id, String name, int quantity, String description, Double price, int guarantee, RAM ramSpecific, CPU cpuSpecific, CPU gpuProc, RAM gpuRAM) {
        super(id, name, quantity, description, price, guarantee, ramSpecific, cpuSpecific);   //тут заповняються поля, унаслідувані від батьківського класу
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

    public void Show() {
        System.out.println(this);
    }                               //метод виводу на екран полів об'єкта

    @Override
    public String toString() {                                                     //перегрузка метода toString()
        return "Name: " + this.getName() +
                "\nQuantity: " + this.getQuantity() +
                "\nDescription: " + this.getDescription() +
                "\nPrice: " + this.getPrice() + " $" +
                "\nGuarantee: " + this.getGuarantee() + " month" +
                "\nRAM information:" + this.getRamSpecific() +
                "\nCPU information:" + this.getCpuSpecific() +
                "\nGPU RAM information: " + this.getGpuRAM() +
                "\nGPU CPU information: " + this.getGpuProc();
    }
}
