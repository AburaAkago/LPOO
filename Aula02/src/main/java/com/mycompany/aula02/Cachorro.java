/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;

/**
 *
 * @author lab
 */
class Cachorro {
     private String nome;
    private int idade;
    private double peso;
    
    public Cachorro(String nome, int idade, double peso){
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    int aumentaIdade(){
        idade++;
        return idade;
    }
    
    @Override public String toString(){
        return "Nome: "+nome+"\nIdade: "+idade+"\nPeso: "+peso;
    }
   
}
