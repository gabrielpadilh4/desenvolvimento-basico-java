package com.github.gabrielpadilh4.exercises.trabalhandocomdatas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioClasseDatFormat {

    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(sdf.format(agora));

        sdf = new SimpleDateFormat("hh:mm:ss:mmm");

        System.out.println(sdf.format(agora));
    }
}
