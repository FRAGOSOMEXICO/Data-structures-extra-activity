/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap_sort;

/**
 *
 * @author biosh
 */
public class Nodo_float 
{

   public float dato_dentro;
   public  Nodo_float hijo_derecho;
   public  Nodo_float hijo_izquierdo;
     
   public Nodo_float(float dato)
   {
     this.dato_dentro=dato;
     this.hijo_derecho=null;
     this.hijo_izquierdo=null;
   } 

    /**
     * @return the dato_dentro
     */
    public float getDato_dentro() {
        return dato_dentro;
    }

    /**
     * @param dato_dentro the dato_dentro to set
     */
    public void setDato_dentro(float dato_dentro) {
        this.dato_dentro = dato_dentro;
    }

    /**
     * @return the hijo_derecho
     */
    public Nodo_float getHijo_derecho() {
        return hijo_derecho;
    }

    /**
     * @param hijo_derecho the hijo_derecho to set
     */
    public void setHijo_derecho(Nodo_float hijo_derecho) {
        this.hijo_derecho = hijo_derecho;
    }

    /**
     * @return the hijo_izquierdo
     */
    public Nodo_float getHijo_izquierdo() {
        return hijo_izquierdo;
    }

    /**
     * @param hijo_izquierdo the hijo_izquierdo to set
     */
    public void setHijo_izquierdo(Nodo_float hijo_izquierdo) {
        this.hijo_izquierdo = hijo_izquierdo;
    }
    
}
