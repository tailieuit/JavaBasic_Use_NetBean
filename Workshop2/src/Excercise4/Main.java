/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static Child_Person cp[] = new Child_Person[100];
    
    //Input
    public static void Input(){
        System.out.print("Input number person: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String y = sc.nextLine();
            System.out.println("Person " +(i+1) + " th");
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
            cp[i] = c; 
        }
    } 
    
    //Output
    public static void Output(){
        System.out.println("List of person");
        System.out.println("ID" +"\t" +"Name" +"\t" +"Gender"+"\t"+"ClassID"+"\t"+"Mark"+"\t"+"Result");
        for (int i = 0; i < n; i++) {
            System.out.println(cp[i].Display());
        }
    }
    
    //Search
    public static void Search(String Class){
        Class = sc.nextLine();
        System.out.println("ID" +"\t" +"Name" +"\t" +"Gender"+"\t"+"ClassID"+"\t"+"Mark"+"\t"+"Result");
        for (int i = 0; i < n; i++) {
            if(cp[i].getClassID().equals(Class))
            {
                System.out.println(cp[i].Display());
            }
        }
    }
    public static void main(String[] args) {
        Input();
        Output();
        System.out.print("Input classid person: ");
        String Class = sc.nextLine();
        Search(Class);
    }
}
