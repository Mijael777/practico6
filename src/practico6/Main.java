/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico6;

/**
 *
 * @author Alumno
 */
public class Main {
     
    
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
               
        Cliente cliente=new Cliente("Dario","Lucero","Conlara","Pedernera 123",303939239,3838383);
        Cliente cliente2=new Cliente("Fabian","Gamarra","San Luis","Pastore 2345",301293529,265727272);
        Cliente cliente3=new Cliente("Jose","Lopez","San Luis","Illia 456",299929393,36372822);
        Directorio directorio=new Directorio();       
        directorio.agregarCliente(1232, cliente2);
        directorio.agregarCliente(4545, cliente);
        directorio.agregarCliente(5555, cliente3);
        
       directorio.buscarCliente(1232);
       directorio.borrarCliente(303939239);
       // directorio.agregarCliente(4356, cliente2);
       //directorio.agregarCliente(5765, cliente3);
       // directorio.buscarCliente(4356);
        
    }
    
}


