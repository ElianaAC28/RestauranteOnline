/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restauranteonline.server.domain.services;

import co.unicauca.restauranteonline.server.domain.services.ComponenteService;
import co.unicauca.restauranteonline.commons.domain.Componente;
import co.unicauca.restauranteonline.server.access.Factory;
import co.unicauca.restauranteonline.server.access.IComponenteRepository;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class ComponenteServiceTest {
    
    /**
     * Test of CreateComponente method, of class ComponenteService.
     */
    @Test
    public void testCreateComponente() {
        System.out.println("CreateComponente");
        Componente parComponente = new Componente();
        parComponente.setIdComponente(1998);
        parComponente.setIdRestaurante(1);
        parComponente.setNombreComponente("Arroz azul");
        parComponente.setIdtipoComponente(1);
        parComponente.setTipoComponente("Entrada");
        
        IComponenteRepository repo = Factory.getInstance().getRepositoryComponente();
        ComponenteService instance = new ComponenteService(repo);
        Integer expResult = 1998;
        String result = instance.CreateComponente(parComponente);
        assertEquals(expResult, result);
        
        parComponente.setNombreComponente("");
        result = instance.CreateComponente(parComponente);
        assertTrue(result.contains("BAD_REQUEST"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ListComponentes method, of class ComponenteService.
     */
    @Test
    public void testListComponentes() {
        System.out.println("ListComponentes");
        ComponenteService instance = new ComponenteService();
        List<Componente> expResult = null;
        List<Componente> result = instance.ListComponentes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
