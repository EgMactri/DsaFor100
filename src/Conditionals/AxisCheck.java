package Conditionals;

import java.util.Scanner;

public class AxisCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y value: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x==0 && y ==0){
            System.out.println("The point is origin");
        } else if (x==0) {
            System.out.println("The point lie on y axis");
        }else if (y==0){
            System.out.println("The point lie on x axis");
        }else{
            System.out.println("Not exact x or y axis");
        }
    }
}
