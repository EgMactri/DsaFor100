package Loops;

import java.util.Scanner;

public class PolPatternPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nested loop-->loop inside loop is nested loop
        int n  = sc.nextInt();
        for (int i  = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n; j++){
                System.out.println(i+ ""+j);
            }
        }

    }
}
