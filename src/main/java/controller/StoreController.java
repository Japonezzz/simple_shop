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
    private static ArrayList<Cellphone> phones;
    private static ArrayList<Computer> comps;
    private static ArrayList<Sweets> sweets;
    private static ArrayList<Water> waters;
    private static ArrayList<SweetDrinks> drinks;
    private static ArrayList<Vegetables> veges;
    private static ArrayList<Clothes> cloth;
    private static Double money;

    public StoreController() {
        this.phones = new ArrayList<Cellphone>();
        this.comps = new ArrayList<Computer>();
        this.sweets = new ArrayList<Sweets>();
        this.waters = new ArrayList<Water>();
        this.drinks = new ArrayList<SweetDrinks>();
        this.veges = new ArrayList<Vegetables>();
        this.cloth = new ArrayList<Clothes>();
        money = 0.0;
  }

    public StoreController(ArrayList<Cellphone> phones, ArrayList<Computer> comps, ArrayList<Sweets> sweet,
                           ArrayList<Water> waters, ArrayList<SweetDrinks> drinks, ArrayList<Vegetables> veges, ArrayList<Clothes> cloth) {
        this.phones = phones;
        this.comps = comps;
        this.sweets = sweet;
        this.waters = waters;
        this.drinks = drinks;
        this.veges = veges;
        this.cloth = cloth;
        money = 0.0;
    }

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


   // public static void main(String[] args) {

    //    StoreController sc = new StoreController();
    //    sc.initialization();
      //  String s = "aaa";

     //   Goods gd = new Cellphone(0, "iPhone", 2, "Sell Phone from Apple", (double) 400, 12, new RAM(12, "DDR5"),
          //      new CPU(5, 1.2), "IOS", 5.2, 10);

     //   sc.Sale(gd);

   // }

    //void initialization(){
       // for (int i=0; i<3; i++)
        //    phones.add(new Cellphone(i, "iPhone", 20, "Sell Phone from Apple", (double) 400, 12, new RAM(12, "DDR5"),
        //            new CPU(5, 1.2), "IOS", 5.2, 10));
  //  }

        public static ArrayList<Goods> Search_in_category(ArrayList<Goods> goods, String to_find)
        {

        ArrayList<Goods> founded = new ArrayList<Goods>();

        if (to_find == "") {
            System.out.print("Search string is empty");
            return null;
        }


        for (Goods g : goods) {
            if (g.getName().contains(to_find))
                founded.add(g);
        }
            if(founded != null)
            {
                return founded;
            }
            else {
                System.out.print("Nothing of values was found");
                return null;
            }
        }


        public static String Supply (Goods good)
        {


            if (good==null) {
                System.out.println("Nothing was supplied");
                return "Nothing was supplied";
            }

          if(good instanceof Cellphone)
          {
              for (Cellphone ph: phones)
              {
                  if(ph.getId() == good.getId())
                  {
                      ph.setQuantity(ph.getQuantity() + good.getQuantity());
                  }
              }
              phones.add((Cellphone) good);
          }
           else if(good instanceof Computer)
            {
                for (Computer comp: comps) {
                    if(comp.getId() == good.getId())
                    {
                        comp.setQuantity(comp.getQuantity() + good.getQuantity());
                    }
                }
                comps.add((Computer) good);
            }
           else if(good instanceof Sweets)
            {
                for (Sweets sw: sweets) {
                    if(sw.getId() == good.getId())
                    {
                        sw.setQuantity(sw.getQuantity() + good.getQuantity());
                    }
                }
                sweets.add((Sweets) good);
            }
           else if(good instanceof Water)
            {
                for (Water wtr: waters) {
                    if(wtr.getId() == good.getId())
                    {
                        wtr.setQuantity(wtr.getQuantity() + good.getQuantity());
                    }
                }
                waters.add((Water) good);
            }
           else if(good instanceof SweetDrinks)
            {
                for (SweetDrinks sd: drinks) {
                    if(sd.getId() == good.getId())
                    {
                        sd.setQuantity(sd.getQuantity() + good.getQuantity());
                    }

                }
                drinks.add((SweetDrinks) good);
            }
           else if(good instanceof Vegetables)
            {
                for (Vegetables veg: veges) {
                    if(veg.getId() == good.getId())
                    {
                        veg.setQuantity(veg.getQuantity() + good.getQuantity());
                    }
                }
                veges.add((Vegetables) good);
            }
           else if(good instanceof Clothes)
            {
                for (Clothes cl: cloth) {
                    if(cl.getId() == good.getId())
                    {
                        cl.setQuantity(cl.getQuantity() + good.getQuantity());
                    }
                }
                cloth.add((Clothes) good);
            }
            else {
              System.out.println("Wrong kind of good");
              return "";
          }

          System.out.println("Good was added successfully");
          return "Good was added successfully";

        }


        public static String Sale (Goods good)
        {
            if (good==null)
            {
                System.out.println("You have nothing to sale");
                return "You have nothing to sale";
            }

            if(good instanceof Cellphone)
            {
                for (Cellphone ph: phones)
                {
                    if(ph.getId() == good.getId())
                    {
                        if(good.getQuantity() > ph.getQuantity())
                        {
                            System.out.println("We don't have such quantity in our store");
                            return "We don't have such quantity in our store";
                        }
                        else
                        {
                            ph.setQuantity(ph.getQuantity() - good.getQuantity());
                            money += ph.getPrice() * good.getQuantity();
                        }
                        break;
                    }
                    else
                    {
                        System.out.println("The good was not found in DB");
                        return "The good was not found in DB";
                    }
                }
            }
            else if(good instanceof Computer)
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
            else if(good instanceof Sweets)
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
            else if(good instanceof Water)
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
            else if(good instanceof SweetDrinks)
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
            else if(good instanceof Vegetables)
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
            else if(good instanceof Clothes)
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
                System.out.println("Wrong kind of good");
                return "Wrong kind of good";
            }

            System.out.println("Sell was successfully");
            return "Sell was successfully";
        }
}
