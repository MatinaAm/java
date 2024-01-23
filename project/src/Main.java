// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

//        ===============assignment operator=======================
        int numberReturned = assignment();

        System.out.println("The numberReturned is " + numberReturned + " .");


//=================================age========
        int birthYear = 1993;
        int birthMonth = 10;
        int birthDay = 10;
        int age = calculateAge(birthYear, birthMonth, birthDay);
        System.out.println("The person is " + age + " years old.");


//        =========================delta===================
        maincCalculateDelta();

//        ======================

        oddOrEven(2);
        oddOrEvenDay(2);

    }



    public static int calculateAge(int year, int month, int day) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, day);
        Period period = Period.between(birthDate, currentDate);
        return period.getYears();
    }





    public static double calculateDelta(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public static void maincCalculateDelta() {
        double a = 3.0;
        double b = 6.0;
        double c = 2.0;
        double result = calculateDelta(a, b, c);
        System.out.println("Delta is: " + result);
    }



    public static int assignment(){
        int x = 2;
        x+=5;
        x-=3;
        x*=10;
        x/=2;
        x%=5;

        return  x;

    }


    //====================add or even=================================
    public static int oddOrEven(int a) {

        if(a%2 == 0 && a > 0){
            System.out.println("Even is: " + a);

        }
        else if (a%2 != 0 && a > 0 ){
            System.out.println("Odd is: " + a);

        }
        else{
            throw new RuntimeException("your number is not correct maybe is negative--my hint:)");
        }
        return  a;
    }

//    =====================days of week====

    public static void oddOrEvenDay(int day) {

        switch (day) {
            case 1:
                System.out.println("شنبه");

                break;
            case 2:
                System.out.println("یکشنبه");
                break;
            case 3:
                System.out.println("دوشنبه");
                break;
            case 4:
                System.out.println("سه شنبه");
                break;
            case 5:
                System.out.println("چهارشنبه");
                break;
            case 6:
                System.out.println("پنجشنبه");
                break;
            case 7:
                System.out.println("جمعه");
                break;
            default:
                System.out.println("Selected day is not in the list");
                break;
        }

    }

}





