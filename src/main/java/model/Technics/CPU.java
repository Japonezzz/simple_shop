package model.Technics;

/**
 * Клас центрального процесора комп'ютерів і телефонів
 * @author
 * @version
 */

public class CPU {
    /** @param cores позначає кількість ядер центрального процесора */
    private int cores;
    /** @param frequency позначає максимальної частоти центрального процесора */
    private Double frequency;

    /** Конструктор за замовчуванням */
    public CPU() {
    }

    /** Конструктор з параметрами
     * Ініціалізує поля {@link CPU#cores}, {@link CPU#frequency}
     * @see CPU
     **/
    public CPU(int cores, Double frequency) {
        this.cores = cores;
        this.frequency = frequency;
    }

    /** @return cores метод повертає кількість ядер центрального процесора */
    public int getCores() {
        return cores;
    }

    /** Приймає і встановлює кількість ядер центрального процесора
     *  @param cores
     * */
    public void setCores(int cores) {
        this.cores = cores;
    }

    /** @return frequency метод повертає максимальну частоту центрального процесора */
    public Double getFrequency() {
        return frequency;
    }

    /** Приймає і встановлює максимальну частоту центрального процесора
     *  @param frequency
     * */
    public void setFrequency(Double frequency) {
        this.frequency = frequency;
    }

    /** Перегрузка методу toString */
    @Override
    public String toString() {
        return  "\n\tCores count: " + this.cores +
                "\n\tFrequency: " + this.frequency + "GHz";
    }
}
