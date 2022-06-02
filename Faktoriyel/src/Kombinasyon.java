import java.util.Scanner;

public class Kombinasyon  {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n , r;
        int f1=1 ;
        int f2=1 ;
        int f3 =1;

        System.out.println("Birinci sayıyı giriniz :");
        n= input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        r= input.nextInt();
        int e= n-r;

        for (int s=1 ; s<=n ; s++) {
            f1= f1*s;
        }
        for (int s=1 ; s<=r ; s++) {
            f2= f2*s;
        }
        for (int s=1; s<=e ; s++ ) {
            f3 = f3*s;
        }

        int k = f1/(f2*f3);
        System.out.println(k);
    }
}
