/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab01;

/**
 *
 * @author lab
 */
public class Lab01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Aluno aluno = new Aluno("R042T6", new Cadastro(new Nome("Rafael","Augusto"), new Endereco("uieqbg", 5)), 0, 0);
        
        aluno.relatorio();
        
    }
}
