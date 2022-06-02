import java.util.Scanner;

public class SP {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int n;
        System.out.println("Sayıyı giriniz:");
        n= input.nextInt();
        int i =0;
        int toplam =0 ;

        for (i=1; i<=n ; i++) {
            if ((i%3==0) && (i%4==0)){

                toplam = toplam + i ;
                System.out.printf("Toplam" , toplam, i);
            }
        }

    }
}
