import java.util.Scanner;

public class HR2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Please enter a number :");
        n= input.nextInt();

        if ((n>=1) && (n<=100)) {


            if ((n % 2 == 0) && (n >= 2) && (n <= 5)) {
                System.out.println("Not Weird");
            } else if ((n % 2 == 0) && (n >= 6) && (n <= 20)) {
                System.out.println("Weird");
            } else if ((n % 2 == 0) && (n > 20)) {
                System.out.println("Not Weird");
            } else if (n % 2 == 1) {
                System.out.println("Weird");
            }
        }else {
            System.out.println("You Entered an Invalid Number");
        }

    }
}
