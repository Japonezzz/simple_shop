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
    private static ArrayList<Cellphone> phones;                        //store phones list
    private static ArrayList<Computer> comps;                          //store computers list
    private static ArrayList<Sweets> sweets;                           //store sweets list
    private static ArrayList<Water> waters;                            //store waters list
    private static ArrayList<SweetDrinks> drinks;                      //store sweet drinks list
    private static ArrayList<Vegetables> veges;                        //store vegetables list
    private static ArrayList<Clothes> cloth;                           //store clothes list
    private static Double money;                                       //store wallet

    public StoreController() {
        this.phones = new ArrayList<Cellphone>();
        this.comps = new ArrayList<Computer>();
        this.sweets = new ArrayList<Sweets>();
        this.waters = new ArrayList<Water>();
        this.drinks = new ArrayList<SweetDrinks>();
        this.veges = new ArrayList<Vegetables>();
        this.cloth = new ArrayList<Clothes>();
        money = 0.0;
  }                                        //no parameters constructor

    public StoreController(ArrayList<Cellphone> phones,                    //constructor with parameters
                           ArrayList<Computer> comps, ArrayList<Sweets> sweet,
                           ArrayList<Water> waters, ArrayList<SweetDrinks> drinks,
                           ArrayList<Vegetables> veges, ArrayList<Clothes> cloth) {
        this.phones = phones;
        this.comps = comps;
        this.sweets = sweet;
        this.waters = waters;
        this.drinks = drinks;
        this.veges = veges;
        this.cloth = cloth;
        money = 0.0;
    }

                                                                            //getters and setters of lists of goods
    public ArrayList<Cellphone> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<Cellphone> phones) {
        this.phones = phones;
    }

    public ArrayList<Computer> getComps() {
        return comps;
    }

    public void setComps(ArrayList<Computer> comps) {
        this.comps = comps;
    }

    public ArrayList<Sweets> getSweet() {
        return sweets;
    }

    public void setSweet(ArrayList<Sweets> sweet) {
        this.sweets = sweet;
    }

    public ArrayList<Water> getWaters() {
        return waters;
    }

    public void setWaters(ArrayList<Water> waters) {
        this.waters = waters;
    }

    public ArrayList<SweetDrinks> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<SweetDrinks> drinks) {
        this.drinks = drinks;
    }

    public ArrayList<Vegetables> getVeges() {
        return veges;
    }

    public void setVeges(ArrayList<Vegetables> veges) {
        this.veges = veges;
    }

    public ArrayList<Clothes> getCloth() {
        return cloth;
    }

    public void setCloth(ArrayList<Clothes> cloth) {
        this.cloth = cloth;
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

                                                                        //Supply function
        public static String Supply (Goods good)                        //returns string
        {


            if (good==null) {
                System.out.println("Nothing was supplied");
                return "Nothing was supplied";                                          //if taken good is null
            }

          if(good instanceof Cellphone)                                                 //if taken good is a Cellphone
          {
              for (Cellphone ph: phones)
              {
                  if(ph.getId() == good.getId())
                  {
                      ph.setQuantity(ph.getQuantity() + good.getQuantity());            //adding supplied quantity to good if its id was founded on list
                  }
              }
              phones.add((Cellphone) good);                                             //adding good if its id wasn't founded in list
          }
           else if(good instanceof Computer)                                            //if taken good is a Computer
            {
                for (Computer comp: comps) {
                    if(comp.getId() == good.getId())
                    {
                        comp.setQuantity(comp.getQuantity() + good.getQuantity());
                    }
                }
                comps.add((Computer) good);
            }
           else if(good instanceof Sweets)                                               //if taken good is a Sweet
            {
                for (Sweets sw: sweets) {
                    if(sw.getId() == good.getId())
                    {
                        sw.setQuantity(sw.getQuantity() + good.getQuantity());
                    }
                }
                sweets.add((Sweets) good);
            }
           else if(good instanceof Water)                                               //if taken good is water
            {
                for (Water wtr: waters) {
                    if(wtr.getId() == good.getId())
                    {
                        wtr.setQuantity(wtr.getQuantity() + good.getQuantity());
                    }
                }
                waters.add((Water) good);
            }
           else if(good instanceof SweetDrinks)                                         //if taken good is Sweet Drink
            {
                for (SweetDrinks sd: drinks) {
                    if(sd.getId() == good.getId())
                    {
                        sd.setQuantity(sd.getQuantity() + good.getQuantity());
                    }

                }
                drinks.add((SweetDrinks) good);
            }
           else if(good instanceof Vegetables)                                          //if taken good is a Vegetable
            {
                for (Vegetables veg: veges) {
                    if(veg.getId() == good.getId())
                    {
                        veg.setQuantity(veg.getQuantity() + good.getQuantity());
                    }
                }
                veges.add((Vegetables) good);
            }
           else if(good instanceof Clothes)                                              //if taken good is Cloth
            {
                for (Clothes cl: cloth) {
                    if(cl.getId() == good.getId())
                    {
                        cl.setQuantity(cl.getQuantity() + good.getQuantity());
                    }
                }
                cloth.add((Clothes) good);
            }
            else {                                                                          // returns "" if good type wasn't founded on store
              System.out.println("Wrong kind of good");
              return "";
          }

          System.out.println("Good was added successfully");
          return "Good was added successfully";                                             //if good or quantity was added returns positive string

        }

                                                                        //Goods Sales function
        public static String Sale (Goods good)                          //returns string
        {
            if (good==null)
            {
                System.out.println("You have nothing to sale");
                return "You have nothing to sale";                      //if good is null returns negative string
            }

            if(good instanceof Cellphone)                               //if taken good is Cellphone
            {
                for (Cellphone ph: phones)
                {
                    if(ph.getId() == good.getId())                       //if it was founded on our Cellphone list
                    {
                        if(good.getQuantity() > ph.getQuantity())        //if quantity of that kind of Cellphones is not enough to sell
                        {
                            System.out.println("We don't have such quantity in our store");
                            return "We don't have such quantity in our store";
                        }
                        else
                        {
                            ph.setQuantity(ph.getQuantity() - good.getQuantity());              //reduce the quantity of this kind of Cellphone on store
                            money += ph.getPrice() * good.getQuantity();                        //take payment on our storeWallet
                        }
                        break;
                    }
                    else
                    {
                        System.out.println("The good was not found in DB");                     //if good we want to sell was not founded on our store
                        return "The good was not found in DB";
                    }
                }
            }
            else if(good instanceof Computer)                                                   //if taken good is Computer
            {
                for (Computer comp: comps)
                {
                    if(comp.getId() == good.getId())
                    {
                        if(good.getQuantity() > comp.getQuantity())
                        {
                            System.out.println("We don't have such quantity in our store");
                            return "We don't have such quantity in our store";
                        }
                        else
                            {
                            comp.setQuantity(comp.getQuantity() - good.getQuantity());
                            money += comp.getPrice() * good.getQuantity();
                        }
                        break;
                    }
                }
            }
            else if(good instanceof Sweets)                                                      //if taken good is Sweets
            {
                for (Sweets sw: sweets)
                {
                    if(sw.getId() == good.getId())
                    {
                        if(good.getQuantity() > sw.getQuantity())
                        {
                            System.out.println("We don't have such quantity in our store");
                            return "We don't have such quantity in our store";
                        }
                        else
                            {
                            sw.setQuantity(sw.getQuantity() - good.getQuantity());
                            money += sw.getPrice() * good.getQuantity();
                        }
                        break;
                    }
                }
            }
            else if(good instanceof Water)                                                         //if taken good is Water
            {
                for (Water wtr: waters)
                {
                    if(wtr.getId() == good.getId())
                    {
                        if(good.getQuantity() > wtr.getQuantity())
                        {
                            System.out.println("We don't have such quantity in our store");
                            return "We don't have such quantity in our store";
                        }
                        else
                            {
                            wtr.setQuantity(wtr.getQuantity() - good.getQuantity());
                            money += wtr.getPrice() * good.getQuantity();
                        }
                        break;
                    }
                }
            }
            else if(good instanceof SweetDrinks)                                                 //if taken good is Sweet Drink
            {
                for (SweetDrinks sd: drinks)
                {
                    if(sd.getId() == good.getId())
                    {
                        if(good.getQuantity() > sd.getQuantity())
                        {
                            System.out.println("We don't have such quantity in our store");
                            return "We don't have such quantity in our store";
                        }
                        else
                        {
                            sd.setQuantity(sd.getQuantity() - good.getQuantity());
                            money += sd.getPrice() * good.getQuantity();
                        }
                        break;
                    }
                }
            }
            else if(good instanceof Vegetables)                                                  //if taken good is Vegetable
            {
                for (Vegetables veg: veges) {
                    if(veg.getId() == good.getId())
                    {
                        if(good.getQuantity() > veg.getQuantity())
                        {
                            System.out.println("We don't have such quantity in our store");
                            return "We don't have such quantity in our store";
                        }
                        else
                        {
                            veg.setQuantity(veg.getQuantity() - good.getQuantity());
                            money += veg.getPrice() * good.getQuantity();
                        }
                        break;
                    }
                }
            }
            else if(good instanceof Clothes)                                                     //if taken good is Clothes
            {
                for (Clothes cl: cloth) {
                    if(cl.getId() == good.getId())
                    {
                        if(good.getQuantity() > cl.getQuantity())
                        {
                            System.out.println("We don't have such quantity in our store");
                            return "We don't have such quantity in our store";
                        }
                        else
                        {
                            cl.setQuantity(cl.getQuantity() - good.getQuantity());
                            money += cl.getPrice() * good.getQuantity();
                        }
                        break;
                    }
                }
            }
            else {
                System.out.println("Wrong kind of good");                                   //if kind of good wasn't founded in store
                return "Wrong kind of good";
            }

            System.out.println("Sell was successfully");                                    //if transaction took place - returns positive string
            return "Sell was successfully";
        }
}
