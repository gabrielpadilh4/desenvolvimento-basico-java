package com.github.gabrielpadilh4.exercises.oo;

public class TesteHeranca {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(0.001);

        funcionario.setSalario(1000.00);

        System.out.println("Imposto funcionario = " + funcionario.calculaImposto());

        Gerente gerente = new Gerente();

        gerente.setSalario(15000.0);

        System.out.println("Imposto gerente = " + gerente.calculaImposto());

        Supervisor supervisor = new Supervisor();

        supervisor.setSalario(5000.00);

        System.out.println("Imposto supervisor = " + supervisor.calculaImposto());

        Atendente atendente = new Atendente();

        atendente.setSalario(1500.00);

        System.out.println("Imposto atendente = " + atendente.calculaImposto());

        /* Polimorfismo */
        Funcionario generico = new Gerente();
        generico.setSalario(50000.0);

        System.out.println("Imposto generico = " + generico.calculaImposto());

    }
}
