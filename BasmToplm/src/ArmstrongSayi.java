import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Sayıyı giriniz :");
        a= input.nextInt();

        int n = a;
        int bas=0;
        int b1;
        int x;
        int result=0;

        while (n!=0) {
            n/=10;
            bas ++ ;
        }

        n=a;
        while (n!=0) {
            x= n%10;
            b1 = 1;

            for ( int i =1 ; i<=bas ; i++) {
                b1*=x;
            }
            result+= b1;
            n/=10;
        }
        System.out.println(result);

        if ( result==a) {
            System.out.println("Sayı Armstrong Sayısıdır.");
        }else {
            System.out.println("Sayı Armstrong Sayısı Değildir.");
        }


    }
}
