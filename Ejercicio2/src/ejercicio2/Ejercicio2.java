/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Sebastián
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int a=sc.nextInt();
        System.out.println("Ingrese otro número diferente al primero");
        int b=sc.nextInt();
        if(a>b){
            String mayor = "El número " + a + " es mayor";
            System.out.println(mayor);
        } 
        else{if(a<b){
            String menor = "El número " + b + " es mayor";
            System.out.println(menor);
        }
        
        }
    }
}
        

    

