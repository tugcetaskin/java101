import java.util.Scanner;

public class Test {
public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    int kenar1, kenar2 ;

    System.out.println("1. Kenarı Giriniz : ");
    kenar1=input.nextInt();

    System.out.println("2. Kenarı Giriniz :");
    kenar2 = input.nextInt();

    double kenar3 = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
    System.out.println("Hipotenüs : " + kenar3);

    double u= (kenar1+kenar2+kenar3)/2;
    double cevre = 2 * u ;
    System.out.println("Üçgenin Çevresi : " + cevre);

    double alan = Math.sqrt(u* (u-kenar1)*(u-kenar2)*(u-kenar3));
    System.out.println("Üçgenin Alanı : " + alan);





}
}
