import java.util.Scanner;

public class Sayi {
    public static void main(String[] args) {

        int n;
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        n= input.nextInt();

        for (int i=1 ; i<=n ; i*=2 ) {
            System.out.println(i);
        }
    }
}
