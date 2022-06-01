import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {

        int n ;
        Scanner input = new Scanner (System.in);

        n=input.nextInt();

        if ((n>=1) && (n<=100)){
            if ((n%2 ==0) && (n>=2) && (n<=5)) {
                System.out.println("Not Weird");
            }
            else if ((n%2 == 0) && (n>20)) {
                System.out.println("Not Weird") ;
            }
            else {
                System.out.println("Weird") ;
            }
        }
    }
}
