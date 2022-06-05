public class Palidrom {

    static boolean isPalidrom(int n) {

        int tepm = n, reverse = 0, lastNumber;

        while (tepm != 0) {

            lastNumber = tepm % 10;
            reverse = (reverse * 10) + lastNumber;
            tepm /= 10;
        }
        if (reverse == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        System.out.println(isPalidrom(1002));

    }
}
