/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author REDMA
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of getNumeroUno method, of class Calculadora.
     */
    @Test
    public void testGetNumeroUno() {
        System.out.println("getNumeroUno");
        Calculadora instance = new Calculadora();
        float expResult = 0.0F;
        float result = instance.getNumeroUno();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroUno method, of class Calculadora.
     */
    @Test
    public void testSetNumeroUno() {
        System.out.println("setNumeroUno");
        float numeroUno = 0.0F;
        Calculadora instance = new Calculadora();
        instance.setNumeroUno(numeroUno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroDos method, of class Calculadora.
     */
    @Test
    public void testGetNumeroDos() {
        System.out.println("getNumeroDos");
        Calculadora instance = new Calculadora();
        float expResult = 0.0F;
        float result = instance.getNumeroDos();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroDos method, of class Calculadora.
     */
    @Test
    public void testSetNumeroDos() {
        System.out.println("setNumeroDos");
        float numeroDos = 0.0F;
        Calculadora instance = new Calculadora();
        instance.setNumeroDos(numeroDos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
