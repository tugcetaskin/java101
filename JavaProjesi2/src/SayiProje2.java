import java.util.Scanner;

public class SayiProje2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int toplam =0 ;


        do {
            System.out.println("Lütfen bir sayı giriniz.");
            n= input.nextInt();

            if (n%2==1) {
                toplam += n ;
            }
        } while (n>=0);
            System.out.println("Toplam : " + toplam);
        }

    }
