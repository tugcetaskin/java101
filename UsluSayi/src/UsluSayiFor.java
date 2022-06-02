import java.util.Scanner;

public class UsluSayiFor {
    public static void main(String[] args) {

        int x, y;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayıyı giriniz :");
        x= input.nextInt();

        System.out.println("Üslü değeri giriniz :");
        y= input.nextInt();

        int s=1;

        for (int i =1; i<=y ; i++) {
            s*=x;
        }
        System.out.println(s);

    }
}
