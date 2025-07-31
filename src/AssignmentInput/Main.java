package AssignmentInput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter name,roll number and field of interest :");
        // String first_name = sc.next();
        // String last_name = sc.next();
        // int roll_no = sc.nextInt();
        // String field_of_interest = sc.next();
        // System.out.println("Name: " +first_name + " "+ last_name);
        // System.out.println("Roll number: " +roll_no);
        // System.out.println("Field of interest: " +field_of_interest);

        // String a = sc.nextLine();
        // String b = sc.nextLine();
        // System.out.println(a+b);

        // int sub_1 = sc.nextInt();
        // int sub_2 = sc.nextInt();
        // int sub_3 = sc.nextInt();
        // float total_marks = sub_1+sub_2+sub_3;
        // float percentage = (total_marks*100)/300;
        // System.out.println("Total marks : " +total_marks);
        // System.out.println("Percentage marks : "+percentage);

        // int t = sc.nextInt();
        // for(int i = 1 ; i<=t; i++){
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println(a+b);
        // }
        //
        while (sc.hasNextLine()) {
            String a = sc.next();
            String b = sc.next();
            System.out.println(a + b);
        }
    }
}
