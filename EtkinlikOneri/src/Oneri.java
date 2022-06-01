import java.util.Scanner;

public class Oneri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bugün ne yapmalıyız?");
        int sicaklik;
        System.out.println("Lütfen sıcaklık değerini giriniz:");
        sicaklik = input.nextInt();


        boolean k1 = sicaklik <= 5;
        String oneri1 = k1 ? "Kayak yapmak için uygun bir gün!" : "\t";
        System.out.println(oneri1);


        boolean k2 = sicaklik > 5 && sicaklik <= 15;
        String oneri2 = k2 ? "Sinemaya gitmeye ne dersiniz?" : "\t";
        System.out.println(oneri2);


        boolean k3 = sicaklik > 15 && sicaklik <= 25;
        String oneri3 = k3 ? "Piknik için güzel bir gün olabilir." : "\t";
        System.out.println(oneri3);


        boolean k4 = sicaklik > 25;
        String oneri4 = k4 ? "Bu sıcak havada yüzmek iyi bir fikir." : "\t";
        System.out.println(oneri4);



    }
}
