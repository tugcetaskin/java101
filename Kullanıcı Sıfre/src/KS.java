import java.util.Scanner;

public class KS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName, password, x, y;

        System.out.println("Kullanıcı adı belirleyiniz:");
        x = input.nextLine();

        System.out.println("Bir şifre belirleyiniz:");
        y = input.nextLine();

        System.out.println("Kullanıcı adını giriniz:");
        userName = input.nextLine();

        System.out.println("Şifrenizi giriniz:");
        password = input.nextLine();

        if (userName.equals(x) && password.equals(y)) {

            System.out.println("Sisteme Giriş Yaptınız.");

        } else {

            System.out.println("Girdiğiniz bilgiler hatalıdır. \nŞifrenizi mi unuttunuz?");

            System.out.println("Evet ise 1 Hayır ise 2 yazınız. ");
            int cevap= input.nextInt();
            input.nextLine();

            switch (cevap) {

                case 1:
                    System.out.println("Lütfen yeni bir şifre giriniz: ");
                    String password2;
                    password2 = input.nextLine();

                    if (password2.equals(y)) {

                        System.out.println("Yeni şifreniz eskisi ile aynı olamaz. \nLütfen yeniden deneyiniz :");
                        String password3;
                        password3 = input.nextLine();
                        System.out.println("Şifreniz sıfırlandı.");

                    }else {
                        System.out.println("Şifreniz sıfırlandı");
                    }
                    break;
                case 2 :
                    System.out.println("Şifrenizi giriniz.");
                    break;

            }
        }





    }
}
