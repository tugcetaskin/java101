
package M;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a=2.14 , e=3.67 , d=1.11 , m=0.95 , p= 5.0;
        double a1, e1, d1 , m1, p1;

        System.out.println("Kaç Kilo Armut Aldınız? : ");
        a1=input.nextDouble();

        System.out.println("Kaç Kilo Elma Aldınız? : ");
        e1=input.nextDouble();

        System.out.println("Kaç Kilo Domates Aldınız? : ");
        d1=input.nextDouble();

        System.out.println("Kaç Kilo Muz Aldınız? : ");
        m1=input.nextDouble();

        System.out.println("Kaç Kilo Patlıcan Aldınız? : ");
        p1=input.nextDouble();

        double tutar= (a*a1) + (e*e1) + (d*d1) + (m*m1) + (p*p1);
        System.out.println("Toplam Tutar :" + tutar);

    }
}
