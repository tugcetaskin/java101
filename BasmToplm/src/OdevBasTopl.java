import java.util.Scanner;

public class OdevBasTopl {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Sayıyı giriniz :");
        n= input.nextInt();

        int basTopl=0;

        while (n!=0) {

        basTopl= basTopl+ (n%10);
        n/=10;

        }
        System.out.println(basTopl);
    }
}
