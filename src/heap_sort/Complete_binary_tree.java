/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap_sort;

import Heap_sort_app.HACE_PROGRAMA;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author biosh
 */
public class Complete_binary_tree {
           
    /**
     * @return the matriz_sin_ceros
     */
    public ArrayList<Float> getMatriz_sin_ceros() {
        return matriz_sin_ceros;
    }

    /**
     * @param matriz_sin_ceros the matriz_sin_ceros to set
     */
    public void setMatriz_sin_ceros(ArrayList<Float> matriz_sin_ceros) {
        this.matriz_sin_ceros = matriz_sin_ceros;
    }
  private ArrayList<Float> matriz_sin_ceros=new ArrayList<>();           
 private Nodo raiz_de_arbol;
 private Nodo_float raiz_float_arbol;
    private int[] para_hacer_arbol= new int[90];
    ArrayList<Integer> lista_2= new ArrayList<Integer>(); 
    public static int[] transduce (ArrayList<Integer> ingresa_el_usuario)
    {
      int []  resultado = new int[ingresa_el_usuario.size()];
        
        for (int i = 0; i < ingresa_el_usuario.size(); i++)
        {
        resultado[i]=ingresa_el_usuario.get(i);
        }
  
        for (int j = 0; j < 10; j++)
        {
    //System.out.printf("  %3d",+resultado[j]);    
        }
        
      return resultado;  
    }
                                                                     /* INDEX SE USA EN RECURSIVIDAD*/
    // Function to print tree nodes in InOrder fashion 
    public void inOrder(Nodo nodo_raiz) 
    { 
        if (nodo_raiz != null) { 
            inOrder(nodo_raiz.getHijo_izquierdo()); 
     //       System.out.print(nodo_raiz.getDato_dentro() + " "); 
            inOrder(nodo_raiz.getHijo_derecho()); 
        } 
    } 
     public  ArrayList<Float> para_transmir_promedios= new ArrayList<>();
     private String boleta=new String();    
     private String promedio=new String();
     private String materias=new String();
     private String nombre=new String();    
     private String super_cadenotaxD=new String();
     private ArrayList<String> solucion_de_problema= new ArrayList<String>();
    // public ArrayList<Object> solucion_de_problema= new ArrayList<>();
     
     public Calificacion parameter_en_matriz;         
     private float[] prom_y_index =new float[1000];
     private int cantidad =0;        
      
            private float promedio_para_array=0;
                 private String sexo=new String(); 
    public void hace_matriz_alumnos(int numero_alumnos)
    {
              setCantidad(numero_alumnos);
              ArrayList<String> nombres_mujer_inicial= new ArrayList<String>();
              ArrayList<String> nombres_mujer_final= new ArrayList<String>();
              ArrayList<String> nombres_hombre_inicial= new ArrayList<String>();
              ArrayList<String> nombres_hombre_final= new ArrayList<String>();
              ArrayList<String> apellidos_maternos= new ArrayList<String>();
              ArrayList<String> apellidos_paternos= new ArrayList<String>();
          
              nombres_mujer_inicial.add(0, "Paola");
              nombres_mujer_inicial.add(1, "Mary");
              nombres_mujer_inicial.add(2, "Luz");
              nombres_mujer_inicial.add(3, "Gabriela");
              nombres_mujer_inicial.add(4, "Lorena");
              nombres_mujer_inicial.add(5, "Fabiola");
              nombres_mujer_inicial.add(6, "Fernanda");
              nombres_mujer_inicial.add(7, "Abigail");
              nombres_mujer_inicial.add(8, "Adalis");
              nombres_mujer_inicial.add(9, "Adela");
              nombres_mujer_inicial.add(10, "Alisson");
              nombres_mujer_inicial.add(11, "Alizee");
              nombres_mujer_inicial.add(12, "Allegra");
              nombres_mujer_inicial.add(13, "Alma");
              nombres_mujer_inicial.add(14, "Alondra");
              nombres_mujer_inicial.add(15, "Soledad");
              nombres_mujer_inicial.add(16, "Solcire");
              nombres_mujer_inicial.add(17, "Sol");
              nombres_mujer_inicial.add(18, "Sofia");
              nombres_mujer_inicial.add(19, "Siria");
              nombres_mujer_inicial.add(20, "Siomara");
              nombres_mujer_inicial.add(21, "Shantal");
              nombres_mujer_inicial.add(22, "Shani");
              nombres_mujer_inicial.add(23, "Shaan");
              nombres_mujer_inicial.add(24, "Selma");
              nombres_mujer_inicial.add(25, "Selina");
              nombres_mujer_inicial.add(26, "Selene");
              nombres_mujer_inicial.add(27, "Roxana");
              nombres_mujer_inicial.add(28, "Rosina");
              nombres_mujer_inicial.add(29, "Rosario");
              nombres_mujer_inicial.add(30, "Rosalia");
              nombres_mujer_inicial.add(31, "Rosalba");
              nombres_mujer_inicial.add(32, "Rosa");
              nombres_mujer_inicial.add(33, "Rosario");
              nombres_mujer_inicial.add(34, "Romalena");
              nombres_mujer_inicial.add(35, "Rocio");
              nombres_mujer_inicial.add(36, "Renata");
              nombres_mujer_inicial.add(37, "Regina");
              nombres_mujer_inicial.add(38, "Raquel");
              nombres_mujer_inicial.add(39, "Paz");
              nombres_mujer_inicial.add(40, "Patricia");
              nombres_mujer_inicial.add(41, "Pamela");
              nombres_mujer_inicial.add(42, "Odette");
              nombres_mujer_inicial.add(43, "Kyoko");
              nombres_mujer_inicial.add(44, "Noelia");
              nombres_mujer_inicial.add(45, "Nina");
              nombres_mujer_inicial.add(46, "Nicole");
              nombres_mujer_inicial.add(47, "Naya");
              nombres_mujer_inicial.add(48, "Natalie");
              nombres_mujer_inicial.add(49, "Naomi");
              nombres_mujer_inicial.add(50, "Nara");
              
              nombres_mujer_final.add(0,"Montserrat");
              nombres_mujer_final.add(1,"Narela");
              nombres_mujer_final.add(2,"Nancy");
              nombres_mujer_final.add(3,"Nalleli");
              nombres_mujer_final.add(4,"Nair");
              nombres_mujer_final.add(5,"Naila");
              nombres_mujer_final.add(6,"Nadia");
              nombres_mujer_final.add(7,"Monica");
              nombres_mujer_final.add(8,"Miriam");
              nombres_mujer_final.add(9,"Miranda");
              nombres_mujer_final.add(10,"Minna");
              nombres_mujer_final.add(11,"Minerva");
              nombres_mujer_final.add(12,"Milka");
              nombres_mujer_final.add(13,"Milenka");
              nombres_mujer_final.add(14,"Milena");
              nombres_mujer_final.add(15,"Mildred");
              nombres_mujer_final.add(16,"Miel");
              nombres_mujer_final.add(17,"Michelle");
              nombres_mujer_final.add(18,"Mia");
              nombres_mujer_final.add(19,"Merida");
              nombres_mujer_final.add(20,"Mercedes");
              nombres_mujer_final.add(21,"Melinda");
              nombres_mujer_final.add(22,"Melisa");
              nombres_mujer_final.add(23,"Mayte");
              nombres_mujer_final.add(24,"Maya");
              nombres_mujer_final.add(25,"Maximina");
              nombres_mujer_final.add(26,"Mauren");
              nombres_mujer_final.add(27,"Marysol");
              nombres_mujer_final.add(28,"Mary");
              nombres_mujer_final.add(29,"Martina");
              nombres_mujer_final.add(30,"Martha");
              nombres_mujer_final.add(31,"Marissa");
              nombres_mujer_final.add(32,"Marina");
              nombres_mujer_final.add(33,"Marietta");
              nombres_mujer_final.add(34,"Alitzel");
              nombres_mujer_final.add(35,"Grecia");
              nombres_mujer_final.add(36,"Josefina");
              nombres_mujer_final.add(37,"Margot");
              nombres_mujer_final.add(38,"Marcia");
              nombres_mujer_final.add(39,"Mara");
              nombres_mujer_final.add(40,"Malvina");
              nombres_mujer_final.add(41,"Maggie");
              nombres_mujer_final.add(42,"Lucia");
              nombres_mujer_final.add(43,"Lucina");
              nombres_mujer_final.add(44,"Lucero");
              nombres_mujer_final.add(45,"Lizeth");
              nombres_mujer_final.add(46,"Lizbeth");
              nombres_mujer_final.add(47,"Lissette");
              nombres_mujer_final.add(48,"Victoria");
              nombres_mujer_final.add(49,"Linda");
              nombres_mujer_final.add(50,"Lily");
              
              nombres_hombre_inicial.add(0,"Aaron");
              nombres_hombre_inicial.add(1,"Abdel");
              nombres_hombre_inicial.add(2,"Abdiel");
              nombres_hombre_inicial.add(3,"Fernando");
              nombres_hombre_inicial.add(4,"Abraham");
              nombres_hombre_inicial.add(5,"Alan");
              nombres_hombre_inicial.add(6,"Alvaro");
              nombres_hombre_inicial.add(7,"Amador");
              nombres_hombre_inicial.add(8,"Amando");
              nombres_hombre_inicial.add(9,"Armando");
              nombres_hombre_inicial.add(10,"Aldahir");
              nombres_hombre_inicial.add(11,"Aram");
              nombres_hombre_inicial.add(12,"Ariel");
              nombres_hombre_inicial.add(13,"Basilio");
              nombres_hombre_inicial.add(14,"Brandon");
              nombres_hombre_inicial.add(15,"Bruno");
              nombres_hombre_inicial.add(16,"Carmelo el mesero");
              nombres_hombre_inicial.add(17,"Pol! Poliester");
              nombres_hombre_inicial.add(18,"Carlo");
              nombres_hombre_inicial.add(19,"Carlos");
              nombres_hombre_inicial.add(20,"Casiano");
              nombres_hombre_inicial.add(21,"Casio");
              nombres_hombre_inicial.add(22,"Milton");
              nombres_hombre_inicial.add(23,"Nefta");
              nombres_hombre_inicial.add(24,"Alejandro");
              nombres_hombre_inicial.add(25,"Celso");
              nombres_hombre_inicial.add(26,"Christian");
              nombres_hombre_inicial.add(27,"Cid");
              nombres_hombre_inicial.add(28,"Cirilo");
              nombres_hombre_inicial.add(29,"Claudio");
              nombres_hombre_inicial.add(30,"Clemente");
              nombres_hombre_inicial.add(31,"Colin");
              nombres_hombre_inicial.add(32,"Conan el barbaro xD");
              nombres_hombre_inicial.add(33,"Connor");
              nombres_hombre_inicial.add(34,"Cornelio");
              nombres_hombre_inicial.add(35,"Crescencio");
              nombres_hombre_inicial.add(36,"Cristiano");
              nombres_hombre_inicial.add(37,"Cristonal Colon");
              nombres_hombre_inicial.add(38,"Cruz");
              nombres_hombre_inicial.add(39,"Daniel");
              nombres_hombre_inicial.add(40,"Dante");
              nombres_hombre_inicial.add(41,"Jose");
              nombres_hombre_inicial.add(42,"Gabriel");
              nombres_hombre_inicial.add(43,"Juan");
              nombres_hombre_inicial.add(44,"La dendicion xD");
              nombres_hombre_inicial.add(45,"David");
              nombres_hombre_inicial.add(46,"Maicol xD");
              nombres_hombre_inicial.add(47,"Demostenes");
              nombres_hombre_inicial.add(48,"Luis");
              nombres_hombre_inicial.add(49,"Gerardo");
              nombres_hombre_inicial.add(50,"Ludwig");
              
              nombres_hombre_final.add(0,"Domicio");
              nombres_hombre_final.add(1,"Domingo");
              nombres_hombre_final.add(2,"Dominic");
              nombres_hombre_final.add(3,"Donaldo");
              nombres_hombre_final.add(4,"Donovan");
              nombres_hombre_final.add(5,"Dylan");
              nombres_hombre_final.add(6,"Ebo");
              nombres_hombre_final.add(7,"Eddie");
              nombres_hombre_final.add(8,"Edgar");
              nombres_hombre_final.add(9,"Edgardo");
              nombres_hombre_final.add(10,"Edison");
              nombres_hombre_final.add(11,"Edsel");
              nombres_hombre_final.add(12,"Enon");
              nombres_hombre_final.add(13,"Enrico");
              nombres_hombre_final.add(14,"Enrique");
              nombres_hombre_final.add(15,"Epifanio");
              nombres_hombre_final.add(16,"Erasmo");
              nombres_hombre_final.add(17,"Esteban");
              nombres_hombre_final.add(18,"Eduardo");
              nombres_hombre_final.add(19,"Edwin");
              nombres_hombre_final.add(20,"Fabiano");
              nombres_hombre_final.add(21,"Farbicio");
              nombres_hombre_final.add(22,"Owen");
              nombres_hombre_final.add(23,"Falco");
              nombres_hombre_final.add(24,"Fantino");
              nombres_hombre_final.add(25,"Roberto");
              nombres_hombre_final.add(26,"Miguel");
              nombres_hombre_final.add(27,"Felipe");
              nombres_hombre_final.add(28,"Fermin");
              nombres_hombre_final.add(29,"Genaro");
              nombres_hombre_final.add(30,"German");
              nombres_hombre_final.add(31,"Gilberto");
              nombres_hombre_final.add(32,"Gio");
              nombres_hombre_final.add(33,"Hector");
              nombres_hombre_final.add(34,"Heber");
              nombres_hombre_final.add(35,"Igorchas xD");
              nombres_hombre_final.add(36,"Isaac");
              nombres_hombre_final.add(37,"Isidro");
              nombres_hombre_final.add(38,"Israel");
              nombres_hombre_final.add(39,"Ivan");
              nombres_hombre_final.add(40,"Javier");
              nombres_hombre_final.add(41,"Jaziel");
              nombres_hombre_final.add(42,"Jesus");
              nombres_hombre_final.add(43,"Juventino xD");
              nombres_hombre_final.add(44,"John Lennon");
              nombres_hombre_final.add(45,"Dross");
              nombres_hombre_final.add(46,"Sheldon");
              nombres_hombre_final.add(47,"Rajesh");
              nombres_hombre_final.add(48,"Howard");
              nombres_hombre_final.add(49,"Bill");
              nombres_hombre_final.add(50,"Leonard");
              
              apellidos_maternos.add(0, "Garcia");
              apellidos_maternos.add(1, "Hernandez");
              apellidos_maternos.add(2, "Torres");
              apellidos_maternos.add(3, "Cruz");
              apellidos_maternos.add(4, "Rosas");
              apellidos_maternos.add(5, "Vanegas");
              apellidos_maternos.add(6, "Viveros");
              apellidos_maternos.add(7, "Valdez");
              apellidos_maternos.add(8, "Arandas");
              apellidos_maternos.add(9, "Aguirre");
              apellidos_maternos.add(10, "Aguilar");
              apellidos_maternos.add(11, "Aguayo");
              apellidos_maternos.add(12, "Gomez");
              apellidos_maternos.add(13, "Curiel");
              apellidos_maternos.add(14, "Varela");
              apellidos_maternos.add(15, "Valdez");
              apellidos_maternos.add(16, "Vanegas");
              apellidos_maternos.add(17, "Espinoza");
              apellidos_maternos.add(18, "Cabrero");
              apellidos_maternos.add(19, "Vordero");
              apellidos_maternos.add(20, "Del rio");
              apellidos_maternos.add(21 ,"Maldonado");
              apellidos_maternos.add(22, "Gelatino");
              apellidos_maternos.add(23, "Gordolfo");
              apellidos_maternos.add(24, "Martinez");
              apellidos_maternos.add(25, "Castanieda");
              apellidos_maternos.add(26, "Angeles");
              apellidos_maternos.add(27, "Lagillo");
              apellidos_maternos.add(28, "Gongora");
              apellidos_maternos.add(29, "Herrera");
              apellidos_maternos.add(30, "Guzman");
              apellidos_maternos.add(31, "Sanchez");
              apellidos_maternos.add(32, "Montanio");
              apellidos_maternos.add(33, "Andraca");
              apellidos_maternos.add(34, "Galan");
              apellidos_maternos.add(35, "Garcia");
              apellidos_maternos.add(36, "Pizano");
              apellidos_maternos.add(37, "Rodriguez");
              apellidos_maternos.add(38, "Acevedo");
              apellidos_maternos.add(39, "Gomez");
              apellidos_maternos.add(40, "Diaz");
              apellidos_maternos.add(41, "Casado");
              apellidos_maternos.add(42, "Funez");
              apellidos_maternos.add(43, "Valencia");
              apellidos_maternos.add(44, "Ruiz");
              apellidos_maternos.add(45, "Saldania");
              apellidos_maternos.add(46, "Herrera");
              apellidos_maternos.add(47, "Gonzales");
              apellidos_maternos.add(48, "Aldatz");
              apellidos_maternos.add(49, "Franco");
              apellidos_maternos.add(50, "Gutierrez");
              
              apellidos_paternos.add(0,"Barrera");
              apellidos_paternos.add(1,"Barrientos");
              apellidos_paternos.add(2,"Cisneros");
              apellidos_paternos.add(3,"Llanos");
              apellidos_paternos.add(4,"Villalobos");
              apellidos_paternos.add(5,"Campos");
              apellidos_paternos.add(6,"Filizola");
              apellidos_paternos.add(7,"Favela");
              apellidos_paternos.add(8,"Sandoval");
              apellidos_paternos.add(9,"Bobadilla");
              apellidos_paternos.add(10,"Parra");
              apellidos_paternos.add(11,"Bojalil");
              apellidos_paternos.add(12,"Bolio");
              apellidos_paternos.add(13,"Padilla");
              apellidos_paternos.add(14,"Sanchez");
              apellidos_paternos.add(15,"Aburto");
              apellidos_paternos.add(16,"Rodriguez");
              apellidos_paternos.add(17,"Gardunio");
              apellidos_paternos.add(18,"Noronia");
              apellidos_paternos.add(19,"Obrador");
              apellidos_paternos.add(20,"Lopez");
              apellidos_paternos.add(21,"Vargas");
              apellidos_paternos.add(22,"Cabral");
              apellidos_paternos.add(23,"Burgos");
              apellidos_paternos.add(24,"Fragoso");
              apellidos_paternos.add(25,"Mercado");
              apellidos_paternos.add(26,"Ortiz");
              apellidos_paternos.add(27,"Camacho");
              apellidos_paternos.add(28,"Calva");
              apellidos_paternos.add(29,"Calleja");
              apellidos_paternos.add(30,"Calderon");
              apellidos_paternos.add(31,"Colmenero");
              apellidos_paternos.add(32,"Alfaro");
              apellidos_paternos.add(33,"Salgado");
              apellidos_paternos.add(34,"Serrano");
              apellidos_paternos.add(35,"Navarro");
              apellidos_paternos.add(36,"Fernandez");
              apellidos_paternos.add(37,"De cetina");
              apellidos_paternos.add(38,"Brito");
              apellidos_paternos.add(39,"De leon");
              apellidos_paternos.add(40,"Carranza");
              apellidos_paternos.add(41,"Adan");
              apellidos_paternos.add(42,"Nuniez");
              apellidos_paternos.add(43,"Morales");
              apellidos_paternos.add(44,"Villegas");
              apellidos_paternos.add(45,"Mendoza");
              apellidos_paternos.add(46,"Negrete");
              apellidos_paternos.add(47,"Chapela");
              apellidos_paternos.add(48,"Chavez");
              apellidos_paternos.add(49,"Chico");
              apellidos_paternos.add(50,"Sabido");
                Random rand = new Random(); 
             String[][] nuevo_array=new String[numero_alumnos][7];
           //  float[] prom_y_index =new float[numero_alumnos];
            //  String[][] igualar=new String[5][numero_alumnos];  
              
              /*primer casilla promedio ,segunda num de boleta,tercera carrera ,cuarta nombre y quinta numero de materias*/ 
              //promedio float numboleta int ,carera string nombre string num de materias int 
              boolean decide_sexo_alumno = ThreadLocalRandom.current().nextBoolean(); 
              double randomValue = 6.0 + (10.0 - 6.0) * rand.nextDouble();    
              /* HACER UNA COPIA EN UN DYNAMIC ARRAY DE STRINGS */
             
              for (int i = 0; i < numero_alumnos; i++) 
              {
                  for (int j = 0; j < 6; j++)
                  {
                      
                      if(j==0)
                      {
                        /* DAR BOLETA*/ 
                        Random boleta = new Random();
                      //  double random_double = Math.random() * (max - min + 1) + min; 
                        
                        int max=2021;
                        int min=2012;
                         int anio = ThreadLocalRandom.current().nextInt(min, max + 1);
                         int inter = ThreadLocalRandom.current().nextInt(40, 70 + 1);
                         int pen = ThreadLocalRandom.current().nextInt(1, 9 + 1);
                         int ultimo = ThreadLocalRandom.current().nextInt(10, 80 + 1);
                          
                       nuevo_array[i][j]=Integer.toString(anio)+Integer.toString(inter)+Integer.toString(pen)+"0"+Integer.toString(ultimo)+"  ";
             
                       }
                      
                        else if (j==1)
                       {
                              /* promedio*/
                         Random promedio = new Random();
                         DecimalFormat formato1 = new DecimalFormat("#.0");
                           
                         float min= 6.0f;
                         float max=9.9f;
                         
                         float prom=((float ) (min+promedio.nextFloat()*(max-min)));
                         prom_y_index[i]=prom;
                         para_transmir_promedios.add(i,prom);
                                 
                         
                         
                         nuevo_array[i][j]=formato1.format(prom)+"  ";   
                  
                       }
                         else if (j==2)
                         {
                            int materias = ThreadLocalRandom.current().nextInt(1, 12 + 1);
                             if (Integer.toString(materias).length()==1)
                             {
                              nuevo_array[i][j]=Integer.toString(materias)+"  ";
                                 setMaterias(nuevo_array[i][j]);
                                 
                             }else if (Integer.toString(materias).length()==2)
                               {
                               nuevo_array[i][j]=Integer.toString(materias)+" ";  
                                 setMaterias(nuevo_array[i][j]);
                               
                               }
                         } else if (j==3) 
                          {
                               if (Integer.toString(i).length()==1) 
                               {
                               nuevo_array[i][j]=Integer.toString(i)+"  ";
                                  
                               }else if (Integer.toString(i).length()==2) 
                                {
                                 nuevo_array[i][j]=Integer.toString(i)+" ";
                                }
                             
                              
                              
                          }else if (j==4) 
                            {/* carga academica*/
                                
                              
                               /* carrera*/
                              int carrera = new Random().nextInt();
                              //int decidecarr=1+(carrera *(4-1));
                             int decidecarr=rand.nextInt(4);
                   
                             // int decidecarr =(int)( Math.random() * (4-1+1)-1);
                              if (decidecarr==0) 
                              {
                                   nuevo_array[i][j]=" Ing.Telematica  ";
                              }else if (decidecarr==1) 
                              {
                                   nuevo_array[i][j]=" Ing.Bionica     ";
                              }else if (decidecarr==2) 
                              {
                                   nuevo_array[i][j]=" Ing.Mecatronica ";
                              }else if (decidecarr==3) 
                              {
                                   nuevo_array[i][j]=" Ing.en Energia  ";
                              }
                             }else if (j==5) 
                              {/* carga academica*/
                                     boolean rand_bool1 = ThreadLocalRandom.current().nextBoolean(); 
                 
                   if (rand_bool1==true)
                   {
                     setSexo("hombre"); 
                     int nombrehom = new Random().nextInt();
                     int nom1=rand.nextInt(51);
                     int nom2=rand.nextInt(51);
                     int ape1=rand.nextInt(51);
                     int ape2=rand.nextInt(51);
                           
                               setSexo("mujer");            
                    nuevo_array[i][j]=nombres_hombre_inicial.get(nom1)+" "+nombres_hombre_final.get(nom2)+" "+apellidos_maternos.get(ape1)+" "+apellidos_paternos.get(ape2)+"."+"     ";
                           
                   }
                     else  if(rand_bool1==false) 
                     {
                                int nom1=rand.nextInt(51);
                                 int nom2=rand.nextInt(51);
                                 int ape1=rand.nextInt(51);
                                 int ape2=rand.nextInt(51);
                      nuevo_array[i][j]=nombres_mujer_inicial.get(nom1)+" "+nombres_mujer_final.get(nom2)+" "+apellidos_maternos.get(ape1)+" "+apellidos_paternos.get(ape2)+".";
                                  //nuevo_nombre;
                             }
                             }
                     }
                 
              }
              
              for (int i = 0; i < numero_alumnos; i++) 
              {
                     if ( prom_y_index[i] !=0 )
                     {
                     getMatriz_sin_ceros().add(i, prom_y_index[i]);
                     }
                 
                     // System.out.println();
              }
             
              
              for (int i = 0; i < numero_alumnos; i++) 
              {
                  for (int j = 0; j < 6; j++) 
                  {
                     solucion_de_problema.add(i, nuevo_array[i][0]+nuevo_array[i][1]+nuevo_array[i][2]+nuevo_array[i][3]+nuevo_array[i][4]+nuevo_array[i][5]); 
                  }
               //   System.out.println();
              }
              for (int i = 0; i < numero_alumnos; i++) 
              {
                //  System.out.println(solucion_de_problema.get(i));
              }
              
    }
    public float[] devuelve_array_app(float []recibido)
    {
      float[] nuevo= new float [recibido.length];
      
        for (int i = 0; i < recibido.length; i++)
        {
          nuevo[i]=recibido[i];    
        }
      return   nuevo;
    }
    public static void main(String[] args) {
        Complete_binary_tree nuevo =new Complete_binary_tree();
        nuevo.hace_matriz_alumnos(40);
    }
   
    
    private int decide_posicion_con_index=0;
    public int[] limpia_array(ArrayList<Integer> Complete_binary_tree_array)
    {
      int[] nuevo_array=new int[0];  
      //  System.out.println(" comprueba error");
            for (int i = 0; i < Complete_binary_tree_array.size(); i++) 
            {
        //        System.out.println(Complete_binary_tree_array.get(i));    
                nuevo_array[i]=0;          
            }
            
        return nuevo_array;    
   // return Complete_binary_tree_array;
    }
    
    
    public int[] genera_array(ArrayList<Integer> Complete_binary_tree_array,int contador,int a_comparar)
    {
        //boolean checa_si_se_repite=false;
           /* no deben ser nodos iguales */
        int nuevo[]=new int[Complete_binary_tree_array.size()];
       
        for (int i = 0; i <Complete_binary_tree_array.size(); i++) 
        {
            if (Complete_binary_tree_array.get(i)!=0) 
            {
                nuevo[i]=Complete_binary_tree_array.get(i);
            }
        
        }
        return nuevo;
    }  
    // Driver program to test above function 
   

    /**
     * @return the nodo_raiz
     */
    public Nodo getNodo_raiz() {
        return raiz_de_arbol;
    }

    /**
     * @param nodo_raiz the nodo_raiz to set
     */
    public void setNodo_raiz(Nodo nodo_raiz) {
        this.raiz_de_arbol = nodo_raiz;
    }

    /**
     * @return the para_hacer_arbol
     */
    public int[] getPara_hacer_arbol() {
        return para_hacer_arbol;
    }

    /**
     * @param para_hacer_arbol the para_hacer_arbol to set
     */
    public void setPara_hacer_arbol(int[] para_hacer_arbol) {
        this.para_hacer_arbol = para_hacer_arbol;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return decide_posicion_con_index;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.decide_posicion_con_index = contador;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the promedio_para_array
     */
    public float getPromedio_para_array() {
        return promedio_para_array;
    }

    /**
     * @param promedio_para_array the promedio_para_array to set
     */
    public void setPromedio_para_array(float promedio_para_array) {
        this.promedio_para_array = promedio_para_array;
    }

    /**
     * @return the para_transmir_promedios
     */
    public ArrayList<Float> getPara_transmir_promedios() {
        return para_transmir_promedios;
    }

    /**
     * @param para_transmir_promedios the para_transmir_promedios to set
     */
    public void setPara_transmir_promedios(ArrayList<Float> para_transmir_promedios) {
        this.para_transmir_promedios = para_transmir_promedios;
    }

    /**
     * @return the boleta
     */
    public String getBoleta() {
        return boleta;
    }

    /**
     * @param boleta the boleta to set
     */
    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }

    /**
     * @return the promedio
     */
    public String getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    /**
     * @return the materias
     */
    public String getMaterias() {
        return materias;
    }

    /**
     * @param materias the materias to set
     */
    public void setMaterias(String materias) {
        this.materias = materias;
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
     * @return the super_cadenotaxD
     */
    public String getSuper_cadenotaxD() {
        return super_cadenotaxD;
    }

    /**
     * @param super_cadenotaxD the super_cadenotaxD to set
     */
    public void setSuper_cadenotaxD(String super_cadenotaxD) {
        this.super_cadenotaxD = super_cadenotaxD;
    }

    /**
     * @return the solucion_de_problema
     */
    public ArrayList<String> getSolucion_de_problema() {
        return solucion_de_problema;
    }

    /**
     * @param solucion_de_problema the solucion_de_problema to set
     */
    public void setSolucion_de_problema(ArrayList<String> solucion_de_problema) {
        this.solucion_de_problema = solucion_de_problema;
    }

    /**
     * @return the prom_y_index
     */
    public float[] getProm_y_index() {
        return prom_y_index;
    }

    /**
     * @param prom_y_index the prom_y_index to set
     */
    public void setProm_y_index(float[] prom_y_index) {
        this.prom_y_index = prom_y_index;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the raiz_float_arbol
     */
    public Nodo_float getRaiz_float_arbol() {
        return raiz_float_arbol;
    }

    /**
     * @param raiz_float_arbol the raiz_float_arbol to set
     */
    public void setRaiz_float_arbol(Nodo_float raiz_float_arbol) {
        this.raiz_float_arbol = raiz_float_arbol;
    }
 
 
}
