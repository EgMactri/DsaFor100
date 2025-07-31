package Conditionals;

import java.util.Scanner;

public class NumberIsThreeDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
//        if(num >=100 && num <1000){
//            System.out.println("This is a three digit number");
//        }
//        else{
//            System.out.println("It is not a three digit number");
//        }
        if(num >9 && num<100){
            System.out.println("Two digit");
        }
    }
}
