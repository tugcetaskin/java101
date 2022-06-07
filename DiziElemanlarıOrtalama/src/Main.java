public class Main {
    public static void main(String[] args) {

        int [] arr = {100,120};

        float toplam=0;
        double result;

        for (int i : arr) {
            toplam+= 1f/i;
        }

        result= arr.length/toplam ;

        System.out.println(result);



    }
}
