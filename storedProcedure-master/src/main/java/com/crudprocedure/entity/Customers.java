package com.crudprocedure.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String Name;
    private String Lastname;
    private String Motherlastname;
    private String Address;
    private String Dateofbirth;
    private String Sex;

    public Customers() {
    }

    public Customers(String id, String name, String lastName, String motherLastName, String address, String dateOfBirth, String sex) {
        this.id = id;
        this.Name = name;
        this.Lastname = lastName;
        this.Motherlastname = motherLastName;
        this.Address = address;
        this.Dateofbirth = dateOfBirth;
        this.Sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastName) {
        Lastname = lastName;
    }

    public String getMotherlastname() {
        return Motherlastname;
    }

    public void setMotherlastname(String motherLastName) {
        Motherlastname = motherLastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(String dateOfBirth) {
        Dateofbirth = dateOfBirth;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", LastName='" + Lastname + '\'' +
                ", MotherLastName='" + Motherlastname + '\'' +
                ", Address='" + Address + '\'' +
                ", DateOfBirth=" + Dateofbirth +
                ", Sex='" + Sex + '\'' +
                '}';
    }
}
