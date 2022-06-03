import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz :");
        int n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz :");
        int n2 = input.nextInt();

        int ebob=1;
        int ekok;

        if (n1<=n2) {

            for (int i = n1 ; i>1; --i) {

                if ( n1%i==0 && n2%i==0) {
                    ebob = i;
                    System.out.println("Ebob :" +ebob);
                    break;
                }
            }
            ekok = (n1*n2)/ebob;
            System.out.println("Ekok : " + ekok);
        }
        else {

            for (int i = n2 ; i>1; --i) {
                if ( n1%i==0 && n2%i==0) {
                    ebob = i;
                    System.out.println("Ebob :" +ebob);
                    break;
                }
            }
            ekok = (n1*n2)/ebob;
            System.out.println("Ekok : " + ekok);
        }
    }
}
