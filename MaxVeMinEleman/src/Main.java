import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir değer giriniz :");
        int i= input.nextInt();

        int [] arr = {67, 42, 84, -20 , -1, 21, 92};

        int max = arr[0];
        int min = arr[0];

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int y : arr) {
            if (i< y) {
                max=y;
                break;
            }
            if (i> y) {
                min=y;
            }
        }

        System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + min);



        System.out.println("En küçük değer : " + arr[0] + "\nEn büyük değer : " + arr[arr.length-1]);


    }
}
