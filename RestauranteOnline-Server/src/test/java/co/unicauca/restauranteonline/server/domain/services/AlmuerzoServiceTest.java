/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.server.domain.services;

import co.unicauca.restauranteonline.server.domain.services.AlmuerzoService;
import co.unicauca.restauranteonline.server.access.Factory;
import co.unicauca.restauranteonline.commons.domain.Almuerzo;
import co.unicauca.restauranteonline.server.access.IAlmuerzoRepository;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class AlmuerzoServiceTest {
    
   
    /**
     * Test of findAlmuerzo method, of class AlmuerzoService.
     */
    @Test
    public void testFindAlmuerzo() throws Exception {
        System.out.println("findAlmuerzo");
        String idAlmuerzo = "";
        AlmuerzoService instance = null;
        Almuerzo expResult = null;
        Almuerzo result = instance.findAlmuerzo(idAlmuerzo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAlmuerzo method, of class AlmuerzoService.
     */
    @Test
    public void testUpdateAlmuerzo() throws Exception {
        System.out.println("updateAlmuerzo");
        String idAlmuerzo = "";
        AlmuerzoService instance = null;
        Almuerzo expResult = null;
        Almuerzo result = instance.updateAlmuerzo(idAlmuerzo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListAlmuerzos method, of class AlmuerzoService.
     */
    @Test
    public void testListAlmuerzos() {
        System.out.println("ListAlmuerzos");
        /*AlmuerzoService instance = null;
        List<Almuerzo> expResult = null;
        List<Almuerzo> result = instance.ListAlmuerzos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
      
    }

    /**
     * Test of CreateAlmuerzoID method, of class AlmuerzoService.
     */
    @Test
    public void testCreateAlmuerzoID() {
        System.out.println("CreateAlmuerzoID");
        Almuerzo parAlmuerzo = new Almuerzo();
        parAlmuerzo.setIdAlmuerzo("122");
        parAlmuerzo.setRestId("1");
        parAlmuerzo.setCostoAlm("10000");
        
        IAlmuerzoRepository repo = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService instance = new AlmuerzoService(repo);
        String expResult = "122";
        String result = instance.CreateAlmuerzoID(parAlmuerzo);
        assertEquals(expResult, result);
        

        // Validar un dato erroneo
        parAlmuerzo.setIdAlmuerzo("");
        result = instance.CreateAlmuerzoID(parAlmuerzo);
        assertTrue(result.contains("BAD_REQUEST"));
    }

    /**
     * Test of CreateAlmuerzo method, of class AlmuerzoService.
     */
    @Test
    public void testCreateAlmuerzo() {
        System.out.println("CreateAlmuerzo");
        Almuerzo parAlmuerzo = new Almuerzo();
        parAlmuerzo.setIdAlmuerzo("122");
        parAlmuerzo.setComp("28");
        parAlmuerzo.setIdComp("4");
        
        IAlmuerzoRepository repo = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService instance = new AlmuerzoService(repo);
        String expResult = "122";
        String result = instance.CreateAlmuerzo(parAlmuerzo);
        assertEquals(expResult, result);
        

        // Validar un dato erroneo
        parAlmuerzo.setIdAlmuerzo("");
        result = instance.CreateAlmuerzo(parAlmuerzo);
        assertTrue(result.contains("BAD_REQUEST"));
    }
    
}
