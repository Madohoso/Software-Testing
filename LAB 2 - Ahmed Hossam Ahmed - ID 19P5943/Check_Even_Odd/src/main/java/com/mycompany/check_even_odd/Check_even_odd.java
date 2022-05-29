/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.check_even_odd;

import java.util.Scanner;

/**
 *
 * @author madoo
 */
public class Check_even_odd {
    public static String check_even_odd(double number) {
        if (number<0){
            return "neither even nor odd";
        }
        if (number%2==0){
            return "even";
        }
        else if(number%2==1){
            return "odd";
        }
        else{
            return "neither even nor odd";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        System.out.println(check_even_odd(number));
    }
}
