/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pract_listas_enlazadas;

public class Nodo {
    
    public byte dato;
    public Nodo siguiete;
    
    public Nodo(byte d){
        
        this.dato = d;  
    }
    
    public Nodo(byte d, Nodo n){ /* Me va a recibir un dato para el inicio y un
                                    dato para el nodo */                   
        this.dato = d;
        this.siguiete = n;
    }
}
