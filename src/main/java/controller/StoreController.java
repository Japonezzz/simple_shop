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
    private static ArrayList<Goods> goods;                              // our goods
    private static Double money;                                       //store wallet

    public StoreController() {
        this.goods = new ArrayList<Goods>();
        money = 0.0;
  }                                        //no parameters constructor

    public StoreController(ArrayList<Goods> goods) {
        this.goods = goods;
        money = 0.0;
    }

                                                                            //getters and setters of lists of goods


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



                                                                        //search goods by name (string) function
                                                                        //returns list of founded goods
        public static ArrayList<Goods> Search_in_category(ArrayList<Goods> goods, String to_find)
        {

        ArrayList<Goods> founded = new ArrayList<Goods>();       //founded products list

        if (to_find == "") {
            System.out.print("Search string is empty");             //returns null if search string was empty
            return null;
        }


        for (Goods g : goods) {
            if (g.getName().contains(to_find))
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

                                                                        //Supply function
        public static String Supply (Goods good)                        //returns string
        {
            if (good==null) {
                System.out.println("Nothing was supplied");
                return "Nothing was supplied";                                          //if taken good is null returns negative string
            }
           else if(good.getCategory()!= "")                                            //if taken good is a Computer
            {
                for_supply(good);
                System.out.println("Good was added successfully");
                return "Good was added successfully";
            }
            else {                                                                          // returns empty string if good type wasn't founded on store
              System.out.println("Wrong kind of good");
              return "";
          }

                                            //if good or quantity was added returns positive string

        }

                                                                        //Goods Sales function
        public static String Sale (Goods good)                          //returns string
        {

            if (good==null)
            {
                System.out.println("You have nothing to sale");
                return "You have nothing to sale";                      //if good is null returns negative string
            }

           else if(good.getCategory()!="")                               //if taken good is Cellphone
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
