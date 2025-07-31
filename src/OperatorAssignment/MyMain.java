package OperatorAssignment;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // System.out.println((((x+8)/3)%5)*5);

        // int a=10,b=20;
        // System.out.println("a and b:"+a+","+b);
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println("a and b:"+a +"," +b);

        // int num = sc.nextInt();
        // int sum = 0;
        // while(num>0){
        // sum = sum+num%10;
        // num = num/10;
        // }
        // System.out.println(sum);

        int a = 55, b = 70;
        System.out.println((a < 50) && (a < b));
        System.out.println((a < 50) || (a < b));
    }
}