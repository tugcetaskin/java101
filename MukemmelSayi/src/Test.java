import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int n= input.nextInt();
        int toplam=0;

        for (int i = n; i>=1 ; --i) {

            if (n%i==0) {
                toplam+=i;

            }
        }

        if (toplam==2*n) {
            System.out.println(n + " Mükemmel Sayıdır.");
        }
    }
}
