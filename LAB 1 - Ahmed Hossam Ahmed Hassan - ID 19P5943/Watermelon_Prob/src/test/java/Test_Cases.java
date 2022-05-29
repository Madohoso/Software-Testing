/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.watermelon_prob.watermelon_prob;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author madoo
 */
public class Test_Cases {
     @Test
    public void test0(){
        assertTrue(watermelon_prob.divided(6)==true);
    }
    @Test
    public void test1(){
        assertTrue(watermelon_prob.divided(2)==false);
    }
    @Test
    public void test2(){
        assertTrue(watermelon_prob.divided(9)==true);
    }

}
