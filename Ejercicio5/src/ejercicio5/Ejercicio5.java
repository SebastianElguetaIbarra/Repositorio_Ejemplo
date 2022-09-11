/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Sebastián
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un numero entre 0 y 99999");
        int a = sc.nextInt();
        if(a<10){
            System.out.println("Tiene 1 cifra");
        }
        else{if(a<100){
                System.out.println("Tiene 2 cifras");
        }
        else{if(a<1000){
                System.out.println("Tiene 3 cifras");
        }
        else{if(a<10000){
                System.out.println("Tiene 4 cifras");
        }
        else{if(a<=99999){
                System.out.println("Tiene 5 cifras");
        }
        }
        }
        }
        }
    }
}
