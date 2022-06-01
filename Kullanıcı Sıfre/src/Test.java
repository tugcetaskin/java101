import java.util.Scanner;

public class Test {
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

            System.out.println("Sisteme giriş yaptınız.");
        }else {


        }

    }
}
