/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.server.domain.services;

import co.unicauca.restauranteonline.commons.domain.Componente;
import co.unicauca.restauranteonline.server.access.Factory;
import co.unicauca.restauranteonline.server.access.IComponenteRepository;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AC
 */
public class ComponenteServiceTest {
    
    public ComponenteServiceTest() {
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
     * Test of CreateComponente method, of class ComponenteService.
     */
    @Test
    public void testCreateComponente() {
        
        Componente comp = new Componente();
       
        comp.setIdComponente(1112);
        comp.setIdRestaurante(1);
        comp.setNombreComponente("Arveja");
        comp.setTipoComponente("Entrada");
        comp.setIdtipoComponente(1);
        
        
        IComponenteRepository repo =  Factory.getInstance().getRepositoryComponente();
        ComponenteService instance = new ComponenteService(repo);
        String expResult = "Arveja";
        String result = instance.CreateComponente(comp);
        assertEquals(expResult, result);
        
        // Validar un dato erroneo
        comp.setNombreComponente("");
        result = instance.CreateComponente(comp);
        assertTrue(result.contains("BAD_REQUEST"));
    }
}
