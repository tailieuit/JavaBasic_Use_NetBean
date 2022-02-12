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
public class Pupil {
    String ID, Name, ClassID;
    double Literature, Math;
    
    public String getID(){
        return ID;
    }
    
    public String getName(){
        return Name;
    }
    
    public String getClassID(){
        return ClassID;
    }
    
    public double getLiterature(){
        return Literature;
    }
    
    public double getMath(){
        return Math;
    }
    
    public void setID(String ID){
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setClassID(String ClassID) {
        this.ClassID = ClassID;
    }

    public void setLiterature(double Literature) {
        this.Literature = Literature;
    }

    public void setMath(double Math) {
        this.Math = Math;
    }
    
    public Pupil(){
        
    }

    public Pupil(String ID, String Name, String ClassID, double Literature, double Math) {
        this.ID = ID;
        this.Name = Name;
        this.ClassID = ClassID;
        this.Literature = Literature;
        this.Math = Math;
    }
    
    public double Result(){
        return (Literature + Math)/2;
    }
    
}
