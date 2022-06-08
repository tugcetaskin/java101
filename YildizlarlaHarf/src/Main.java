import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[][] harf = new String[7][4];

        for (int i = 0; i < harf.length; i++) {
            for (int y = 0; y < harf[i].length; y++) {

                if (i == 0 || i == 3 || i == 6) {
                    harf[i][y] = " * ";
                }
                else if (y == 0 || y == 3) {
                    harf[i][y] = " * ";
                } else {
                    harf[i][y] = "   ";
                }
            }
        }

        for (int i = 0; i < harf.length; i++) {
            for (int y = 0; y < harf[i].length; y++) {
                System.out.print(harf[i][y]);
            }

            System.out.println();
        }
    }
}
