/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicis_classe;

/**
 *
 * @author pedro
 * @param <T>
 */
public class UniCapsa<T> {
    
    protected T objecte;
    
    public boolean afegir(T c) {
        
        if (!esPlena()) {
            
            this.objecte = objecte;
            return true;
            
        }return false;
    }
    
    public T obtenir() {
        
        if(esPlena()) {
            return objecte;
            
        } return null;
    }
    
    public boolean buidar() {
        
        if(esPlena()) {
            
            this.objecte = null;
            return true;
        }return false;
    }
    
    public boolean esPlena() {
        
        return objecte != null;
    }

}
