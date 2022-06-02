import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {


        int i;
        int total = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayıyı giriniz :");
        i= input.nextInt();


        for (int s = 1; s<=i ; s++) {

            total= total*s ;

        }
        System.out.println(total);
    }
}
