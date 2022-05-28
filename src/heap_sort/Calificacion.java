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
public class Calificacion 
{
    private int index;
    private float calif;
  public Calificacion(int indice,float numero_float)
  {
      this.index=indice;
      this.calif=numero_float;
  }    

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the calif
     */
    public float getCalif() {
        return calif;
    }

    /**
     * @param calif the calif to set
     */
    public void setCalif(float calif) {
        this.calif = calif;
    }
}
