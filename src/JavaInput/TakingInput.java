package JavaInput;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
//        String name = sc.next();
        String name = sc.nextLine();
        System.out.println("Your name is:" +name);

//        System.out.println("Enter your number:");
//        int num_1 = sc.nextInt();
//        System.out.println("Enter number is:" +num_1);

    }
}
