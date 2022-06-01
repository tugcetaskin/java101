import java.util.Scanner;

public class Test {
public static void main(String[]args) {

    double tutar;
    Scanner input = new Scanner(System.in);
    System.out.println("Tutar Miktarını Giriniz :");
    tutar=input.nextDouble();

    boolean kdv= tutar <=1000;
    double kdvOranı = kdv ? 0.18 : 0.8;

    System.out.println("Tutar : " + tutar);

    System.out.println("KDV Oranı : " + kdvOranı);

    double kdvTutar = tutar * kdvOranı;
    System.out.println("KDV Tutarı : " + kdvTutar);

    double toplamTutar = tutar + kdvTutar ;
    System.out.println("Toplam Tutar : " + toplamTutar);













}
}
