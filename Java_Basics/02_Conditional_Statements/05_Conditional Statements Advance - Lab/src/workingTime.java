import java.util.Scanner;

import static javax.management.Query.or;


public class workingTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time = Integer.parseInt(input.nextLine());
        String day = String.valueOf(input.nextLine());

        if (day.equals("Monday")){
            if (time >= 10){
                if (time <= 18){
                    System.out.println("open");
                }
            }else {
                System.out.println("closed");
            }
        }else if (day.equals("Tuesday")){
            if (time >= 10){
                if (time <= 18){
                    System.out.println("open");
                }
            }else {
                System.out.println("closed");
            }
        }else if (day.equals("Wednesday")){
            if (time >= 10){
                if (time <= 18){
                    System.out.println("open");
                }
            }else {
                System.out.println("closed");
            }
        }else if (day.equals("Thursday")){
            if (time >= 10){
                if (time <= 18){
                    System.out.println("open");
                }
            }else {
                System.out.println("closed");
            }
        }else if (day.equals("Friday")){
            if (time >= 10){
                if (time <= 18){
                    System.out.println("open");
                }
            }else {
                System.out.println("closed");
            }
        }else if (day.equals("Saturday")){
            if (time >= 10){
                if (time <= 18){
                    System.out.println("open");
                }
            }else {
                System.out.println("closed");
            }
        }else if (day.equals("Sunday")){
            System.out.println("closed");
        }






        }
    }



