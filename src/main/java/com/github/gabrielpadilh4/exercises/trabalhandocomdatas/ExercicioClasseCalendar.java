package com.github.gabrielpadilh4.exercises.trabalhandocomdatas;

import java.util.Calendar;

public class ExercicioClasseCalendar {

    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.println("Hoje: " + agora.getTime());

        agora.add(Calendar.DATE, 13);

        System.out.println("Data pagamento: " + agora.getTime());

        System.out.println(agora.get(Calendar.DAY_OF_WEEK));

        if(agora.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            agora.add(Calendar.DATE, 2);
        }

        if(agora.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            agora.add(Calendar.DATE, 1);
        }

        System.out.println("Data real para pagamento: " + agora.getTime());

    }

}
