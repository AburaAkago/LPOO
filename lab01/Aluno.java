/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab01;

/**
 *
 * @author lab
 */
public class Aluno {

    String ra;
    Cadastro cadastro;
    double notaNP1;
    double notaNP2;

    public Aluno(String ra, Cadastro cadastro, double notaNP1, double notaNP2) {
        this.ra = ra;
        this.cadastro = cadastro;
        this.notaNP1 = notaNP1;
        this.notaNP2 = notaNP2;
    }

    public String getRa() {
        return ra;
    }

    public double getNotaNP1() {
        return notaNP1;
    }

    public double getNotaNP2() {
        return notaNP2;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public void setNotaNP1(double notaNP1) {
        this.notaNP1 = notaNP1;
    }

    public void setNotaNP2(double notaNP2) {
        this.notaNP2 = notaNP2;
    }

    public void relatorio() {
        double media = (notaNP1 + notaNP2) / 2;
        if (media >= 7) {
            System.out.println("O Aluno " + cadastro.nome.getPrimeiroNome() + " portador do R.A " + ra + " foi aprovado com a média " + media);
        } else {
            System.out.println("O Aluno " + cadastro.nome.getPrimeiroNome() + " portador do R.A " + ra + " foi reprovado com a média " + media);
        }
    }
}
