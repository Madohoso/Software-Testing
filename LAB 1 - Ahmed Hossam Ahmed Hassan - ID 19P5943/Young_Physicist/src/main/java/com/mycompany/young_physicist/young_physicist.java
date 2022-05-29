/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.young_physicist;

import java.util.Scanner;

/**
 *
 * @author madoo
 */
public class young_physicist {
     public static boolean in_eq(int tot_fx,int tot_fy,int tot_fz){

        if (tot_fx==0 && tot_fy==0 && tot_fz==0){
            return true;
        }
        else{
            return false;
        }


    }

    public static void main(String[] args) {
     Scanner inp=new Scanner(System.in);
     int n=inp.nextInt();
        int x=0,y=0,z=0;
        while(n>0){
            x=x+ inp.nextInt();
            y=y+ inp.nextInt();
            z=z+ inp.nextInt();
            n=n-1;
        }
     boolean check=in_eq(x,y,z);
     if(check==true){
         System.out.println("YES");
     }
     else{
         System.out.println("NO");
     }

    }
}
