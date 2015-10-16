/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mispruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author percy
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }
    
    

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void MostrarListadoxFechas() {
     Eventos evento = new Eventos("PROGRAMACION JAVA","16/10/2015","AV.LAS TORRES CHORRILLOS UPSJB");
     String lista;
     lista=evento.ListarAlabeticamente();
    assertEquals(lista,"Hola");
        
        
    
    }

  
}
