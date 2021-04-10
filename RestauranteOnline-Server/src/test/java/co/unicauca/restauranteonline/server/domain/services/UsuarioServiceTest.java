/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.server.domain.services;

import co.unicauca.restauranteonline.commons.domain.Usuario;
import co.unicauca.restauranteonline.server.access.Factory;
import co.unicauca.restauranteonline.server.access.IUsuarioRepository;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis
 */
public class UsuarioServiceTest {

    public UsuarioServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    /**
     * Test of autenticarCustomer method, of class CustomerService.
     */
    @Test
    public void testAutenticarCustomer() {
        System.out.println("autenticarCustomer");
        String username = "mezcly08";
        String userpassword = "12345678";
        IUsuarioRepository repo = Factory.getInstance().getRepository();
        UsuarioService instance = new UsuarioService(repo);
        //CustomerService instance = null;
        boolean expResult = true;
        boolean result = instance.autenticarUsuario(username, userpassword);
        assertEquals(expResult, result);
        
        // Datos que no existen
        result = instance.autenticarUsuario("lma", "453");
        assertEquals(false, result);
    }
}