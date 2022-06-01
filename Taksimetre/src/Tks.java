import java.util.Scanner;

public class Tks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km;
        System.out.println("Kaç Km Yolculuk Yapıldığını Giriniz : ");
        km= input.nextDouble();

        double tutar = 10+ (km * 2.20);
        tutar = (tutar>=20) ? tutar : 20 ;

        System.out.println("Ödenecek Tutar : " + tutar);





    }
}
