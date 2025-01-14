/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Vista;

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
public class ConsolaTest {
    
    public ConsolaTest() {
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
     * Test of pideNumero method, of class Consola.
     */
    @Test
    public void testPideNumero() {
        System.out.println("pideNumero");
        String pregunta = "";
        Consola instance = new Consola();
        float expResult = 0.0F;
        float result = instance.pideNumero(pregunta);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of muestraResultado method, of class Consola.
     */
    @Test
    public void testMuestraResultado() {
        System.out.println("muestraResultado");
        String texto = "";
        float resultado = 0.0F;
        Consola instance = new Consola();
        instance.muestraResultado(texto, resultado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menu method, of class Consola.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        Consola instance = new Consola();
        int expResult = 0;
        int result = instance.menu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
