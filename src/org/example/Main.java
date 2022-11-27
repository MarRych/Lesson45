package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // HH:MM
        System.out.println("Lesson begins at: ");
        String hour = scanner.next();
        String[] hoursMinutes = hour.split(":");



        int hours, minutes;
        hours = Integer.parseInt(hoursMinutes[0]);
        minutes = Integer.parseInt(hoursMinutes[1]);

        minutes += 45;
        if( minutes>=60){
            hours +=1;
            minutes-=60;
            if(hours==24){
                hours=0;
            }
        }
        // String minutesText = minutes < 10 ? "0" : "" + minutes; TERNARY OPERATOR
        String minutesText;
        if (minutes < 10) {
            minutesText = "0" + minutes;
        } else minutesText = "" + minutes;

        String hoursText;
        if (hours < 10) {
            hoursText = "0" + hours;
        } else hoursText = "" + hours;
        System.out.println("Finish: "+ hoursText + ":" + minutesText);

    }
}