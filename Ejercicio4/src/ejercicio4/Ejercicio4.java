/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Sebastián
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros para ser ordenados de mayor a menor");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a>b)&&(a>c)){
            if(b>c){
                String orden = "El orden es "+a+", "+b+", "+c;
                System.out.println(orden);
            }
            if(c>b){
                String orden = "El orden es "+a+", "+c+", "+b;
                System.out.println(orden);
            }
        }
        if((b>a)&&(b>c)){
            if(a>c){
                String orden = "El orden es "+b+", "+a+", "+c;
                System.out.println(orden);
            }
            if(c>a){
                String orden = "El orden es "+b+", "+c+", "+a;
                System.out.println(orden);
            }
        }
        if((c>b)&&(c>a)){
            if(b>a){
                String orden = "El orden es "+c+", "+b+", "+a;
                System.out.println(orden);
            }
            if(a>b){
                String orden = "El orden es "+c+", "+a+", "+b;
                System.out.println(orden);
            }
        }
    }
    
}
