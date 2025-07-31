package Conditionals;

import java.util.Scanner;

public class NestingDivisibleby3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
//        if(num%3==0){
//            if (num%5==0){
//                System.out.println("Divisible 3 and 5");
//            }else{
//                System.out.println("Not divisible by 5");
//            }
//        }else{
//            System.out.println("Not divisible");
//        }


//        if(num%5==0 || num%3==0){
//            if(num%15!=0){
//                System.out.println("Divisible");
//            }
//            else{
//                System.out.println("Not divisible");
//            }
//        }else{
//            System.out.println("Not Divisible");
//        }

        if((num%3==0 || num%5==0) && (num%15!=0)){
            System.out.println("Divisible");
        }else{
            System.out.println("not");
        }
    }
}
