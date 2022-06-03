import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Bir değer giriniz:");
        int n= input.nextInt();
        int toplam=0;
        int i;

        for (i =1 ; i<=n ; i++) {
            toplam+=i;
            System.out.println(i-1 +"+"+ i+ "="+toplam);

        }
    }
}
