import libraries.Out;

import java.util.Scanner;

public class ue02_3 {
    public static void main(String[] args) {

        int r = 4;

        Scanner sc = new Scanner(System.in);

        System.out.print("X-Coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Y-Coordinate: ");
        double y = sc.nextDouble();
        double dist = Math.sqrt((x*x) + (y*y));

        //System.out.println("//dist:"+dist+"/x:"+x+"/y:"+y);
        sc.close();

        if(dist > r && (x<=4 && y<=4) && (x>=0 && y>=0)) {
            System.out.println("It's inside the green area");
        } else {
            System.out.println("The coordinates are outside of the green area.");
        }
    }
}
