/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Sebastián
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de piernas de dinosaurio");
        int P1=sc.nextInt();
        System.out.println("Cantidad de huevos de Pterosaurio");
        int P2=sc.nextInt();
        System.out.println("Cantidad de dinosaurios mascota");
        int P3=sc.nextInt();
        System.out.println("Cantidad de collares para dinosaurio");
        int P4=sc.nextInt();
        double PT = P1*15.58+P2*7.50+P3*150+P4*10;
        System.out.println("Total");
        System.out.println(PT);
        double TB = PT/20;
        System.out.println("Total billetes de Q20 a dar");
        System.out.println(Math.round(TB));
        double C=Math.round(TB)*20-PT;
        System.out.println("Cambio");
        System.out.println(C);
    }
    
}
