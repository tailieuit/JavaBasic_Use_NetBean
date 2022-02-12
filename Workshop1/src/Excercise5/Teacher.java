/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise5;

/**
 *
 * @author PC
 */
public class Teacher {
    String ID, Name, Gender, Address;
    int Grading;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getGrading() {
        return Grading;
    }

    public void setGrading(int Grading) {
        this.Grading = Grading;
    }

    public Teacher() {
    }

    public Teacher(String ID, String Name, String Gender, String Address, int Grading) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.Grading = Grading;
    }
    
    public double Slary(){
        return 1500*Grading;
    }
}
