/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atm;

import java.util.Scanner;

/**
 *
 * @author madoo
 */
public class ATM {
     public static String transactions(String op,int with_dep) {
        int balance=7000;
        if (op.equals("Withdraw")){
            if (balance >= with_dep) {
                balance = balance - with_dep;
                return "Please collect your money";
            }
            else {
                return "Insufficient Balance";
            }

        }
        else if(op.equals("Deposit")) {
            balance = balance + with_dep;
            return "Your Money has been successfully deposited";
        }

        return "not found this operation";
    }

        public static void main(String[] args) {
            int balance = 4000, withdraw, deposit;
            Scanner s = new Scanner(System.in);
            String  n = s.next();

        }

}
