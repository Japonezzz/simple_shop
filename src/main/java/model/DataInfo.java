package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Eating.SweetDrinks;
import model.Eating.Sweets;
import model.Eating.Vegetables;
import model.Eating.Water;
import model.Technics.CPU;
import model.Technics.Cellphone;
import model.Technics.Computer;
import model.Technics.RAM;

import java.util.ArrayList;
import java.util.Date;

/**
 * Клас, що зберігає у ArrayList список товарів
 * тобто фактично заміняє базу даних
 * @author
 * @version
 */

public class DataInfo {

    /** @param goods список товарів */
    private ArrayList<Goods> goods;

    /** Конструктор за замовчуванням
     * ініціалізує поле {@link DataInfo#goods}
     * @see DataInfo
     * */
    public DataInfo() {
        goods = TestData();
    }

    /** Конструктор з параметром приймає @param goods
     * ініціалізує поле {@link DataInfo#goods}
     * @see DataInfo
     * */
    public DataInfo(ArrayList<Goods> goods) {
        this.goods = goods;
    }

    /** присвоює полю goods масив товарів, який
     * повертає метод TestData
     * */
    public void InitTestData() {
        goods = TestData();
    }

    /** @param good додає до списку товарів новий товар */
    public void addGood(Goods good) {
        goods.add(good);
    }

    /** @param index видаляє товар зі списку за індексом */
    public void removeGood(int index) {
        goods.remove(index);
    }

    /** @return goods повертає список товарів */
    public ArrayList<Goods> getGoods() {
        return goods;
    }

    /** @param goods приймає і встановлює список товарів */
    public void setGoods(ArrayList<Goods> goods) {
        this.goods = goods;
    }

    /** @return test метод створює тестовий список товарів */
    private ArrayList<Goods> TestData(){
        ArrayList<Goods> test = new ArrayList<Goods>();
        test.add(new Water(3, "Dobra Voda", 10, "Voda z krana", (double)1, "Water"));
        test.add( new Cellphone(1, "iPhone", 20, "Sell Phone from Apple", (double) 400, "CellPhone",
                12, new RAM(12, "DDR5"), new CPU(5, 1.2),
                "IOS", 5.2, 10));
        test.add(new Computer(2, "DELL", 15, "Famous NoteBook in the world", (double)800, "Computer", 12,
                new RAM(12, "DDR5"), new CPU(5, 7.2),
                new CPU(2, 5.0), new RAM(4, "DDR4")));
        test.add(new SweetDrinks(4, "Dobra Voda z limonom", 10, "Voda z krana", (double)1, "SweetDrinks",
                new DateTerm(new Date(2018,01,20), (double)27,
                        12)));
        test.add( new Sweets(5, "Romashka", 10, "Mnogo kroxmalia", (double)1, "Sweets",
                new DateTerm(new Date(2018,03,20), (double)22,
                        2)));
        test.add(new Vegetables(6, "Kartoha", 10, "Vkusno", (double)1, "Vegetables",
                new DateTerm(new Date(2018,03,20), (double)15,
                        4), "best of the best"));
        test.add(new Clothes(7, "Krosovki", 10, "Kloviu brend", (double)1,"Clothes",
                new Date(2018, 02, 20), "Adibas",                 2000, 20));
        return test;
    }

    /** @return categories встановлює і повертає список категорій */
    public static ObservableList<String> getCategories() {
        ObservableList<String> categories = FXCollections.observableArrayList("Усі категорії", "PC", "Смартфони", "Одяг", "Овочі", "Вода", "Солодка вода", "Солодощі");
        return categories;
    }
}
