import java.util.Scanner;

public class Aasal {

    static boolean isAsal (int n,int i) {

        if ( n==2) {
            return n==2 ? true : false;
        }
        if (n%i ==0){
            return false;
        }
        if (i*i>=n) {
            return true;
        }
        return isAsal(n, i+1);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int n= input.nextInt();

        if(isAsal(n,2)){
            System.out.println( n +" sayısı asal sayıdır. ");
        }else{
            System.out.println(n + " sayısı asal sayı değildir.");
        }
    }
}
