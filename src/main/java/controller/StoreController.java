package controller;

import javafx.scene.control.Cell;
import model.*;
import model.Eating.SweetDrinks;
import model.Eating.Sweets;
import model.Eating.Vegetables;
import model.Eating.Water;
import model.Technics.Cellphone;
import model.Technics.Computer;
import model.Technics.CPU;
import model.Technics.RAM;

import java.util.ArrayList;

public class StoreController {
    private static ArrayList<Goods> goods;
    private static Double money;

    public StoreController() {
        this.goods = new ArrayList<Goods>();
        money = 0.0;
  }

    public StoreController(ArrayList<Goods> goods) {
        this.goods = goods;
        money = 0.0;
    }




    public static ArrayList<Goods> getGoods() {
        return goods;
    }

    public static void setGoods(ArrayList<Goods> goods) {
        StoreController.goods = goods;
    }

    public static Double getMoney() {
        return money;
    }

    public static void setMoney(Double money) {
        StoreController.money = money;
    }


    /**
     * Method for searching good by it's name in Store's List
      * @param goods List of all our goods in the Store
     * @param to_find String that user enters to find a good
     * @return ArrayList of goods which names consists entered letters
     */
        public static ArrayList<Goods> Search_in_category(ArrayList<Goods> goods, String to_find)
        {

        ArrayList<Goods> founded = new ArrayList<Goods>();       //founded products list

        if (to_find == "") {
            System.out.print("Search string is empty");             //returns null if search string was empty
            return null;
        }


        for (Goods g : goods) {
            if (g.getName().toLowerCase().contains(to_find.toLowerCase()))
                founded.add(g);                                         //adding founded by name goods to list
        }
            if(founded != null)
            {
                return founded;                                         //returns list of founded goods
            }
            else {
                System.out.print("Nothing of values was found");
                return null;                                                //returns null if nothing found
            }
        }

    /**
     * Method needed for Supply method - it adds quantity of supplied good to its quantity in the store
     * if there is no such good_id in DB it would add it automatically
     * It returns nothing, just making procedures
     * @param good any good
     */
        private static void for_supply(Goods good)
        {
            Boolean flag = false;
            for (Goods sw : goods) {
                if (sw.getId() == good.getId()) {
                    sw.setQuantity(sw.getQuantity() + good.getQuantity());
                    flag = true;
                    break;
                }
            }
            if (flag == false)
            {
                goods.add(good);
            }
        }

    /**
     * Method needed for Sale method - it decrease quantity of good in store for quantity of sold product
     * and increases shops wallet on sum of sold products
     *
     * @param good
     * @return if not enough quantity of product we want to sell negative string
     * @return  If the good was not founded in store DB negative string
     * @return  If sell was successful positive string
     */
        private static String for_sale(Goods good)
        {
        Boolean flag = false;
        for (Goods ph: goods)
        {
            if(ph.getId() == good.getId())                       //if it was founded on store's Cellphone list
            {
                if (good.getQuantity() > ph.getQuantity())        //if quantity of that kind of Cellphones is not enough to sell
                {
                    System.out.println("We don't have such quantity in our store");
                    return "We don't have such quantity in our store";
                } else {
                    ph.setQuantity(ph.getQuantity() - good.getQuantity());              //reduce the quantity of this kind of Cellphone on store
                    money += ph.getPrice() * good.getQuantity();                        //take payment on our storeWallet
                }
                flag = true;
                break;
            }
        }
        if(flag==false) {
            System.out.println("The good was not found in DB");                     //if good was not founded on our store
            return "The good was not found in DB";
        }
        System.out.println("Sell was successful");                                    //if transaction took place - returns positive string
        return "Sell was successful";
    }

    /**
     *  Method makes supply of any good in our store
      * @param good Any good of our store
     * @return String 1) If good is null it returns negative string
     * String 2) If good's category is not null it returns positive string
     * String 3) In other cases it returns negative string with error text
     */
        public static String Supply (Goods good)
        {
            if (good==null) {
                System.out.println("Nothing was supplied");
                return "Nothing was supplied";
            }
           else if(good.getCategory()!= null)
            {
                for_supply(good);
                System.out.println("Good was added successfully");
                return "Good was added successfully";
            }
            else {
              System.out.println("Wrong kind of good");
              return "";
          }

                                            //if good or quantity was added returns positive string

        }

    /**
     * Method makes direct sale of products
      * @param good any good of our store
     * @return if good is null it will be negative string
     * @return if product's category is not null it will be positive string
     * @return if such kind of good was not founded returns negative string with error text
     */
        public static String Sale (Goods good)
        {

            if (good==null)
            {
                System.out.println("You have nothing to sale");
                return "You have nothing to sale";                      //if good is null returns negative string
            }

           else if(good.getCategory()!= null)                               //if taken good is Cellphone
            {
               for_sale(good);
            }

            else {
                System.out.println("Wrong kind of good");                                   //if kind of good wasn't founded in store
                return "Wrong kind of good";
            }
            return "";
        }
}
