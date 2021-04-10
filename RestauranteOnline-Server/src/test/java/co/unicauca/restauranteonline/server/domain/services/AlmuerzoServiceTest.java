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