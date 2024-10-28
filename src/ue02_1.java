import libraries.Out;

import java.util.Scanner;

public class ue02_1 {
    public static void main(String[] args) {
        int max = -999999;
        Scanner sc = new Scanner(System.in);
        int input = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter a Number: ");
            input = sc.nextInt();
            if(input >= max) {
                max = input;
            }
        }

        sc.close();

        System.out.println("The highest number is " + max);

    }
}
