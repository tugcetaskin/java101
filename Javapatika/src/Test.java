import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int matematik, fizik, kimya, tarih, muzik, turkce;

        Scanner input= new Scanner (System.in);

        System.out.println("Matematik Notunuz :");
        matematik= input.nextInt();

        System.out.println("Fizik Notunuz :");
        fizik= input.nextInt();

        System.out.println("Kimya Notunuz :");
        kimya= input.nextInt();

        System.out.println("Tarih Notunuz :");
        tarih= input.nextInt();

        System.out.println("Müzik Notunuz :");
        muzik= input.nextInt();

        System.out.println("Türkçe Notunuz :");
        turkce= input.nextInt();

        int toplam= (matematik+fizik+kimya+muzik+tarih+turkce);
        double ortalama= toplam/6;

        System.out.println("Ortalamanız : " + ortalama );

        boolean sonuc = ortalama >= 60;

        String str = (sonuc) ? "Geçtiniz." : "Kaldınız." ;
        System.out.println(str);




    }
}
