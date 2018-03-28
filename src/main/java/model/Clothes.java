package model;

import java.util.Date;

/**
 * Абстрактний клас для одягу
 * @author
 * @version
 */

public class Clothes extends Goods {
    /** @param dateCreation дата виробництва предмету одягу */
    private Date dateCreation;
    /** @param nameBrend поле для запису назви бренду */
    private String nameBrend;
    /** @param countWorkers поле для запису кількості працівників фірми-виробника */
    private int countWorkers;
    /** @param countCountry поле для запису кількості країн, в яких продається бренд */
    private int countCountry;

    /** Конструктор за замовчуванням */
    public Clothes() {                  //клас за замовчуванням
    }

    /** Конструктор з параметрами
     * Ініціалізує поля {@link Clothes#id}, {@link Clothes#name}, {@link Clothes#quantity},
     * {@link Clothes#description}, {@link Clothes#price}, {@link Clothes#category},
     * {@link Clothes#dateCreation}, {@link Clothes#countWorkers}, {@link Clothes#countCountry}
     * @see Clothes
     **/
    public Clothes(int id, String name, int quantity, String description, Double price, String category, Date dateCreation, String nameBrend, int countWorkers, int countCountry) {
        super(id, name, quantity, description, price, category);
        this.dateCreation = dateCreation;
        this.nameBrend = nameBrend;
        this.countWorkers = countWorkers;
        this.countCountry = countCountry;
    }

    /** @return getDateCreation метод повертає дату виробництва */
    public Date getDateCreation() {
        return dateCreation;
    }

    /** Приймає і встановлює дату виробництва
     *  @param dateCreation
     * */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    /** @return getDateCreation метод повертає назву бренду */
    public String getNameBrend() {
        return nameBrend;
    }

    /** Приймає і встановлює дату виробництва
     *  @param nameBrend
     * */
    public void setNameBrend(String nameBrend) {
        this.nameBrend = nameBrend;
    }

    /** @return getDateCreation метод повертає кількість працівників фірми-виробника */
    public int getCountWorkers() {
        return countWorkers;
    }

    /** Приймає і встановлює кількість працівників фірми-виробника
     *  @param countWorkers
     * */
    public void setCountWorkers(int countWorkers) {
        this.countWorkers = countWorkers;
    }

    /** @return getDateCreation метод повертає кількість країн, в якій продається бренд */
    public int getCountCountry() {
        return countCountry;
    }

    /** Приймає і встановлює кількість країн, в якій продається бренд
     *  @param countCountry
     * */
    public void setCountCountry(int countCountry) {
        this.countCountry = countCountry;
    }

    /** Перегрузка методу toString */
    public void Show() {                                                        //метод виводу на екран полів об'єкта
        System.out.println(DetailsInformation());
    }

    @Override
    public String DetailsInformation() {
        return "Назва товару: " + getName() +
                "\nКатегорія товару: " + getCategory() +
                "\nКількість товару: " + getQuantity() +
                "\nОпис товару: " + getDescription() +
                "\nЦіна товару: " + getPrice() + "$" +
                "\nБренд: " + getNameBrend() +
                "\nК-сть працівників: " + getCountWorkers() +
                "\nК-сть країн-працівників: " + getCountCountry();
    }
}
