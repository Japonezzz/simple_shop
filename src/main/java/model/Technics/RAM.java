package model.Technics;

import enums.MemoryType;

/**
 * Клас оперативної пам'яті комп'ютерів і телефонів
 * @author
 * @version
 */

public class RAM {
    /** @param volume обсяг оперативної пам'яті */
    private int volume;
    /** @param ramType тип оперативної пам'яті */
    private MemoryType ramType;

    /** Конструктор за замовчуванням */
    public RAM() {

    }

    /** Конструктор з параметрами
     * Ініціалізує поля {@link RAM#volume}, {@link RAM#ramType}
     * @see RAM
     **/
    public RAM(int volume, String ramType) {
        this.volume = volume;
        this.ramType = MemoryType.valueOf(ramType);
    }

    /** @return volume метод повертає обсяг оперативної пам'яті */
    public int getVolume() {
        return volume;
    }

    /** Приймає і встановлює обсяг оперативної пам'яті
     *  @param volume
     * */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /** @return ramType метод повертає тип оперативної пам'яті */
    public MemoryType getRamType() {
        return ramType;
    }

    /** Приймає і встановлює тип оперативної пам'яті
     *  @param ramType
     * */
    public void setRamType(String ramType) {
        this.ramType = MemoryType.valueOf(ramType);
    }

    /** Перегрузка методу toString */
    @Override
    public String toString() {                                      //перегрузка метода toString()
        return "\n\tVolume of memory: " + this.volume +
                "\n\tMemoryType: " + this.ramType.toString();
    }
}
