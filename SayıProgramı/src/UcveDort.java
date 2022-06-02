import java.util.Scanner;

public class UcveDort {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        int n;
        System.out.println("Lütfen bir değer giriniz:");
        n= input.nextInt();
        int i =0;
        int toplam = 0;


        while (i<=n) {
            i++;

            if (i%2==0) {
                System.out.println(i);

            }

        }

    }
}
