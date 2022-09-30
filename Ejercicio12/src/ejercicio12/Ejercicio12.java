/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;

/**
 *
 * @author Sebastián
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el factorial que desea calcular:");
        int m=1;
        int n=sc.nextByte();
        for(int r = n;r>0;r--){
            m=m*r;
        }
        System.out.println("El factorial del numero ingresado es: "+m);
    }
}
