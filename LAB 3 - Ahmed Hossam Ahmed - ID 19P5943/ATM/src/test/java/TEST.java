/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.atm.ATM;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author madoo
 */
public class TEST {
     @Test
    public void test0() {
        assertTrue(ATM.transactions("Withdraw",4000) == "Please collect your money");
    }
    @Test
    public void test1() {
        assertTrue(ATM.transactions("Deposit",2000) == "Your Money has been successfully depsited");

    }
    @Test
    public void test2() {
        assertTrue(ATM.transactions("Deposit",8000) == "Your Money has been successfully depsited");

    }
    @Test
    public void test3() {
        assertTrue(ATM.transactions("Withdraw",10000) == "Insufficient Balance");
    }
    
}
    
 