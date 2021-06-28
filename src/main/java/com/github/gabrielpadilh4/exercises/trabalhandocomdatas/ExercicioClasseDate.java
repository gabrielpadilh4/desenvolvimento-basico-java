package com.github.gabrielpadilh4.exercises.trabalhandocomdatas;

import java.util.Calendar;
import java.util.Date;

public class ExercicioClasseDate {

    public static void main(String[] args) {
        /* Descubra o timeInMillis do dia que você nasceu;
           Converta em um objeto Date;
           Verifique se ele é anterior ou posterior a 15 de maio de 2010;
         */

        Date dataNascimento = new Date(1996, Calendar.SEPTEMBER, 21);

        System.out.println(dataNascimento.getTime());

        Date novaData = new Date(dataNascimento.getTime());

        System.out.println(novaData.toString());

        Date dataCompare = new Date(2010, Calendar.MAY, 15);

        System.out.println(novaData.before(dataCompare));

        System.out.println(novaData.after(dataCompare));



    }
}
