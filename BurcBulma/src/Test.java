import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String ay;
        System.out.println("Doğduğunuz ayı giriniz:");
        ay = input.nextLine();

        int gun;
        System.out.println("Doğduğunuz günü giriniz:");
        gun = input.nextInt();

        switch (ay) {

            case "Ocak":
                if (gun<=20) {
                    System.out.println("Oğlak burcusunuz");

                }else if (gun >=21) {
                    System.out.println("Kova Burcusunuz");
                }
                break;

            case "Şubat" :
                if (gun<=19) {
                    System.out.println("Kova Burcusunuz");
                }
                else if (gun>=20) {
                    System.out.println("Balık Burcusunuz");
                }
                break;

            case "Mart" :
                if (gun<=20) {
                    System.out.println("Balık Burcusunuz");
                }
                else if (gun>20) {
                    System.out.println("Kova Burcusunuz.");
                }
                break;

            case "Nisan" :
                if (gun<=20) {
                    System.out.println("Kova Burcusunuz.");
                }
                else {
                    System.out.println("Boğa burcusunuz.");
                }
                break;

            case "Mayıs" :
                if (gun<=20) {
                    System.out.println("Boğa burcusunuz.");
                }
                else {
                    System.out.println("İkizler Burcusunuz.");
                }
                break;

            case "Haziran" :
                if (gun<=21) {
                    System.out.println("İkizler Burcusunuz.");
                }
                else {
                    System.out.println("Yengeç Burcusunuz.");
                }
                break;

            case "Temmuz" :
                if (gun<=22) {
                    System.out.println("Yengeç Burcusunuz.");
                }
                else {
                    System.out.println("Arslan Burcusunuz.");
                }
                break;

            case "Ağustos" :
                if (gun<=23) {
                    System.out.println("Arslan Burcusunuz.");
                }
                else {
                    System.out.println("Başak Burcusunuz.");
                }
                break;

            case "Eylül" :
                if (gun<=23) {
                    System.out.println("Başak Burcusunuz.");
                }
                else {
                    System.out.println("Terazi Burcusunuz.");
                }
                break;

            case "Ekim" :
                if (gun<=23) {
                    System.out.println("Terazi Burcusunuz.");
                }
                else {
                    System.out.println("Akrep Burcusunuz.");
                }
                break;

            case "Kasım" :
                if (gun<=22) {
                    System.out.println("Akrep Burcusunuz.");
                }
                else {
                    System.out.println("Yay Burcusunuz.");
                }
                break;

            case "Aralık" :
                if (gun<=21) {
                    System.out.println("Yay Burcusunuz.");
                }
                else {
                    System.out.println("Oğlak burcusunuz");
                }
                break;
        }









    }
}
