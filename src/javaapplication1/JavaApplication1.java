/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ESTUDIANTE
 */
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.println("Bienvenido a -Tablas Consultor-");
        int xd=1;
        while(xd==1){
            System.out.print("Digite el numero de tabla que desea conocer: ");
            int num = a.nextInt();

            for (int i=1;i=12;i++){

                System.out.println(num +"x"+i+"="+(num*i));
            
            }
            
            System.out.print("Desea consultar otra tabla, precione 1 para si, 2 para no: ");
            xd=a.nextInt();
    }
    }
    
}

