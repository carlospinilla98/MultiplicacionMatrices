/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacion;

import java.util.Scanner;

/**
 *
 * @author Carlos Pinilla
 */
public class Multiplicacion {
 int filasA,columnasA,filasB,columnasB;
    private int matrizA[][],matrizB[][],matrizR[][];
    public Scanner teclado = new Scanner(System.in);
    public Multiplicacion(){
        System.out.println("Matriz A");
        LongitudMatrizA();
        LlenarMatrizA();
        System.out.println("Matriz B");
        LongitudMatrizB();
        LlenarMatrizB();
        System.out.println("RESULTADO");
        Multiplica();
    }
    public void LongitudMatrizA(){
        System.out.print("Filas : ");
        filasA = teclado.nextInt();
        matrizA = new int [filasA][];
        System.out.print("Columnas : ");
        columnasA = teclado.nextInt();
        matrizA = new int [filasA][columnasA];
    }
    public void LongitudMatrizB (){
        System.out.print("Filas : ");
        filasB = teclado.nextInt();
        matrizB = new int [filasB][];
        System.out.print("Columnas : ");
        columnasB = teclado.nextInt();
        matrizB = new int [filasB][columnasB];
    }
    public void LlenarMatrizA(){
        for(int i=0 ; i<filasA ; i++){
            for(int j=0 ; j<columnasA ; j++){
                System.out.print("Digite el valor en la posicion "+i+","+j+" : ");
                matrizA[i][j]= teclado.nextInt();
            }
        }
    }
    public void LlenarMatrizB(){
        for(int i=0 ; i<filasB ; i++){
            for(int j=0 ; j<columnasB ; j++){
                System.out.print("Digite el valor en la posicion "+i+","+j+" : ");
                matrizB[i][j]= teclado.nextInt();
            }
        }
    }
        public void Multiplica(){
            if (columnasA==filasB){
                for (int i=0 ; i<filasA ; i++){
                    for (int j=0 ; j<columnasB; j++){
                        for (int k=0 ; k<columnasA ; k++){
                            matrizR[i][j]=matrizA[i][k]*matrizB[k][j];
                        }
                        System.out.print(matrizR[i][j]+"");
                    }
                    System.out.println();
                }
            }
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Multiplicacion multiplicacionMatrices = new Multiplicacion();
        // TODO code application logic here
    }
    
}
