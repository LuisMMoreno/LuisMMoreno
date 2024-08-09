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

            System.out.println(num +"x"+1+"="+(num*1));
            System.out.println(num +"x"+2+"="+(num*2));
            System.out.println(num +"x"+3+"="+(num*3));
            System.out.println(num +"x"+4+"="+(num*4));
            System.out.println(num +"x"+5+"="+(num*5));
            System.out.println(num +"x"+6+"="+(num*6));
            System.out.println(num +"x"+7+"="+(num*7));
            System.out.println(num +"x"+8+"="+(num*8));
            System.out.println(num +"x"+9+"="+(num*9));
            System.out.println(num +"x"+10+"="+(num*10));
            System.out.println(num +"x"+11+"="+(num*11));
            System.out.println(num +"x"+12+"="+(num*12));
            
            System.out.print("Desea consultar otra tabla, precione 1 para si, 2 para no: ");
            xd=a.nextInt();
    }
    }
    
}

