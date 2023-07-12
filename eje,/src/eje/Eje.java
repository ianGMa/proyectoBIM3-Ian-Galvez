/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eje;

import java.util.Scanner;

/**
 *
 * @author DG4178GT
 */
public class Eje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     char palabra[];
        char correcto[];
        int error = 0;
        boolean adivinar = false;
        char letra = ' ';
        Scanner teclado = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        int contador = 0, menu = 0;
         
        System.out.println("-----------------------------JUEGO DEL AHORCADO--------------------------");          
       
        while (menu != 2) {
             System.out.println("");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^___Ingrese La Palabra Seccreta___^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("");
            String word = teclado.nextLine();

            int tam = word.length();
            palabra = new char[tam];
            correcto = new char[tam];

            for (int A = 0; A < tam; A++) {
                correcto[A] = '_';
            } 
            for (int i = 0; i < tam; i++) {
                palabra[i] = word.charAt(i);
            }
            
            for (int w = 0; w < 35; w++) {
                System.out.println("");
            }
            
            String cadena = "";
            for (int m = 0; m < tam; m++) {
                cadena = cadena + correcto[m] + " ";
            }
            System.out.println(cadena);

            int er;
            int acierto = 0;
            while (adivinar == false) {
                System.out.println("Ingrese la letra");
                letra = entrada.nextLine().charAt(0);

                er = 0; //****
                for (int i = 0; i < tam; i++) {
                    if (letra == palabra[i]) {
                        correcto[i] = palabra[i];
                        acierto++;
                    } else {
                        er++;
                        
                    }
                }
                if (er == tam) { //****
                    error++;
                }
                System.out.println("");
                
                cadena = "";
                for (int m = 0; m < tam; m++) {
                    cadena = cadena + correcto[m] + " ";
                }
                System.out.println(cadena);
                //***abajo
                if (error == 4 || acierto == tam) {
                    System.out.println("Has Fallado " + error + (" veces"));
                    System.out.println("");
                    System.out.println("La Palabra es:" + "¬¬   " + word + "   ¬¬");
                    break;

                }

            }
            
            System.out.println("-------------------------------------------");
            System.out.println("\n(1)  Jugar de Nuevo");
            System.out.println("\t(2) Salir");
            System.out.println("------------INGRESE OPCION-----------------");
            menu = entrada.nextInt();
            if (menu == 1) {
                menu = menu;
            }
            if (menu == 2) {
                
                break;
            }
    
}
    }}