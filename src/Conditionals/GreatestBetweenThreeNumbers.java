package Conditionals;

import java.util.Scanner;

public class GreatestBetweenThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int greatest = num1;
        if(num2>greatest){
            greatest=num2;
        }
        if (num3>greatest) {
            greatest=num3;
        }
        System.out.println(greatest);
    }
}
