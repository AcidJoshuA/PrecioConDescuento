/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciocondescuento;

import java.util.Scanner;

/**
 *
 * @author jcplo
 */
public class Preciocondescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresar precio: ");
    double precioOriginal = scanner.nextDouble();         
    if (precioOriginal < 0){
    System.out.println("El precio no puede ser negativo.");
    return;  
    }
    double descuento = 0;
    if (precioOriginal > 100 && precioOriginal <= 200){
    descuento = 0.10;}
    }else if (precioOriginal > 200 && precioOriginal <= 500){
    descuento = 0.20;  
    }else if (precioOriginal > 500){
    descuento = 0.25;  
    }
    double precioFinal = precioOriginal - (precioOriginal * descuento);
    if (descuento == 0){
    System.out.println("El precio final es: " + precioOriginal + " (sin descuento)");
    }else{
    System.out.println("El descuento es del " + (descuento * 100) + "%");
    System.out.println("El precio final con el descuento es: " + precioFinal);
    }
    scanner.close();
   } 
}
