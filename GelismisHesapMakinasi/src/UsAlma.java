import java.util.Scanner;

public class UsAlma {

    static int toplama(int n, int y) {

        int result = n + y;
        return result;
    }

    static int cikartma(int n, int y) {

        int result = n - y;
        return result;
    }

    static int carpma(int n, int y) {

        int result = n * y;
        return result;
    }

    static int bolme(int n, int y) {

        int result = n / y;
        return result;
    }

    static int usAlma(int n, int y) {

        int result = 1;
        int i = y;
        while (i != 0) {
            result *= n;
            i--;
        }
        return result;
    }

    static int modAlma(int n, int y) {

        int result = n % y;
        return result;
    }

    static void dikdortgen(int n, int y) {

        int x = n * y;
        int z = 2 * (n + y);
        System.out.println("Alan :" + x + "Çevre :" + z);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String menu = "1. Toplama İşlemi\n" +
                "2. Çıkartma İşlemi\n" +
                "3. Çarpma İşlemi\n" +
                "4. Bölme İşlemi\n" +
                "5. Üs Alma İşlemi\n" +
                "6. Mod Alma İşlemi\n" +
                "7. Dikdörtgen Alan ve Çevre Hesabı\n" +
                "8. Çıkış Yap";
        System.out.println(menu);

        while (true) {
            System.out.println("Yapmak istediğiniz işlemi seçiniz:");
            int i = input.nextInt();

            System.out.println("Birinci sayıyı giriniz :");
            int n = input.nextInt();
            System.out.println("İkinci sayıyı giriniz :");
            int y = input.nextInt();

            if (i == 1) {
                System.out.println(toplama(n, y));
            } else if (i == 2) {
                System.out.println(cikartma(n, y));
            } else if (i == 3) {
                System.out.println(carpma(n, y));
            } else if (i == 4) {
                System.out.println(bolme(n, y));
            } else if (i == 5) {
                System.out.println(usAlma(n, y));
            } else if (i == 6) {
                System.out.println(modAlma(n, y));
            } else if (i == 7) {
                dikdortgen(n, y);
            } else {
                System.out.println("Çıkış yaptınız.");
            }
        }
    }
}
