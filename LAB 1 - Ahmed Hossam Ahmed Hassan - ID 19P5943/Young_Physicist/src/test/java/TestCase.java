/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author madoo
 */
import com.mycompany.young_physicist.young_physicist;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
public class TestCase {
     @Test
    public void test0(){
        assertTrue(young_physicist.in_eq(0,0,0)==true);
    }
    @Test
    public void test1(){
        assertTrue(young_physicist.in_eq(3,0,0)==false);
    }
    @Test
    public void test2(){
        assertTrue(young_physicist.in_eq(0,3,0)==false);
    }
    @Test
    public void test3(){
        assertTrue(young_physicist.in_eq(0,0,3)==false);
    }
    public void test4(){
        assertTrue(young_physicist.in_eq(-3,0,3)==false);

    }
    @Test
    public void test5(){
        assertTrue(young_physicist.in_eq(4,0,-3)==false);
    }
    @Test
    public void test6(){
        assertTrue(young_physicist.in_eq(-4,3,0)==false);
    }
    @Test
    public void test7(){
        assertTrue(young_physicist.in_eq(3,-4,0)==false);
    }
    @Test
    public void test8(){
        assertTrue(young_physicist.in_eq(0,3,-4)==false);
    }
    @Test
    public void test9(){
        assertTrue(young_physicist.in_eq(0,-3,4)==false);
    }
}
  