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
public class Alumno
{
         /*primer casilla promedio ,segunda num de boleta,tercera carrera ,cuarta nombre y quinta numero de materias*/ 
             
   
   private float promedio;
   private int boleta;
   private String carrera;
   private String nombre;
   private int numero_materias;
   
   public Alumno (int boleta_1,float promedio_1,String nombre_1,String carrera_1,int numero_materias_1)
   {
       this.boleta=boleta_1;
       this.promedio=promedio_1;
       this.nombre=nombre_1;
       this.carrera=carrera_1;
       this.numero_materias=numero_materias_1;
   }
   
   
    /**
     * @return the promedio
     */
    public float getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    /**
     * @return the boleta
     */
    public int getBoleta() {
        return boleta;
    }

    /**
     * @param boleta the boleta to set
     */
    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the numero_materias
     */
    public int getNumero_materias() {
        return numero_materias;
    }

    /**
     * @param numero_materias the numero_materias to set
     */
    public void setNumero_materias(int numero_materias) {
        this.numero_materias = numero_materias;
    }
   
   
}
