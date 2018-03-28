package model;

import java.util.Date;

/**
 * Клас що зберігає дату створення товару, температуру зберігання
 * і термін придатності
 * @author
 * @version
 */

public class DateTerm {
    /** @param dateCreating дата виробництва товару */
    private Date dateCreating;
    /** @param temperatureSave температура зберігання товару */
    private Double temperatureSave;
    /** @param termSave тривалість зберігання товару у місяцях */
    private int termSave;                   //поле для запису терміну придатності у місяцях

    /** Конструктор за замовчуванням */
    public DateTerm() {                     //конструктор за замовчуванням
    }

    /** Конструктор з параметрами
     * Ініціалізує поля {@link DateTerm#dateCreating}, {@link DateTerm#temperatureSave},
     * {@link DateTerm#termSave},
     * @see DateTerm
     **/
    public DateTerm(Date dateCreating, Double temperatureSave, int termSave) {      //конструктор з параметрами
        this.dateCreating = dateCreating;
        this.temperatureSave = temperatureSave;
        this.termSave = termSave;
    }

    /** @return dateCreating метод повертає дату виробництва */
    public Date getDateCreating() {
        return dateCreating;
    }

    /** Приймає і встановлює дату створення товару
     *  @param dateCreating
     * */
    public void setDateCreating(Date dateCreating) {
        this.dateCreating = dateCreating;
    }

    /** @return temperatureSave метод повертає температуру зберігання */
    public Double getTemperatureSave() {
        return temperatureSave;
    }

    /** Приймає і встановлює температуру зберігання товару
     *  @param temperatureSave
     * */
    public void setTemperatureSave(Double temperatureSave) {
        this.temperatureSave = temperatureSave;
    }

    /** @return termSave метод повертає термін зберігання */
    public int getTermSave() {
        return termSave;
    }

    /** Приймає і встановлює термін зберігання товару
     *  @param termSave
     * */
    public void setTermSave(int termSave) {
        this.termSave = termSave;
    }
}
