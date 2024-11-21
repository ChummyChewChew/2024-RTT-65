package org.leorodriguez.model;

import jakarta.persistence.*;
@Entity
@Table(name="Users") //This is required
public class User {
    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY)
    private int userId;
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(unique=true)
    private String email;
    private String name;
    private String password;
    private String address;
    private String state;
    private String zipcode;

    public User() {
        email="";
        name="";
        password="";
        address="";
        state="";
        zipcode="";
    }

    public User(String email, String name, String password, String address,
                String state, String zipcode) {
        super();
        this.email = email;
        this.name = name;
        this.password = password;
        this.address = address;
        this.state = state;
        this.zipcode = zipcode;
    }

    public User(int userId, String email, String name, String password, String address,
                String state, String zipcode) {
        super();
        this.email = email;
        this.name = name;
        this.password = password;
        this.address = address;
        this.state = state;
        this.zipcode = zipcode;
        this.userId=userId;
    }

    @Override
    public String toString() {
        return "User [email=" + email + ", name=" + name + ", password="
                + password + ", address=" + address + ", state=" + state
                + ", zipcode=" + zipcode + "]";
    }

    @Override//This must be overridden because it will compare a reference to their space in memory
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result
                + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + userId;
        result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {//Again, it will compare its memory reference, not the values of the object
        if (this.toString().equals(o.toString())) {
            return true;
        }
        if (o instanceof User) {
            User other = (User) o;
            boolean sameId =(this.userId==other.getUserId());
            boolean sameEmail=(this.email.equals(other.getEmail()));
            boolean sameName=(this.name.equals(other.getName()));
            boolean samePassword=(this.password.equals(other.getPassword()));
            boolean sameAddress=(this.address.equals(other.getAddress()));
            boolean sameState=(this.state.equals(other.getState()));
            boolean sameZip=(this.zipcode.equals(other.getZipcode()));
            if(sameId && sameEmail && sameName && samePassword && sameAddress && sameState && sameZip)
                return true;
        }
        return false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

}