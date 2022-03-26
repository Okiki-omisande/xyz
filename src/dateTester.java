//this program test the capabilities of class date

import java.util.Scanner;

public class dateTester {
    public static void main(String[] args) {
   date realdate = new date(0,0,0);

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter day:");
        int day = input.nextInt();
        realdate.setDay(day);

        System.out.println("Please enter month:");
        int month = input.nextInt();
        realdate.setMonth(month);

        System.out.println("Please enter year:");
        int year = input.nextInt();
        realdate.setYear(year);

       realdate.displayDate();






    }
}