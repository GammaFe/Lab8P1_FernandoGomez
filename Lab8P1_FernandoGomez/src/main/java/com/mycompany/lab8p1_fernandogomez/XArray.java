package com.mycompany.lab8p1_fernandogomez;

public class XArray {

    public int[][] matriz;
    public int[][] arreglo;

    public int[][] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[][] arreglo) {
        this.arreglo = arreglo;
    }

    public static void array() {

    }

    public static int[] arreglo(int N, int[][] M) {
        int[] arreglo = new int[N * 2];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i == j) {
                    arreglo[i] = M[i][j];
                }
            }
        }
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (i+j == N-1) {
                    arreglo[i+N] = M[i][j];
                }
            }
        }
        
        return arreglo;

    }

    public XArray(int[][] matriz) {
        this.matriz = matriz;
    }

}
