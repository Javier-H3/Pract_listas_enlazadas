/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pract_listas_enlazadas;

import javax.swing.JOptionPane;

public class Lista {
    
    public Nodo inicio, fin;
    
    public Lista(){
        inicio = null;
        fin = null;
        
    }
    
    ///Metodo para agregar un nodo al inicio de la lista
    public void incertarInicio(byte elem){
        //Creando el nodo:
        inicio = new Nodo(elem, inicio);
        
        if (fin == null) {
            fin = inicio;     
        }   
    }
    
    ///Metodo para consultar si la lista esta vacia
    public boolean listaVacia(){
        if (inicio==null) {
            return true;
        } 
        return false;
    }
    
    ///Metodo para agregar nodo al final de la lista
    public void incertarFinal(byte elem){
        if (!listaVacia()) { ///Si no esta vacia
            fin.siguiete = new Nodo(elem);
            fin = fin.siguiete;
        }else{
            inicio = fin = new Nodo(elem);
        }
    }
    
    ///Metodo para mostrar la lista
    public void mostrarLista(){
      Nodo aux = inicio; /// Lo utilizo para recorrer la lista
      
      while(aux != null){
          ///System.out.println( );
          System.out.print("["+aux.dato+"]"+"---->"); 
          aux = aux.siguiete; /// aux va estar siendo cargado con el proximo dato mientras exista
      }
    }
    
    ///Metodo para eliminar el inicio de los nodos
    public void eliminarInicio(){
        if (!listaVacia()) {
            Nodo aux = inicio.siguiete;
            inicio = null;
            inicio = aux;
        }else{
            JOptionPane.showMessageDialog(null,"No existe lista bro :(");
        }
    }
    
    ///Metodo para eliminar el final de los nodos
    public void eliminarFinal(){
        if (!listaVacia()) {
            Nodo aux = inicio;
            
            while (aux.siguiete != fin) {                
                aux = aux.siguiete; /// Me recorre la lista hasta el final
            }
            fin = aux;
            fin.siguiete = null;
        }else{
            JOptionPane.showMessageDialog(null,"No existe lista bro :(");
        }
    }
    
    ///Metodo para buscar un elemento
    public boolean buscarDato(byte elem){
        Nodo aux = inicio;
        
        while (aux != null && aux.dato != elem) {            
            aux = aux.siguiete;
        }
        return aux != null;
    }
    
    ///Metodo para eliminar un nodo especifico de la lista
    public void eliminarDatoEspe(byte elem){
            
            if (!listaVacia()) {
                if (inicio == fin && elem ==inicio.dato) { /// valoro si solo existe un nodo y tambien si es el elemento que busco
                    inicio=fin=null;///Si es el caso borro la lista
                    
                }else if (elem == inicio.dato) {
                    inicio=inicio.siguiete;
                    
                }else{
                    Nodo anterior, aux;
                    anterior = inicio;
                    aux = inicio.siguiete;
                    
                    while (aux != null && aux.dato != elem) {                        
                        anterior = anterior.siguiete;
                        aux = aux.siguiete;
                    }
                    
                    if (aux != null) {
                        anterior.siguiete = aux.siguiete;
                        
                         if (aux==fin) {
                              
                            fin = anterior;
                        }
                    }
                }
  
        }else{
                JOptionPane.showMessageDialog(null,"No existe lista bro :(");
            }
          
        }
    }
    
