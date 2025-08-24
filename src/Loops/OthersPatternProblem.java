package Loops;

import java.util.Scanner;

public class OthersPatternProblem {

    public static void printRectangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRightAngleTriangle(int m){
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRightAngleTriangleInNumber(int a){
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printRightAngleTriangleInSameNumber(int b){
        for(int i = 1; i <= b; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void printRightAngleTriangleReverse(int c){
        for(int i = 1; i <= c; i++){
            for(int j = 1; j <= c-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRightAngleTriangleInSameNumberDown(int d){
        for(int i = 1; i <= d; i++){
            for(int j = 1; j <= d-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printPramid(int e){
        for(int i = 1; i <= e; i++){
            for(int j = 1; j < e-i+1; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Outer loop-->count the number of row
        //Inner loop-->focus on the columns and connect them
        //somewhere to the row
        //print inside inner loop
        //observe symmetry

//        int n = sc.nextInt();
//        printRectangle(n);

//        int m = sc.nextInt();
//        printRightAngleTriangle(m);

//        int a = sc.nextInt();
//        printRightAngleTriangleInNumber(a);

//        int b  = sc.nextInt();;
//        printRightAngleTriangleInSameNumber(b);

//        int c = sc.nextInt();
//        printRightAngleTriangleReverse(c);

//        int d = sc.nextInt();
//        printRightAngleTriangleInSameNumberDown(d);

        int e = sc.nextInt();;
        printPramid(e);


    }
}
