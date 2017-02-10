/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lnarvaezr.t02.p02;
import java.util.Scanner;
/**
 *
 * @author Vianey_Narváez
 */
public class SPP2LNarvaezRT02P02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valinf, valsup;
    double resultado;
    System.out.println("Introduce el valor inferior");
    valinf = teclado.nextInt();
    System.out.println("Introduce el valor superior");
    valsup = teclado.nextInt();
    do{
        valinf ++;
        resultado = valinf%2;
        if(resultado>0 || resultado>0){
            System.out.println(valinf + " no es divisible entre 2");
        }
        else{
                System.out.println(valinf + " es divisible entre 2");
        }
        resultado = valinf%3;
        if(resultado>0 || resultado>0){
            System.out.println(valinf +" no es divisible entre 3");
                }
        else{
            System.out.println(valinf + " es divisible entre 3");
        }
        resultado = valinf%5;
        if(resultado>0 || resultado>0){
            System.out.println(valinf + " no es divisible entre 5");
        }
        else{
            System.out.println(valinf + " es divisible entre 5");
        }
    }
    while (valinf < (valsup -1));
    }
    
}
