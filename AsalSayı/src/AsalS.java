import java.util.Scanner;

public class AsalS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir değer giriniz");
        int n = input.nextInt();
        int bolen = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i == 1 && i == n) {
                    System.out.println(n + "Bir Asal Sayıdır.");
                    break;
                } else {
                    System.out.println(n + "Bir Asal Sayı Değildir.");
                    break;
                }
            }
        }
    }
}
