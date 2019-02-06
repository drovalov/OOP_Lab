package Lab1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Ex1 {
    public static void main(String[] args) {
        int x,y;
        double answer;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x: ");
        x=in.nextInt();
        System.out.println("Enter y: ");
        y= in.nextInt();
        answer = pow((x/y),2);
        System.out.println("Pow 2= " + answer );

    }
}
