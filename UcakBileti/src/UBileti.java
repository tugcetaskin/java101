import java.util.Scanner;

public class UBileti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int gidisD, yas, mesafe;
        System.out.println("Biletiniz tek yön ise 1, gidiş-dönüş biletiyse 2 yazınız.");
        gidisD = input.nextInt();

        System.out.println("Lütfen yaşınızı giriniz :");
        yas = input.nextInt();

        System.out.println("Lütfen yolculuk edeceğiniz mesafeyi km cinsinden yazınız :");
        mesafe = input.nextInt();

        double biletFiyati = mesafe * 0.10;

        if (mesafe>0) {
            if (gidisD==1){

                if (yas<=12) {
                    double ind1 = biletFiyati * 0.50;
                    double b1 = biletFiyati - ind1;
                    System.out.println(b1);

                }else if ((yas>12) && (yas <=24)) {
                    double ind2 = biletFiyati *0.10 ;
                    double b2 = biletFiyati - ind2 ;
                    System.out.println(b2);

                }else if (yas>=60) {
                    double ind3 = biletFiyati * 0.30;
                    double b3 = biletFiyati- ind3;
                    System.out.println(b3);

                }else if (yas<0){
                    System.out.println("Geçersiz bir değer girdiniz");

                }else {
                    System.out.println(biletFiyati);
                }

            }else if (gidisD==2){
                double ind4 = biletFiyati * 0.20;
                double b4 = biletFiyati-ind4;

                if (yas<=12) {
                    double ind5 = b4 * 0.50;
                    double b5 = b4- ind5;
                    System.out.println(b5);

                }else if ((yas>12) && (yas <=24)) {
                    double ind6 = b4 * 0.10;
                    double b6 = b4- ind6;
                    System.out.println(b6);

                }else if (yas>=60) {
                    double ind7 = b4 * 0.30 ;
                    double b7 = b4-ind7;
                    System.out.println(b7);
                }else if (yas<0) {
                    System.out.println("Geçersiz bir değer girdiniz.");

                }else {
                    System.out.println(b4);
                }

            }else if ((gidisD<1) || (gidisD>2)) {
                System.out.println("Geçersiz bir değer girdiniz.");
            }

        }else {
            System.out.println("Geçersiz bir değer girdiniz.");
        }

    }
}
