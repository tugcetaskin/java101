import java.util.Scanner;

public class HM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2;
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz: ");
        n2 = input.nextInt();

        int secim;
        System.out.println("İşlem seçimini yapınız.");
        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        secim=input.nextInt();

        switch (secim) {
            case 1 :
                System.out.println("Toplama işleminin sonucu : " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkartma işleminin sonucu : " + (n1-n2));
                break;
            case 3 :
                System.out.println("Çarpma işleminin sonucu : " + (n1*n2));
                break;
            case 4 :
                System.out.println("Bölme işleminin sonucu " + (n1/n2));
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz.");

        }


    }
}
