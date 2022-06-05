import java.util.Scanner;

public class Recursive {

    static int usIslem ( int n, int y){
        if (y==0) {
            return 1;
        }
        return n* usIslem(n,(y-1));
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Taban değerini giriniz :");
        int n= input.nextInt();
        System.out.println("Üs değerini giriniz");
        int y= input.nextInt();

        System.out.println(usIslem(n,y));
    }
}
