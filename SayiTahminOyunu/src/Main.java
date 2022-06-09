import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random sayi = new Random();
        int number = sayi.nextInt(100);
        System.out.println(number);

        int right = 0;
        boolean isWrong = false;
        boolean isWin = false;

        while (right < 5) {
            System.out.println("Lütfen tahmininizi giriniz: ");
            int tahmin = input.nextInt();
            if (tahmin > 99 || tahmin < 0) {
                System.out.println("Lütfen 0-100 arası bir değer giriniz. ");

                if (isWrong) {
                    System.out.println("Hatalı sayı! Kalan hakkınız :" + (5 - ++right));

                } else {
                    isWrong = true;
                    System.out.println("Tekrar yanlış bir değer girerseniz hakkınızdan düşülecektir.");

                }
                continue;
            }

            if (tahmin == number) {
                System.out.println(number + "Doğru tahmin! KAZANDINIZ!!");
                isWin = true;
                break;
            } else {

                if (tahmin > number) {
                    System.out.println(tahmin + "sayısı gizli sayıdan büyüktür.");

                } else {
                    System.out.println(tahmin + "sayısı gizli sayıdan küçüktür.");
                }
                right++;
                System.out.println("Kalan hakkınız :"+ (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Bulmanız gereken sayı : " + number);

        }
    }
}
