import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();

        int [] dizi= new int[n];

        System.out.println("Dizinin elemanlarını giriniz: ");


        for (int i =0 ; i< dizi.length; i++){
            System.out.println((i+1) + ". elemanı giriniz :");
            dizi [i]= input.nextInt();
        }

        System.out.println(Arrays.toString(dizi));

        Arrays.sort(dizi);
        System.out.println("Dizinin küçükten büyüğe sıralanmış hali :" + Arrays.toString(dizi));



    }
}
