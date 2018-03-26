package model.Subscription;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String email;
    private Date dateOfRegistration = new Date();
    private  boolean shouldsend;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public boolean isShouldsend() {
        return shouldsend;
    }

    public void setShouldsend(boolean shouldsend) {
        this.shouldsend = shouldsend;
    }

    public User(int id, String name, String email, Date dateOfRegistration, boolean shouldsend) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfRegistration = dateOfRegistration;
        this.shouldsend = shouldsend;
    }
    public User(){

    }

}
