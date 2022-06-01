import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double r , acı;
        System.out.println("Dairenin Yarıçapını Giriniz :");
        r=input.nextDouble();

        double pi = 3.14 ;
        double alan = pi * r * r ;
        double cevre = 2 * pi * r ;

        System.out.println("Dairenin Çevresi :" + cevre);
        System.out.println("Dairenin Alanı : " + alan);

        System.out.println("Daire Diliminin Açısını Giriniz : ");
        acı=input.nextDouble();

        double dilimAlan = (pi * r*r * acı) / 360 ;
        System.out.println("Daire Diliminin Alanı : " + dilimAlan);


    }
}
