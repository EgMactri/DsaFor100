package Loops;

//import java.math.BigInteger;
import java.lang.Math;
import java.util.Scanner;


public class ProblemsOnLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1-->Count the number of digits for a given number n
//        int num = sc.nextInt();
//        int count = 0;
//        while(num > 0){
//            num = num / 10;
//            count ++;
//        }
//        System.out.println(count);

        //2-->Find the sum of digits in a given number n
//        System.out.print("Enter a natural number: ");
//        int num  = sc.nextInt();
//        int sum = 0;
//        while(num>0){
//            sum += num % 10;
//            num /= 10;
//        }
//        System.out.println("The sum of digit of given natural number is : "+sum);

        //3-->Reverse the digit of a number
//        int num = sc.nextInt();
//        int reverse = 0;
//        while(num >0){
//            reverse = (reverse* 10 + num % 10);
//            num = num /10;
//        }
//        System.out.println(reverse);

        //4-->Find the sum of the following series
        //Doubt arise but clear --first give input number than check on by one according to the rule u write
//        int num = sc.nextInt();
//        int total = 0;
//        for(int i = 1 ; i <= num; i++) {
//            if (i % 2 == 0) {
//                total -= i;
//            } else {
//                total += i;
//            }
//        }
//        System.out.println(total);

        //5-->Print the first n factorial number
        //NOTE: for bigInt you should first import than intialize
        //for multiply use x.multiply(BigInteger.valueOg(y));
//        long num = sc.nextLong();
//        BigInteger fact  = BigInteger.ONE;
//        for( int i = 1 ;  i <= num ; i++){
//            fact = fact.multiply(BigInteger.valueOf(i));
//            System.out.println("Factorial of " + i + " : " + fact);
//        }
//       System.out.println(fact);

        //6-->Given 2 number a and b. Find a raise to the power b(use pow)
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int ans = 1;
//        for(int i = 1; i <= b; i++ ){
//            ans *= a;
//        }
//        System.out.println(ans);
//        //using of pow method
//        System.out.println(Math.pow(a,b));
    }
}
