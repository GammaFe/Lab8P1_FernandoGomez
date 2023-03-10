/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lab8p1_fernandogomez;

import static com.mycompany.lab8p1_fernandogomez.XArray.arreglo;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab8P1_FernandoGomez {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
      //  JOptionPane.showMessageDialog(null, "Hola");
        while (opcion != 4) {
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. X-Array");
            System.out.println("2. Sin duplicados");
            System.out.println("3. Oración a Matriz");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un tamaño: ");
                    int N = entrada.nextInt();
                    System.out.println("");
                    int[][] matriz = new int[N][N];
                    System.out.println("Matriz Generada");
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < N; j++) {
                            int dado = new Random().nextInt((4100 - 1100) + 1) + 1100;
                            matriz[i][j] = dado;
                            System.out.print("[" + matriz[i][j] + "]");
                        }
                        System.out.println("");
                    }
                    System.out.print("Arreglo de diagonales");
                    XArray hola = new XArray(matriz);
                    
                    int[] a = arreglo(N,matriz);
                    for (int i = 0; i < a.length; i++) {
                        System.out.print("["+a[i]+"]");
                    }
                    System.out.println("");
                    break;
                case 2:
                    entrada = new Scanner(System.in);
                    System.out.print("Ingrese un tamaño:");
                    int num = entrada.nextInt();
                    while ((num > 10) || (num < 5)) {
                        System.out.print("Ingrese un tamaño:");
                        num = entrada.nextInt();}
                    
                    break;
                case 3:
                    entrada = new Scanner(System.in);
                    System.out.print("Ingrese una oracion");
                    String oracion = entrada.nextLine();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Ingese un umero valido");
                    break;

            }
        }
    }
     
}
