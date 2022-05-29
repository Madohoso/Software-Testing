/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.check_max_min;

/**
 *
 * @author madoo
 */
public class check_max_min {
     public static double Max(double arr[]) {
        double max=arr[0];
        for(int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static double Min(double arr[]) {
        double min=arr[0];
        for(int i=0;i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        double array[] = {12, 30, 2,98,42, 55, 60, 77, 82, 91, 102};
        double max=Max(array);
        double min=Min(array);
        System.out.println(max);
        System.out.println(min);

    }
}
