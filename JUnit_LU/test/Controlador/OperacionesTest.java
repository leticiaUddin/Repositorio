/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

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
public class OperacionesTest {
    
    public OperacionesTest() {
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
     * Test of suma method, of class Operaciones.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        float numeroUno = 0.0F;
        float numeroDos = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.suma(numeroUno, numeroDos);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Operaciones.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        float numeroUno = 0.0F;
        float numeroDos = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.resta(numeroUno, numeroDos);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class Operaciones.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        float numeroUno = 0.0F;
        float numeroDos = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.multiplicacion(numeroUno, numeroDos);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class Operaciones.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        float numeroUno = 0.0F;
        float numeroDos = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.division(numeroUno, numeroDos);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
