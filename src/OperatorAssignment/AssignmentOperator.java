package OperatorAssignment;

import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1
//        System.out.println("Enter you value");
//        int x = sc.nextInt();
//        System.out.println((((x+8)/3)%5)*5);

        //2
//        System.out.println("Number before swapping");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a+" "+b);
//        System.out.println("Number after swapping");
//        a = a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a+" "+b);

        //3
//        System.out.println("Enter three digit number");
//        int num = sc.nextInt();
//        int sum = 0;
//        while(num>0){
//            sum = sum + num%10;
//            num = num/10;
//        }
//        System.out.println(sum);

        //4
//        int a = 50,b=70;
//        System.out.println((a<50) && (a<b));
//        System.out.println((a<50) || (a<b));

        //5
//        int flips = 0;
//        int a = 65,b = 80;
//        while(a>1 || b>1){
//            int t1 = (a&1);
//            int t2 = (b&1);
//            if(t1!=t2){
//                flips++;
//            }
//            a>>>=1;
//            b>>>=1;
//        }
//        System.out.println(flips);


//        int flips =0;
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int n = a^b;
//        while(n!=0){
//            n = n & (n-1);
//            flips++;
//        }
//        System.out.println(flips);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Integer.bitCount((a^b)));

    }
}
