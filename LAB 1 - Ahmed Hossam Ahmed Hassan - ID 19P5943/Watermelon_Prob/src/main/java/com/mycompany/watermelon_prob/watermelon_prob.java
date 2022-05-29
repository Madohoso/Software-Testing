/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.watermelon_prob;

import java.util.Scanner;

/**
 *
 * @author madoo
 */
public class watermelon_prob {
    public static boolean divided(int num) {
        if(num %2==0 && num!=2){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
     Scanner inp=new Scanner(System.in);
     int number=inp.nextInt();
     boolean z=divided(number);
     if(z==true){
         System.out.println("yes");
     }
     else{
         System.out.println("no");
     }
    }
}
