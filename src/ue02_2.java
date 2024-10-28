import libraries.Out;

import java.util.Scanner;

public class ue02_2 {
    public static void main(String[] args) {

        int month = 1;
        int year;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        year = sc.nextInt();

        System.out.print("Enter a month: ");
        do {
            if(month < 1 || month > 12){
                System.out.print("Please enter a valid month [1-12]: ");
            }
            month = sc.nextInt();
        }while(month < 1 || month > 12);

        int numDays = 30;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                numDays = checkFebruary(year);
                break;
        }

        System.out.println("The month " + month + " in the year " + year + " has " + numDays + " days.");
    }

    private static int checkFebruary(int year) {
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return 29;
        }

        return 30;
    }
}
