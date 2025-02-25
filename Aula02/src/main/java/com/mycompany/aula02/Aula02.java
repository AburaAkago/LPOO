/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula02;

/**
 *
 * @author lab
 */
public class Aula02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Cachorro cachorro01 = new Cachorro("s", 11, 10);
        Funcionario fun01 = new Funcionario("01", "nome", 500);
        
        System.out.println(cachorro01);
        System.out.println(fun01);
        
        fun01.aumentaSalarioAbsoluto(fun01.getSalario());
        System.out.println(fun01.getSalario());
    }
}
