/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_parcial2;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //INSTANCIANDO ELEMENTO SCANNER
        Scanner scanner = new Scanner(System.in);
        
        //INDICANDO QUE SE INGRESE LA CANTIDAD DE ELEMENTOS A ORDENAR
        System.out.println("Ingrese la cantidad de elementos que quiere ordenar: ");
        
        //INSTANCIANDO LA CANTIDAD DE ELEMENTOS DE LOS ARREGLOS
        int cantidad_elementos = scanner.nextInt();
        
        //SE CUENTAN LOS ELEMENTOS
        System.out.println("Elementos a ordenar: "+ cantidad_elementos);
        
        //INSTANCIANDO ARREGLO DE NUMEROS DESORDENADOS
        int[] numeros_desordenados = new int[cantidad_elementos];
        
        //INSTANCIANDO ARREGLO DE NUMEROS ORDENADOS
        int[] numeros_ordenados = new int[cantidad_elementos];
        
        //FOR PARA INSERTAR DATOS DEL ARREGLO DE NUMEROS DESORDENADOS
        //ELEMENTO POR ELEMENTO
        for (int i = 0; i < numeros_desordenados.length; i++) {
            
            //SE INDICA QUE SE INSERTE ELEMENTO i
            System.out.print("Elemento "+ (i+1) + ": ");
            
            //SE LEE INSERCION DE ELEMENTO EN LA POSICION i
            numeros_desordenados[i] = scanner.nextInt();
            
        }
        
        //SE MUESTRAN LOS NUMEROS INSERTADOS
        System.out.println("Usted ingreso los siguientes numeros: ");
        
        for (int j = 0; j < numeros_desordenados.length; j++) {
            
            System.out.print(" "+numeros_desordenados[j]+"  ");
        }
        
        //SALTO DE LINEA PARA SEPARAR SECCIONES
        System.out.println();
        
        
        System.out.println("Ahora los ordenaremos");
        
        //ALMACENAN LOS NUMEROS ORDENADOS POR MEDIO DE LA FUNCION DE ORDENAMIENTO
        //APLICADA AL ARRREGLO E NUMEROS DESORDENADOS
        numeros_ordenados = ordenamiento(numeros_desordenados);
        
        //SE REALIZA UN FOR PARA MOSTRAR LOS NUMEROS ORDENADOS
        for(int k = 0; k < numeros_ordenados.length; k++) {
            
            //SE IMPRIMEN LOS NUMEROS EN ORDEN
            System.out.println("Nuevo elemento "+(k+1)+":  "+numeros_ordenados[k]);
        }
    }

    //SE CREA LA FUNCION PARA ORDENAR NUMEROS
    public static int[] ordenamiento(int[] arreglo) {
        
        //SE INICIA EL PRIMER FOR QUE RECORRE EL ARREGLO
        //SE RESTA UNA POSICION, PARA QUE PARE EN LA ULTIMA POSICION
        for (int x = 0; x < arreglo.length -1; x++) {
            
            //SE INICIA EL FOR QUE SE ENCARGA DE COMPARAR CADA 
            //ELEMENTO, SIEMPRE RESTANDO UNA POSICION PORQUE EL ULTIMO ELEMENTO
            //NO PUEDE COMPARARSE AL 'SIGUIENTE'
            for (int y = 0; y < arreglo.length -1; y++) {
                
            //SE INICIA UN IF CUYA CONDICION ES COMPARAR LA POSICION
            //ACTUAL CON LA SIGUIENTE
            if (arreglo[y] > arreglo[y+1]) {
                
                //SE CREA UNA VARIABLE QUE ALMACENE EL NUMERO MAYOR
                //EN ESTE CASO, SEGUN LA CONDICION,SERA LA POSICION ACTUAL
                int mayor = arreglo[y];
                
                //INTERCAMBIAMOS LAS POSICIONES DE LOS ELEMENTOS
                //PORQUE EL NUMERO MAYOR DEBE IR DESPUES
                //ESTE INTERCAMBIO ES LA RAZON DEL -1 EN LOS 'FOR'
                arreglo[y] = arreglo[y+1];
                
                //AHORA INDICAMOS QUE LA POSICION SIGUIENTE ES LA MAYOR
                arreglo[y+1] = mayor;
                }
            }
            
        }
        //HACEMOS QUE LA FUNCION REGRESE EL ARREGLO YA ORDENADO
        return arreglo;
    }
}
