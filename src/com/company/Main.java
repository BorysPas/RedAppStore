package com.company;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Main {
    public static void main(String[] args){
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE, MMMM d, yyyy");
        Calendar calendar = new GregorianCalendar(2020, Calendar.JANUARY , 1);

        calendar.add(Calendar.DATE, 4);
        System.out.println(dateFormat.format(calendar.getTime()));
      //  System.out.println(calendar.get((Calendar.DAY_OF_WEEK == 1) ? "weekend": "work");
        System.out.println((calendar.get(Calendar.DAY_OF_WEEK) == 1)||(calendar.get(Calendar.DAY_OF_WEEK) == 7) ? "weekend" : "work");
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(weekendOrNot(calendar.get(Calendar.DAY_OF_WEEK)));

 /*       System.out.println("Punkt meni(1-10):");
        int i;
        do {
            i = getInt();
            switch(i) {
             case 1:
                System.out.println("Punkt meni---" + i);
             case 0:
                System.out.println("Game over");
                break;
             default:
                System.out.println("Od 1 do 10!");}
        }
        while (i != 0);
 */   }
    public static boolean weekendOrNot(int arg){
        return ((arg == 1) || (arg == 7) ? true : false);
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
