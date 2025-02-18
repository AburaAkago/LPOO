/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.lab00;

/**
 *
 * @author lab
 */
public class Lab00 {

    public static void main(String[] args) {
        System.out.println(calculaEstoqueMedio(0, 0));
        System.out.println(calculaEstoqueMedio(1, 1));
        System.out.println(calculaEstoqueMedio(1, 2));
        System.out.println(calculaEstoqueMedio(2, 9));
        System.out.println(calculaEstoqueMedio(101, 102));
        System.out.println("----------------------------");
        System.out.println(conversaoDolar(1, 1));
        System.out.println(conversaoDolar(0.5, 1));
        System.out.println(conversaoDolar(0.5, 2));
        System.out.println(conversaoDolar(2, 1));
        System.out.println(conversaoDolar(5.37, 1));
        System.out.println(conversaoDolar(5.37, 100));
        System.out.println(conversaoDolar(5.37, 0.5));
        System.out.println("----------------------------");
        System.out.println(conversorCelsiusToFahrenheit(0));
        System.out.println(conversorCelsiusToFahrenheit(1));
        System.out.println(conversorCelsiusToFahrenheit(2));
        System.out.println(conversorCelsiusToFahrenheit(20));
        System.out.println(conversorCelsiusToFahrenheit(39));
        System.out.println(conversorCelsiusToFahrenheit(40));
        System.out.println(conversorCelsiusToFahrenheit(100));
    }

    public static double calculaEstoqueMedio(double estoqueMinimo, double estoqueMaximo) {
        double result = (estoqueMinimo + estoqueMaximo) / 2;
        return result;
    }

    public static double conversaoDolar(double cotacaoDolar, double valorDolar) {
        double result = (cotacaoDolar * valorDolar);
        return result;
    }
    public static double conversorCelsiusToFahrenheit(double grauC){
        double f = (9*grauC+160)/5;
        return f;
    }
}
