public class TekrarEdenCiftSayi {

    static boolean isFind(int arr[], int n) {
        for (int i : arr) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] dizi = {12, 9, 3, 4, 2, 12, 1, 5, 9, 2, 1, 4, 12};
        int[] copyDizi = new int[dizi.length];
        int startIndex = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int y = 0; y < dizi.length; y++) {
                if ((i != y) && (dizi[i] == dizi[y]) && (dizi[i] % 2 == 0)) {
                    if (!isFind(copyDizi, dizi[i])) {
                        copyDizi[startIndex++] = dizi[i];
                    }
                    break;

                }
            }
        }
        System.out.println("Tekrar eden çift sayılar :");
        for (int value : copyDizi) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}
