package JavaInput;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount: ");
        float principle = sc.nextFloat();

        System.out.println("Enter rate of interest: ");
        float rate = sc.nextFloat();

        System.out.println("Enter the time: ");
        float time = sc.nextFloat();

        float si = (principle*rate*time)/100;

        System.out.println("Principle: "+principle);
        System.out.println("Rate: "+rate);
        System.out.println("Time: "+time);
        System.out.println("Simple interest : "+si);
    }
}
