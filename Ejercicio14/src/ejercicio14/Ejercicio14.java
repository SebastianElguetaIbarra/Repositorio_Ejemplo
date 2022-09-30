/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import java.util.Scanner;
/**
 *
 * @author Sebastián
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa para encontrar: Integral(x**2+x)dx; por rectangulos con valor de punto medio");
        System.out.println("--------------------------------------------");
        System.out.println("Escriba el comienzo del intervalo:");
        double a = sc.nextDouble();
        System.out.println("Escriba el final del intervalo:");
        double b = sc.nextDouble();
        System.out.println("Escriba la cantidad de rectangulos que desea:");
        double n = sc.nextDouble();
        System.out.println("---------------------------------------------");
        double Integral=0;
        double i = 1;
        double base = (b-a)/n;
        double puntomedio;
        while(i<=n){
            puntomedio = a+base*(2*i-1)/2;
            Integral=Integral+base*(puntomedio*puntomedio+puntomedio);
            i=i+1;
        }
        System.out.println(Integral);
    }
    
}
