/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap_sort;

import heap_sort.Nodo;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author biosh
 */
public class Algorithm2 
{

 //private Complete_binary_tree COMPLETE_BYNARY_TREE = new Complete_binary_tree(); 
   private static String Para_imprimir =new String();
 public void Max_Heap(int Array_para_CBT[])
	{
        int logitud_array = Array_para_CBT.length;
		for (int i = logitud_array/2 -1; i >= 0; i--)
                {
	         max_heapify(Array_para_CBT, logitud_array, i);
		}
		// One by one extract an element from heap
              //  ultimo_max_heap(logitud_array, Array_para_CBT);
		
        }
 
public String ultimo_max_heap(int long_array,int[]matrix)
{
   	for (int i = long_array/2 -1; i >= 0; i--)
                {
	         max_heapify(matrix, long_array, i);
		}
	    
// String Cadena_con_array_min= new String();
  //  System.out.println("                      FINAL");
    for (int i = long_array-1 ; i >0; i--)
                {
			// lleva la raiz al fin del array
                        int temp = matrix[0];
			matrix[0] = matrix[i];
			matrix[i] = temp;
                         // se usa denuevo en el array modificado
			max_heapify(matrix, i, 0);
                }
      return Arrays.toString(matrix);
}
public String ultimo_max_heap_float(int long_array,float[]matrix)
{
   	for (int i = long_array/2 -1; i >= 0; i--)
                {
	         max_heapify_float(matrix, long_array, i);
		}
	    
    for (int i = long_array-1 ; i >0; i--)
                {
			// lleva la raiz al fin del array
			float temp = matrix[0];
			matrix[0] = matrix[i];
			matrix[i] = temp;
			 // se usa denuevo en el array modificado
			max_heapify_float(matrix, i, 0);
                }
                     for (int i = 0; i < long_array; i++) 
                     {
                     }
      return Arrays.toString(matrix);
}
public String ultimo_min_heap(int long_array,int[]matrix)
{
               
               for (int i = long_array/2 -1; i >= 0; i--)
               {
                   min_heapify(matrix, long_array, i);
               }
    for (int i = long_array-1 ; i >0 ; i--)
                {
			// lleva la raiz al fin del array
			int temp = matrix[0];
			matrix[0] = matrix[i];
			matrix[i] = temp;

			// se usa denuevo en el array modificado
			min_heapify(matrix, i, 0);
                }
      return Arrays.toString(matrix);
}
public String ultimo_min_heap_float(int long_array,float[]matrix)
{
               for (int i = long_array/2 -1; i >= 0; i--)
               {
                   min_heapify_float(matrix, long_array, i);
               }
    for (int i = long_array-1 ; i >0 ; i--)
                {
			// Move current root to end
			float temp = matrix[0];
			matrix[0] = matrix[i];
			matrix[i] = temp;

			 //call max heapify on the reduced heap
			min_heapify_float(matrix, i, 0);
                }
                     for (int i = 0; i < long_array; i++) 
                     {
                     }
      return Arrays.toString(matrix);
}
 public void Min_Heap(int Array_para_CBT[])
	{
        int logitud_array = Array_para_CBT.length;
               for (int i = logitud_array/2 -1; i >= 0; i--)
               {
                   min_heapify(Array_para_CBT, logitud_array, i);
               }
		
        }
  public void Max_Heap_float(float Array_para_CBT[])
	{
        int logitud_array = Array_para_CBT.length;
		for (int i = logitud_array/2 -1; i >= 0; i--)
                {
	         max_heapify_float(Array_para_CBT, logitud_array, i);
		}
		// One by one extract an element from heap
              //  ultimo_max_heap(logitud_array, Array_para_CBT);
		
        }
 public void Min_Heap_float(float Array_para_CBT[])
	{
        int logitud_array = Array_para_CBT.length;
               for (int i = logitud_array/2 -1; i >= 0; i--)
               {
                   min_heapify_float(Array_para_CBT, logitud_array, i);
               }
		
        }
public void max_heapify(int array[], int nodos_en_CBT, int i)
	{       
		int mas_grande = i;
		int hijo_izquierdo = 2 * i + 1; // 2*i + 1 es el hijo izquierdo
		int hijo_derecho = 2 * i + 2; // 2*i + 2 es el hijo derecho
                Nodo nodoraiz = null;
		if (hijo_izquierdo < nodos_en_CBT && array[hijo_izquierdo] > array[mas_grande])
                {    
			mas_grande = hijo_izquierdo;
                }
		if (hijo_derecho < nodos_en_CBT && array[hijo_derecho] > array[mas_grande])
                {    
			mas_grande = hijo_derecho;
                }
		if (mas_grande != i) 
                {
			int swap = array[i];
			array[i] = array[mas_grande];
			array[mas_grande] = swap;

			max_heapify(array, nodos_en_CBT, mas_grande);
		}
        }
 public void min_heapify_float(float array[], int nodos_en_CBT, int i)
	{       
		int hijo_izquierdo = 2 * i + 1; // 2*i + 1 es el hijo izquierdo
		int hijo_derecho = 2 * i + 2; // 2*i + 2 es el hijo derecho
		int mas_pequenio = i; 
		if (hijo_izquierdo < nodos_en_CBT && array[hijo_izquierdo] < array[mas_pequenio])
                {    
			mas_pequenio = hijo_izquierdo;
                }                /* EL SIZE DE NUESTRO ARRAY*/
		if (hijo_derecho < nodos_en_CBT && array[hijo_derecho] < array[mas_pequenio])
                {    
			mas_pequenio = hijo_derecho;
                }
		if (mas_pequenio != i) 
                {
			float swap = array[i];
			array[i] = array[mas_pequenio];
			array[mas_pequenio] = swap;

			min_heapify_float(array, nodos_en_CBT, mas_pequenio);
		}
        }
 
 
public void max_heapify_float(float array[], int nodos_en_CBT, int i)
	{       
		int mas_grande = i;
		int hijo_izquierdo = 2 * i + 1; // 2*i + 1 es el hijo izquierdo
		int hijo_derecho = 2 * i + 2; // 2*i + 2 es el hijo derecho
                Nodo nodoraiz = null;
		if (hijo_izquierdo < nodos_en_CBT && array[hijo_izquierdo] > array[mas_grande])
                {    
			mas_grande = hijo_izquierdo;
                }
		if (hijo_derecho < nodos_en_CBT && array[hijo_derecho] > array[mas_grande])
                {    
			mas_grande = hijo_derecho;
                }
		if (mas_grande != i) 
                {
			float swap = array[i];
			array[i] = array[mas_grande];
			array[mas_grande] = swap;

			max_heapify_float(array, nodos_en_CBT, mas_grande);
		}
        }
    public static void main(String[] args)
    {
     Algorithm2 nuevo=new Algorithm2();
     int []prueba=new int [6];
     int []prueba_2=new int [6];
     int []prueba_3=new int [6];
     int []prueba_4=new int [6];
    
     prueba[0]=2;
     prueba[1]=8;
     prueba[2]=9;
     prueba[3]=67;
     prueba[4]=34;
     prueba[5]=13;
     
     prueba_2[0]=13;
     prueba_2[1]=8;
     prueba_2[2]=9;
     prueba_2[3]=67;
     prueba_2[4]=34;
     prueba_2[5]=2;
     
     prueba_3[0]=34;
     prueba_3[1]=13;
     prueba_3[2]=9;
     prueba_3[3]=67;
     prueba_3[4]=8;
     prueba_3[5]=2;
     
     
  /* resultado del min_heap anterior
     prueba_4[0]=9;
     prueba_4[1]=13;
     prueba_4[2]=34;
     prueba_4[3]=67;
     prueba_4[4]=8;
     prueba_4[5]=2;*/
    
    prueba_4[0]=67;
     prueba_4[1]=13;
     prueba_4[2]=34;
     prueba_4[3]=9;
     prueba_4[4]=8;
     prueba_4[5]=2;
        
     
  
  
  
     prueba=nuevo.min_heapify_2(prueba, 6, 0);
        for (int i = 0; i < 6; i++)
        {
            System.out.println(prueba[i]);
        }
        System.out.println();
         prueba_2=nuevo.min_heapify_2(prueba_2, 5, 0);
        for (int i = 0; i < 6; i++)
        {
            System.out.println(prueba_2[i]);
        }
        System.out.println();
        prueba_3=nuevo.min_heapify_2(prueba_3, 4, 0);
        for (int i = 0; i < 6; i++)
        {
            System.out.println(prueba_3[i]);
        }
        System.out.println();
        prueba_4=nuevo.min_heapify_2(prueba_4, 3, 0);
        for (int i = 0; i < 6; i++)
        {
            System.out.println(prueba_4[i]);
        }
        
             /* for (int i = prueba.length/2 -1; i >= 0; i--)
               {
               }*/
        int []prueba_5=new int [6];
          
            prueba_5= nuevo.min_heapify_2(prueba,6, 2);
           System.out.println("make heap");        
            
	for (int i = 0; i < 6; i++)
        {
            System.out.println(prueba_5[i]);
       }
        int []prueba_6=new int [6];      
        prueba_6= nuevo.min_heapify_2(prueba_5,6, 1);
           System.out.println("make heap 2");        
            
	for (int i = 0; i < 6; i++)
        {
            System.out.println(prueba_6[i]);
       }
    }
    
 public int[] min_heapify_2(int array[], int nodos_en_CBT, int i)
	{       
		int hijo_izquierdo = 2 * i + 1; // 2*i + 1 es el hijo izquierdo
		int hijo_derecho = 2 * i + 2; // 2*i + 2 es el hijo derecho
		int mas_pequenio = i; 
		if (hijo_izquierdo < nodos_en_CBT && array[hijo_izquierdo] < array[mas_pequenio])
                {    
			mas_pequenio = hijo_izquierdo;
                }                /* EL SIZE DE NUESTRO ARRAY*/
		if (hijo_derecho < nodos_en_CBT && array[hijo_derecho] < array[mas_pequenio])
                {    
			mas_pequenio = hijo_derecho;
                }
		if (mas_pequenio != i) 
                {
			int swap = array[i];
			array[i] = array[mas_pequenio];
			array[mas_pequenio] = swap;

			min_heapify(array, nodos_en_CBT, mas_pequenio);
		}
             return array;   
        }
 public void min_heapify(int array[], int nodos_en_CBT, int i)
	{       
		int hijo_izquierdo = 2 * i + 1; // 2*i + 1 es el hijo izquierdo
		int hijo_derecho = 2 * i + 2; // 2*i + 2 es el hijo derecho
		int mas_pequenio = i; 
		if (hijo_izquierdo < nodos_en_CBT && array[hijo_izquierdo] < array[mas_pequenio])
                {    
			mas_pequenio = hijo_izquierdo;
                }                /* EL SIZE DE NUESTRO ARRAY*/
		if (hijo_derecho < nodos_en_CBT && array[hijo_derecho] < array[mas_pequenio])
                {    
			mas_pequenio = hijo_derecho;
                }
		if (mas_pequenio != i) 
                {
			int swap = array[i];
			array[i] = array[mas_pequenio];
			array[mas_pequenio] = swap;

			min_heapify(array, nodos_en_CBT, mas_pequenio);
		}
        }
 
 public void devuelve_array_max_HSA(int [] matriz_cbt,Nodo raiz)
 {
             ArrayList<Integer> mete_datos_de_arbol= new ArrayList<>();
             int[] matriz_con_indice=new int[matriz_cbt.length];
             int[] indice=new int[matriz_cbt.length];
          
             int tamanio_array=matriz_cbt.length;
          //   System.out.println(" la longitud del array "+matriz_cbt.length);
             int i,j=0;
             while (tamanio_array!=-1)
             { 
                 for ( j = 0; j <tamanio_array; j++)
                 {
                     matriz_con_indice[j]=matriz_cbt[j];
                 }
               //   System.out.println(" ");
                      for ( i = 0; i < tamanio_array; i++) 
                     {
                             indice[i]=i+1;
                     }
                      for ( i = 0; i < tamanio_array; i++) 
                     {
              //          System.out.printf("  %3d" ,indice[i]);    
                     }
                       System.out.println();
                         for ( j = 0; j <tamanio_array; j++)
                         {
                  //           System.out.printf("  %3d" ,matriz_con_indice[j]);    
                         }
                             tamanio_array--;
             }
              
             
 }
 
    /**
     * @return the Para_imprimir
     */
    public static String getPara_imprimir() {
        return Para_imprimir;
    }

    /**
     * @param aPara_imprimir the Para_imprimir to set
     */
    public static void setPara_imprimir(String aPara_imprimir) {
        Para_imprimir = aPara_imprimir;
    }
    
}
