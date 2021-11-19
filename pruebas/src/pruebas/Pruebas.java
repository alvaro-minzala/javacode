/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Usuario Invitado
 */
public class Pruebas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Número: ");
        int numero = teclado.nextInt();
        double resultado;
        for(int multiplicador = 0; multiplicador < 11; multiplicador++){
          resultado = numero / multiplicador;
          
            System.out.println(numero + ":" + multiplicador + "=" + resultado);
       }
    }
}
