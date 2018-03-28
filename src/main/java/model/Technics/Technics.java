package model.Technics;

import model.Goods;

/**
 * Абстрактний клас для різної техніки
 * @author
 * @version
 */

public abstract class Technics extends Goods {
    /** @param guarantee термін гарантійного зобов'язання у місяцях */
    private int guarantee;
    /** @param ramSpecific тип оперативної пам'яті */
    private RAM ramSpecific;
    /** @param cpuSpecific тип процесора */
    private CPU cpuSpecific;

    /** Конструктор за замовчуванням */
    public Technics() {
    }

    /** Конструктор з параметрами
     * Ініціалізує поля {@link Technics#id}, {@link Technics#name}, {@link Technics#quantity},
     * {@link Technics#description}, {@link Technics#price}, {@link Technics#category},
     * {@link Technics#guarantee}, {@link Technics#ramSpecific}, {@link Technics#cpuSpecific}
     * @see Technics
     **/
    public Technics(int id, String name, int quantity, String description, Double price, String category, int guarantee, RAM ramSpecific, CPU cpuSpecific) {
        super(id, name, quantity, description, price, category);
        this.guarantee = guarantee;
        this.ramSpecific = ramSpecific;
        this.cpuSpecific = cpuSpecific;
    }

    /** @return guarantee метод повертає термін гарантії */
    public int getGuarantee() {
        return guarantee;
    }

    /** Приймає і встановлює термін гарантії
     *  @param guarantee
     * */
    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    /** @return getRamSpecific метод повертає тип оперативної пам'яті */
    public RAM getRamSpecific() {
        return ramSpecific;
    }

    /** Приймає і встановлює тип оперативної пам'яті
     *  @param ramSpecific
     * */
    public void setRamSpecific(RAM ramSpecific) {
        this.ramSpecific = ramSpecific;
    }

    /** @return getCpuSpecific метод повертає тип процесора */
    public CPU getCpuSpecific() {
        return cpuSpecific;
    }

    /** Приймає і встановлює тип процесора
     *  @param cpuSpecific
     * */
    public void setCpuSpecific(CPU cpuSpecific) {
        this.cpuSpecific = cpuSpecific;
    }
}
