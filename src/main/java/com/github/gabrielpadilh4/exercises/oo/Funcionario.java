package com.github.gabrielpadilh4.exercises.oo;

public class Funcionario {

    private double salario;

    private double percentualImposto;

    public Funcionario(final double percentualImposto) {
        this.percentualImposto = percentualImposto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculaImposto() {
        return salario * this.percentualImposto;
    }
}
