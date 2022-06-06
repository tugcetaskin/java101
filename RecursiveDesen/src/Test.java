import java.util.Scanner;

public class Test {

    static int desenTop(int n,int i) {

        if (i>=n) return n;
        System.out.print( i + " " );
        return desenTop(n,i+5);
    }

    static int desenCik(int n) {

        if (n<=0) return n;
        System.out.print( n + " " );
        return desenCik(n-5);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir değer giriniz :");
        int n = input.nextInt();

        System.out.print(desenTop(n,desenCik(n)));
    }
}
