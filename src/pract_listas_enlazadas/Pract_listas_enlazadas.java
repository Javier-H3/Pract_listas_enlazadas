/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pract_listas_enlazadas;

import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class Pract_listas_enlazadas {

    public static void main(String[] args) {
        
        Lista lista = new Lista();
        
        byte opciones = 0;
        byte dato;
        
        
        while (opciones == 0) {
           opciones = (byte) Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1.Ingresar un nuevo dato al inicio "
                           + "\n2.Ingresar nuevo dato al final"
                           + "\n3.Borrar primer Nodo" 
                           + "\n4.Borrar ultimo Nodo"
                           + "\n5.Borrar Nodo especifico"
                           + "\n6.Buscar dato especifico"
                           + "\n7.Imprimir lista"
                           + "\n8.Salir"));
            switch (opciones) {
                case 1:
                      dato = (byte) Integer.parseInt(JOptionPane.showInputDialog(null, 
                              "¿Que dato desea ingresar?"));
                      lista.incertarInicio(dato); 
                      opciones = 0;
                    break;
                    
                case 2:
                    dato = (byte) Integer.parseInt(JOptionPane.showInputDialog(null, 
                              "¿Que dato desea ingresar?"));
                      lista.incertarFinal(dato);
                      opciones = 0;
                    break;
                    
                case 3:
                    lista.eliminarInicio();
                    System.out.println("Dato borrado exitosamente");
                    opciones = 0;
                    break;
                    
                case 4:
                    lista.eliminarFinal();
                    opciones = 0;
                    break;
                    
                case 5:
                    dato = (byte) Integer.parseInt(JOptionPane.showInputDialog(null, 
                              "¿Que dato desea Eliminar?"));
                    lista.eliminarDatoEspe(dato);
                    opciones = 0;
                    break;
                    
                case 6:
                    dato = (byte) Integer.parseInt(JOptionPane.showInputDialog(null, 
                              "¿Que dato desea Buscar?"));
                    
                    if (lista.buscarDato(dato) == true) {
                        JOptionPane.showMessageDialog(null,"El dato Si se encuentra en la lista: "+dato);
                        opciones = 0;
                    } else {
                        JOptionPane.showMessageDialog(null,"El dato No se encuentra en la lista: "+dato);
                        opciones = 0;
                    }
                    break;
                    
                case 7:
                    System.out.println("");
                    lista.mostrarLista();
                    opciones = 0;
                    break;
                    
                case 8:
                    opciones = 3;
                    break;
            }
            
        }
        
    }
    
}
