import java.util.Scanner;

public class ArtıkYıl {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yıl;
        System.out.println("Yıl Giriniz:");
        yıl = input.nextInt();

        if ((yıl %100 == 0)){
            if (yıl%400==0) {
                System.out.println(yıl + " bir artık yıldır.");
            }else {
                System.out.println(yıl + " bir artık yıl değildir.");
            }

        }else if (yıl%4==0) {
            System.out.println(yıl + " bir artık yıldır.");

        }else {
            System.out.println(yıl + " bir artık yıl değildir.");
        }

    }
}
