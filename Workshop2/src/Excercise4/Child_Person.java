/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise4;

/**
 *
 * @author PC
 */
public class Child_Person extends Person{
    String ClassID;
    double Mark;

    public String getClassID() {
        return ClassID;
    }

    public void setClassID(String ClassID) {
        this.ClassID = ClassID;
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(double Mark) {
        this.Mark = Mark;
    }

    public Child_Person() {
    }

    public Child_Person(String ClassID, double Mark, String ID, String Name, String Gender) {
        super(ID, Name, Gender);
        this.ClassID = ClassID;
        this.Mark = Mark;
    }

    @Override
    public String Result() {
        String s;
        if(Mark>5){
            s = "Pass";
        }
        else
        {
            s = "Slip";
        }
        return s;
    }
    
    public String Display(){
        return ID + "\t" + Name + "\t" + Gender + "\t" + ClassID + "\t" + Mark + "\t" + Result();
    }
}
