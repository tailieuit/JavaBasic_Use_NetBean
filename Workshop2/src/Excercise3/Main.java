/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static Child_Person cper[] = new Child_Person[100];
    
    //Input
    public static void Input(){
        System.out.print("Input number person: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String y = sc.nextLine();
            System.out.println("Person " + (i+1) + " th");
            System.out.print("Input ID: ");
            String ID = sc.nextLine();
            System.out.print("Input Name: ");
            String Name = sc.nextLine();
            System.out.print("Input Gender: ");
            String Gender = sc.nextLine();
            System.out.print("Input ClassID: ");
            String ClassID = sc.nextLine();
            System.out.print("Input Mark: ");
            double Mark = sc.nextDouble();
            
            Child_Person c = new Child_Person(ClassID, Mark, ID, Name, Gender);
            cper[i] = c;
        }
    }
    
    //Output
    public static void Output(){
        System.out.println("List of person");
        System.out.println("ID" + "\t" +"Name"+ "\t" +"Gender"+ "\t" +"ClassID"+ "\t" +"Mark"+ "\t" +"Result");
        for (int i = 0; i < n; i++) {
            System.out.println(cper[i].getID()+"\t" + cper[i].getName()+"\t" + cper[i].getGender()+"\t" + cper[i].getClassID()+"\t" + cper[i].getMark()+"\t" + cper[i].Result());
        }
    }
    
    //Search
    public static void Search(String Name_Person){
        Name_Person = sc.nextLine();
        System.out.println("Person has name " + Name_Person + ":");
        System.out.println("ID" + "\t" +"Name"+ "\t" +"Gender"+ "\t" +"ClassID"+ "\t" +"Mark"+ "\t" +"Result");
        for (int i = 0; i < n; i++) {
            if(cper[i].getName().equals(Name_Person)){
                System.out.println(cper[i].getID()+"\t" + cper[i].getName()+"\t" + cper[i].getGender()+"\t" + cper[i].getClassID()+"\t" + cper[i].getMark()+"\t" + cper[i].Result());
            }
        }
    }
    public static void main(String[] args) {
        Input();
        Output();
        System.out.print("Input name person: ");
        String Name_Person = sc.nextLine();
        Search(Name_Person);
    }
}
