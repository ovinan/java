/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculadorasimple;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oscar
 */
public class CalculadoraSimpleTest {
    
    public CalculadoraSimpleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class CalculadoraSimple.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int num1 = 0;
        int num2 = 0;
        int expResult = 0;
        int result = CalculadoraSimple.sumar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class CalculadoraSimple.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int num1 = 0;
        int num2 = 0;
        int expResult = 0;
        int result = CalculadoraSimple.restar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class CalculadoraSimple.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int num1 = 0;
        int num2 = 0;
        int expResult = 0;
        int result = CalculadoraSimple.multiplicar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class CalculadoraSimple.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int num1 = 0;
        int num2 = 0;
        double expResult = 0.0;
        double result = CalculadoraSimple.dividir(num1, num2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CalculadoraSimple.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculadoraSimple.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
