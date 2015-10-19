/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mispruebas;
import java.util.*;





/**
 *
 * @author percy
 */
public class Operaciones {
 //String mensaje;
 String des;

           
public String CantDescripcion(String des){
String respuesta;
String respuesta2;
Eventos cant = new Eventos();    
respuesta="debe ingresa menos caracteres";
respuesta2="Cantidad de caracteres correctos";
if (des.length()>=10){    
return respuesta;

//System.out.print("debe ingresa menos caracteres, total : "+des.length());

}
else
//{System.out.print("cantidad de caracteres correctos, total : "+des.length());}

return respuesta2;

  } }