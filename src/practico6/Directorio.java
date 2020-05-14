/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
/**
 *
 * @author Alumno
 */
public class Directorio {

    public Directorio() {
    }

       
    private TreeMap<Long ,Cliente> dir=new TreeMap<>();
    
    
    public void agregarCliente(long telefono, Cliente cliente){
      dir.putIfAbsent(telefono, cliente);
        System.out.println("Se ha agregado al cliente: "+cliente.getNombre()+" "+cliente.getApellido());
    
    }
    
    
    public void buscarCliente(long telefono ){
    dir.get(telefono);
       
    }
    
    
    public Set<Long> buscarTelefono(String apellido){
     HashSet<Long> telefonos=new HashSet<>();  
     
     Set<Long> tels=dir.keySet(); 
     
     Iterator it= tels.iterator();
     
     while (it.hasNext()){
     Long telefono=(Long)it.next();
     Cliente c=dir.get(telefono);
     
     if (c.getApellido().equals(apellido)){ 
      telefonos.add(telefono);
     }
     } //fin de while
     
     
     return telefonos;
         
    }
    
    
    
    
     public List<Cliente> buscarClientes(String ciudad){
     ArrayList<Cliente> clientes=new ArrayList<>(); 
     
     Set<Long> tels=dir.keySet(); 
     
     Iterator it= tels.iterator();
     
     while (it.hasNext()){
      Long telefono=(Long)it.next();
     Cliente c=dir.get(telefono);
     
     if (c.getCiudad().equals(ciudad)){ 
     clientes.add(c);
     }
     } //fin del while 
     
     return clientes;
             
    }
        
    
    public void borrarCliente(long dni){
    dir.remove(dni);
    System.out.println("Se ha borrado al cliente con dni: "+dni);  
    }
}


