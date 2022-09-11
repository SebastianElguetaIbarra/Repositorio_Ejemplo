/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Sebastián
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            if(a%2==0){
                System.out.println("El numero es POSITIVO y PAR");
            }else{
                System.out.println("El numero es POSITIVO e IMPAR");
            }
        }
        if(a<0){
            if(a%2==0){
                System.out.println("El numero es NEGATIVO y PAR");
            }else{
                System.out.println("El numero es NEGATIVO e IMPAR");
            }
        }
        if(a==0){
            System.out.println("El numero es 0");
        }
    }
    
}
