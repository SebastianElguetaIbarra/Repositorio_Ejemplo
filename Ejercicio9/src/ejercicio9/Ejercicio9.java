/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
/**
 *
 * @author Sebastián
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el resultado del primer dado");
        int a = sc.nextInt();
        System.out.println("Ingrese el resultado del segundo dado");
        int b = sc.nextInt();
        System.out.println("Ingrese el resultado del tercer dado");
        int c = sc.nextInt();
        if((a==6)&&(b==6)&&(c==6)){
            System.out.println("Excelente");
        }
        else{if((a!=6)&&(b!=6)&&(c!=6)){
            System.out.println("Pesimo");
        }
        else{if(((((a==6)&&(b==6))||(a==6)&&(c==6))||(b==6)&&(c==6))){
            System.out.println("Muy bien");
        }
        else{
            System.out.println("Regular");
        }
        }
        }
    }
    
}
