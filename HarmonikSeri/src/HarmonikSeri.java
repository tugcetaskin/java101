import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz :");
        int n= input.nextInt();
        double toplam=0.0;

        for ( double i = 1 ; i<=n ; i++) {
            toplam+=1.0/i;
        }
        System.out.println(toplam);
    }
}
