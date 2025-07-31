package Conditionals;

import java.util.Scanner;

public class GreatestOfThreeByNesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
//        int greatest = num1;
//        if(num2>greatest){
//            if(num2>num3){
//                greatest=num2;
//            }else{
//                greatest=num3;
//            }
//        } else if (num3>greatest) {
//            greatest=num3;
//        }else {
//            greatest=num1;
//        }
//        System.out.println(greatest);

//        int greatest;
//        if(num1>num2){
//            if(num1>num3){
//                greatest=num1;
//            }else{
//                greatest=num3;
//            }
//        }else{
//            if(num2>num3){
//                greatest=num2;
//            }else{
//                greatest=num3;
//            }
//        }
//        System.out.println(greatest);

        int least;
        if(num1<num2){
            if(num1<num3){
                least=num1;
            }else{
                least=num3;
            }
        }else{
            if(num2<num3){
                least=num2;
            }else{
                least=num3;
            }
        }
        System.out.println(least);
    }
}
