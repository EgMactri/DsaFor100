package Loops;

import java.util.Scanner;

public class PolPatternPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nested loop-->loop inside loop is nested loop
//        int n  = sc.nextInt();
//        int m  = sc.nextInt();

        //1-->Rectangle pattern with n row and m column
//        for (int i  = 1 ; i <= n ; i++){
//            for (int j = 1 ; j <= m; j++){
//                System.out.print("*");
//            }
//            System.out.println();//new line
//        }

        //2-->Print rectangle with only border(Hollow rectangle)

//       for(int i = 1; i <= n; i++){
//           for(int j = 1; j <= m; j++){
//               if(i == 1 || i == n || j == 1 || j == m)
//                   System.out.print("*");
//               else
//                   System.out.print(" ");
//           }
//           System.out.println();
//       }

        //3-->Print the triangle pattern

//        int r = sc.nextInt();
//        for (int i  = 1 ; i <= r ; i++){
//            for (int j = 1 ; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();//new line
//        }

        //4-->Print tringle greater to lower
//        int r = sc.nextInt();
//        for (int i  = r ; i >= 1; i--){
//            for (int j = 1 ; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();//new line
//        }

        //5-->print triangle mid first ,print to all in last
//        int r = sc.nextInt();
//        for (int i  = 0 ; i <= r; i++){//traversing over rows
//            //print r-1 spaces
//            for (int j = 1 ; j <= r-i; j++) {
//                System.out.print(" ");
//            }
//            //print 2*i - 1
//                for(int k = 1; k <= 2*i-1; k++) {
//                    System.out.print("*");
//                }
//            System.out.println();//new line
//        }

        //6-->Numerical derivation pattern
//        int r = sc.nextInt();
//        for (int i=1; i<=r; i++){
//            for (int j=i; j<=r; j++){
//                System.out.print(j);
//            }
//            for(int k=1; k<=i-1; k++) { //1--> 1<= 1-1    2<= 2-1=1....
//                System.out.print(k);
//            }
//            System.out.println();
//        }

        //7-->print 1 to n
//        int r = sc.nextInt();
//        for (int i=1; i<=r; i++){
//            for (int j=1; j<=r; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //8-->121212   212121   121212
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        for( int i=1; i<=r; i++){
//            for(int j=1; j<=c; j++){
//                if((i+j)%2==0){
//                    System.out.print(1);
//                }else{
//                    System.out.print(2);
//                }
//            }
//            System.out.println();
//        }

        //9-->Triangle with number
//        int r = sc.nextInt();
//        for (int i  = 1 ; i <= r ; i++){
//            for (int j = 1 ; j <= i; j++){
//                System.out.print(j);
//            }
//            System.out.println();//new line
//        }

        //10-->print triangle mid first ,print to all in last(numeric value)
//        int r = sc.nextInt();
//        for (int i  = 0 ; i <= r; i++){//traversing over rows
//            //print r-1 spaces
//            for (int j = 1 ; j <= r-i; j++) {
//                System.out.print(" ");
//            }
//            //print 1 to i
//            for(int k = 1; k <= i; k++) {
//                System.out.print(k);
//            }
//            //print i-1 to 1
//            for(int l = i-1; l>=1 ; l--){
//                System.out.print(l);
//            }
//            System.out.println();//new line
//        }

        //11(?)-->print triangle mid first ,print to all in last
        int r = sc.nextInt();
        for (int i  = 1 ; i <= r; i++){//traversing over rows
            //print r-1 spaces
            for (int j = 1 ; j <= r-i; j++) {
                System.out.print(" ");
            }
            //print 2*i - 1
                for(int k = 1; k <= 2*i-1; k++) {
                    if(i==r){
                        System.out.print(i);//print i in last line
                    }
                    else if(k == 1 || k == 2*i-1) {
                        System.out.print(i);
                    }else{
                        System.out.print(" ");
                    }
                }
            System.out.println();//new line
        }

    }
}
