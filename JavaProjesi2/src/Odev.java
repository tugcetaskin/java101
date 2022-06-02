import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n ;
        int toplam = 0;

        do {
            System.out.println("Lütfen bir sayı giriniz:");
            n= input.nextInt();
            if (n%4==0){
                toplam += n;
            }
        }while (n%2==0);
        System.out.println(toplam);

    }
}
