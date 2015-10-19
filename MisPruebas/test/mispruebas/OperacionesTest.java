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
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void Mostrarcomparativo() {
     Eventos even = new Eventos();
     
     even.setNombre("JAVA");
     //even.setFechainicio(12/10/2015);
     //even.setFechafin("12/10/2015");
     even.setLugar("LAS LOMAS - Choriilos");
     even.setCategoria("INFORMATICA");
     even.setDescripcion("descrip");
     even.setImagen("imagen");
   
    assertEquals(even.getNombre(),"JAVA");
    //assertEquals(even.getFechainicio(),"12/10/2015");  
    //assertEquals(even.getFechafin(),"12/10/2015");
    assertEquals(even.getLugar(),"LAS LOMAS - Choriilos");
    assertEquals(even.getCategoria(),"INFORMATICA");
    assertEquals(even.getDescripcion(),"descrip");
    assertEquals(even.getImagen(),"imagen");
    
    
    //fail("The test case is a prototype.");
       
    }

   @Test
    public void testDescripcion() {
        
    String descrp="ccccccccccccccccccccccccccccccc";
     //calcular la cantidad de caracteres ingresados   
    Operaciones cant =new Operaciones();
    String expresul="cccc";
    String result=cant.CantDescripcion(descrp);
    assertEquals(expresul,result);
    
    }
    
    @Test
    public void testFechainicio() {
    //Calcular si la fecha de inicio corresponde al formato    
    //java.util.Date= fechainicio="dd";
    Operaciones fechai = new Operaciones();
    String expresul="13/10/2015";
    //String result=fechai.DateInicio(fechainicio);
    
    
    
    }
    
    
    
    
    
}
