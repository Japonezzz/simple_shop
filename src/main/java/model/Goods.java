package model;

public abstract class Goods {

    //fields
    private int id;
    private String name;
    private int quantity;
    private String description;
    private Double price;

    //constructors
    public Goods() {
    }

    public Goods(int id, String name, int quantity, String description, Double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
    }


    //get set methodos for fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String GetListItem(){
        return this.name + " \t" + this.price + "$";
    }

    // abstract methods
    public abstract void Show();
}
