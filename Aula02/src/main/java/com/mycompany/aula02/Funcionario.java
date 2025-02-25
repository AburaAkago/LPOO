/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;

/**
 *
 * @author lab
 */
public class Funcionario {
    private String id;
    private String nome;
    private double salario;
    
    public Funcionario(String id, String nome, double salario){
        setId(id);
        setNome(nome);
        setSalario(salario);
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    double aumentaSalarioPorcentagem(double umPorcento){
        salario = salario+(salario*0.5);
        return salario;
    }
    
    double aumentaSalarioAbsoluto(double umValor){
        salario = salario+500;
        return salario;
    }
    
    @Override public String toString(){
        return "Nome: "+nome+"\nID: "+id+"\nSalario: "+salario;
    }
}
