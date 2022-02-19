/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excercise1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyString ms = new MyString();
        System.out.println("1. TC = 1 - test f1()");
        System.out.println("2. TC = 2 - test f2()");
        System.out.print("Enter TC: ");
        int n = sc.nextInt();
        String y = sc.nextLine();
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        if(n==1){
            System.out.println("OUTPUT: " + ms.f1(s));
        }
        if(n==2){
            System.out.println("OUTPUT: " + ms.f2(s));
        }
    }
}
