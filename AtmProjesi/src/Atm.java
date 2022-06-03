import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int right=3 ;
        int bakiye=1500;
        int cevap;

        while (right>0) {

            String userName, password;
            System.out.println("Lütfen kullanıcı adını giriniz :");
            userName = input.nextLine();
            System.out.println("Lütfen parolayı giriniz :");
            password = input.nextLine();

            if ((userName.equals("patika")) && (password.equals("123"))) {
                System.out.println("Sisteme giriş yaptınız.");

                do {
                    System.out.println("1.Para Çekme\n" +
                            "2.Para Yatırma\n" +
                            "3.Bakiye Sorgulama\n" +
                            "4.Çıkış Yapma");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    cevap = input.nextInt();

                    if (cevap==1) {
                        System.out.println("Lütfen çekmek istediğiniz miktarı giriniz :");
                        int paraCekme = input.nextInt();

                        if (paraCekme<bakiye) {
                            bakiye-=paraCekme;
                        }else {
                            System.out.println("Bakiye yetersiz.");
                        }
                    }
                    else if (cevap==2) {
                        System.out.println("Yatırmak istediğiniz para miktarını giriniz :");
                        int yatırım= input.nextInt();
                        bakiye+=yatırım;
                        System.out.println(bakiye);
                    }
                    else if (cevap==3) {
                        System.out.println("Bakiye miktarınız :" + bakiye);
                    }


                }while (cevap != 4);
                System.out.println("İyi günler dileriz.");
                break;
            }
            else {
                System.out.println("Hatalı bir bilgi girdiniz. Kalan deneme hakkınız :" + --right);
            }

        }
    }
}
