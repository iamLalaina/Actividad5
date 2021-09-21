/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5;

/**
 *
 * @author abii_
 */
public class Actividad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Decía en "Requerimientos" de la actividad que realizaramos los 
        // problemas incluidos en el tema y estos son algunos como ejemplo:
        byte valor = 10;
        System.out.println(valor);
        short numero_corto = 100;
        System.out.println(numero_corto);
        int edad = 10;
        System.out.println(edad);
        long numero_largo = 9223372036854775800L;
        System.out.println(numero_largo);
        float numero_pi = 3.141592f;
        System.out.println(numero_pi);
        char letra_a = 'a';
        System.out.println(letra_a);
        double numero_euler = 2.718281828459045235360;
        System.out.println(numero_euler);
        boolean valor_logico = false;
        System.out.println(valor_logico);
        String saludo = "Hello World!";
        System.out.println(saludo);
        int[] numeros_pares = {2, 4, 6, 8, 10};
        System.out.println(numeros_pares);
        
        // Aquí inicia la verdadera actividad 5
        System.out.println("--------------------ACTIVIDAD 5-----------------");
         // Atributos numericos: utilice el "int" pude usar tambien otro.
        int valorX = 4;
        int valorY = 44;
         // Mostramos los valores numericos con su digito
        System.out.println("X = " +valorX);
        System.out.println("y = " +valorY);
         // Operación de suma con los dos digitos anteriormente seleccionados
        int sum = valorX + valorY;
        System.out.println("Suma = " +sum);
         // Operación de resta con los dos digitos anteriormente seleccionados
        int res = valorX - valorY;
        System.out.println("Resta = " +res);
         // Operación de multiplicación con los dos digitos anteriormente seleccionados
        double mul = valorX * valorY;
        System.out.println("Multiplicación = " +mul);
        // Operación de división con los dos digitos anteriormente seleccionados
        double div = valorX / valorY;
        System.out.println("División = " +div);
        // Operación de modulo con los dos digitos anteriormente seleccionados
        double mod = valorX % valorY;
        System.out.println("Módulo = " +mod);
        // Aquí termina la actividad 5
        System.out.println("-------------------------------------------------");
        System.out.println("Hello, Profe c:");
    }
    
}
