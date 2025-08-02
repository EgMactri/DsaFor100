package Loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //While loop
        /*   while(condition){
                //code
        * }*/

        //1--> N natural number

//        int n = sc.nextInt();
//        int num  = 1;
//        while(num <=n){
//            System.out.println(num);
//            num++;
//        }

        //2--> N natural number in reverse

//        int n = sc.nextInt();
//        int num = 1;
//        while(num <= n){
//            System.out.println(n);
//            n--;
//        }

        //3--> sum of N natural number

//        int n = sc.nextInt();
//        int sum = 0;
//        int num = 1;
//        while(num <= n){
//            sum = sum + num;
//            num++;
//        }
//        System.out.println(sum);

        //4-->sum of the stream of integer

//        int num = sc.nextInt();
//        int sum = 0;
//        while(num != -1){
//            sum += num;
//            num = sc.nextInt();
//        }
//        System.out.println(sum);

        //4-->sum of the stream of integer using Break

//        int num = sc.nextInt();
//        int sum = 0;
//        while(true){
//            sum += num;
//            num = sc.nextInt();
//            if(num == -1) break;
//        }
//        System.out.println(sum);

        //6-->First multiple of 5 which also multiple of 7
        int num = 1;
        while(true){
            if(num % 5 == 0 && num % 7 ==0){
                System.out.println("Found ans " + num);
                break;
            }
            num++;
        }
    }
}
