import java.util.Scanner;

public class VKI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double boy, kilo;
        System.out.println("Lütfen Boyunuzu (metre cinsinde) Giriniz : ");
        boy = input.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz : ");
        kilo = input.nextDouble();

        double indeks = kilo/(boy*boy) ;
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

    }
}
