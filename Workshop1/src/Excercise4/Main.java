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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pupil p[] = new Pupil[100];
        System.out.print("Input number pupil: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String y = sc.nextLine();
            System.out.println("Pupil " + (i+1) + " th");
            System.out.print("Input ID: ");
            String ID = sc.nextLine();
            System.out.print("Input Name: ");
            String Name = sc.nextLine();
            System.out.print("Input ClassID: ");
            String ClassID = sc.nextLine();
            System.out.print("Input Literature: ");
            double Literature = sc.nextDouble();
            System.out.print("Input Math: ");
            double Math = sc.nextDouble();
            
            Pupil pu = new Pupil(ID, Name, ClassID, Literature, Math);
            p[i] = pu;
        }
        
        // Display
        System.out.println("The list of pupil ");
        System.out.println("ID" + "\t" +"Name"+ "\t" +"ClassID"+ "\t" +"Literature"+ "\t" +"Math"+ "\t" +"Result");
        for (int i = 0; i < n; i++) {
            System.out.println(p[i].getID()+"\t"+p[i].getName()+"\t"+p[i].getClassID()+"\t"+p[i].getLiterature()+ "\t"+"\t"+p[i].getMath()+"\t"+p[i].Result());
        }
        
        //Highest result
        double highestResult = p[0].Result();
        for (int i = 0; i < n; i++) {
            if(p[i].Result() > highestResult){
                highestResult = p[i].Result();
            }
        }
        System.out.println("Pupil which has highest result: ");
        System.out.println("ID" + "\t" +"Name"+ "\t" +"ClassID"+ "\t" +"Literature"+ "\t" +"Math"+ "\t" +"Result");
        for (int i = 0; i < n; i++) {
            if(p[i].Result() == highestResult)
            System.out.println(p[i].getID()+"\t"+p[i].getName()+"\t"+p[i].getClassID()+"\t"+p[i].getLiterature()+ "\t"+"\t"+p[i].getMath()+"\t"+p[i].Result());
        }
    }
}
