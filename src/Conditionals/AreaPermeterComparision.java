package Conditionals;

import java.util.Scanner;

public class AreaPermeterComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length :");
        int length = sc.nextInt();
        System.out.print("Enter breadth :");
        int breadth = sc.nextInt();
        int area = length*breadth;
        int perimeter = (length+breadth)*2;
        if(area>perimeter){
            System.out.println("Area is greater than perimeter "+area);
        } else if (perimeter>area) {
            System.out.println("Perimeter is greater than area "+perimeter);
        }else{
            System.out.println("Both are equal");
        }
    }
}
