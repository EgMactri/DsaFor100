package AssignmentOnConditionals;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the length : ");
//        int length = sc.nextInt();
//        System.out.print("Enter the breadth : ");
//        int breadth = sc.nextInt();
//        if(length == breadth){
//            System.out.println("It is square");
//        }else{
//            System.out.println("It is rectangle");
//        }

//        System.out.print("Enter your number: ");
//        int num = sc.nextInt();
//        if(num<0){
//            num = num*-1;
//            System.out.print("The absolute value is: "+num);
//        }

//        System.out.print("Enter the Cost price : ");
//        int CP = sc.nextInt();
//        System.out.print("Enter the Selling price : ");
//        int SP = sc.nextInt();
//        int amount;
//        if(SP > CP){
//            amount = SP-CP;
//            System.out.print("Profit : "+amount);
//        }else if(CP > SP)  {
//            amount= CP-SP;
//            System.out.println("Loss : "+amount);
//        }else{
//            System.out.println("No Profit No Loss");
//        }

//        System.out.print("Enter your number: ");
//        int num = sc.nextInt();
//        if(num<0){
//            System.out.println("The number is  negative and skipped");
//        }else{
//            System.out.println(num);
//        }


//        System.out.println("Enter your operator:(+,_,*,/):-");
//        char op = sc.next().charAt(0);
//        System.out.println("Enter two number: ");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        switch (op){
//            case '+':
//                System.out.println(num1+num2);
//                break;
//            case '-':
//                System.out.println(num1-num2);
//                break;
//            case '*':
//                System.out.println(num1*num2);
//                break;
//            case '/':
//                System.out.println(num1/num2);
//                break;
//            default:{
//                System.out.println("Invalid operator");
//            }
//        }

//        System.out.println("Enter your marks: ");
//        int marks = sc.nextInt();
//        if(marks>90 && marks <=100){
//            System.out.println("Your Grade is A+");
//        }else if(marks>80 && marks <=90){
//            System.out.println("Your Grade is A");
//        }else if(marks>70 && marks <=80){
//            System.out.println("Your Grade is B+");
//        }else if(marks>60 && marks <=70){
//            System.out.println("Your Grade is B");
//        }else if(marks>50 && marks <=60){
//            System.out.println("Your Grade is C");
//        }else if(marks>40 && marks <=50){
//            System.out.println("Your Grade is D");
//        }else if(marks>30 && marks <=40){
//            System.out.println("Your Grade is E");
//        }else if(marks>0 && marks <=30){
//            System.out.println("Your Grade is F");
//        }else{
//            System.out.println("Enter valid marks");
//        }
        System.out.print("Enter the marks : ");
        int marks=sc.nextInt();
        if(marks>=90)
        {
            System.out.print("Your Grade is A+");
        }else if(marks>=80)
        {
            System.out.print("Your Grade is A");
        }else if(marks>=70)
        {
            System.out.print("Your Grade is B+");
        }else if(marks>=60)
        {
            System.out.print("Your Grade is B");
        }else if(marks>=50)
        {
            System.out.print("Your Grade is C");
        }else if(marks>=40)
        {
            System.out.print("Your Grade is D");
        }else if(marks>=30)
        {
            System.out.print("Your Grade is E");
        }else if(marks<30){
            System.out.print("Your Grade is f");
        }else{
            System.out.print("Enter valid marks");
        }

    }
}
