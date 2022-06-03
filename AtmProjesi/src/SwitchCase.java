import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int bakiye = 1500;
        int cevap;
        int hak=3;

        while (hak>=0){
            String userName, password;
            System.out.println("Lütfen kullanıcı adını giriniz :");
            userName = input.nextLine();
            System.out.println("Lütfen parolayı giriniz :");
            password = input.nextLine();

            if ((userName.equals("patika")) && (password.equals("123"))) {
                System.out.println("Sisteme giriş yaptınız.");
                do {
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz\n" +
                        "1.Para Çekme\n" +
                        "2.Para Yatırma\n" +
                        "3.Bakiye sorgulama\n" +
                        "4.Çıkış Yapma");
                cevap = input.nextInt();
                switch (cevap) {
                    case 1:
                        System.out.println("Çekmek istediğiniz miktarı giriniz");
                        int cekilenPara = input.nextInt();
                        if (cekilenPara > bakiye) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            bakiye -= cekilenPara;
                            System.out.println("Yeni bakiye :" + bakiye);
                        }
                        break;
                    case 2:
                        System.out.println("Yatırmak istediğiniz miktarı giriniz :");
                        int paraYatırma = input.nextInt();
                        bakiye += paraYatırma;
                        System.out.println("Yeni bakiye : " + bakiye);
                        break;

                    case 3:
                        System.out.println("Bakiye miktarınız :" + bakiye);
                        break;
                }

            } while (cevap!=4) ;
                System.out.println("İyi günler dileriz");
                break;

        } else {
                System.out.println("Hatalı bir bilgi girdiniz. Kalan deneme hakkınız : " + --hak);
            }

        }
    }
}
