import java.util.Scanner;

public class GecmeDurumu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ma, f, t, k, m;
        System.out.println("Matematik notunu giriniz :");
        ma = input.nextInt();

        System.out.println("Fizik notunu giriniz :");
        f = input.nextInt();

        System.out.println("Türkçe notunu giriniz :");
        t = input.nextInt();

        System.out.println("Kimya notunu giriniz :");
        k = input.nextInt();

        System.out.println("Müzik notunu giriniz :");
        m = input.nextInt();

        if ((ma>0 && ma<100) && (f>0 && f<100) && (t>0 && t<100) && (k>0 && k<100) && (m>0 && m<100)) {

            System.out.println("Not ortalamanız:");
            int ortalama = (ma + f + t + k + m)/5 ;
            System.out.println(ortalama);

            if (ortalama<55) {

                System.out.println("Kaldınız.");

            } else {

                System.out.println("Geçtiniz.");
            }
        }else {

            System.out.println("Geçersiz bir değer girdiniz.");
        }






    }
}
