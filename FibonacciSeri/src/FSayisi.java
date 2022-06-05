public class FSayisi {

    static int fSayi (int n){

        if ((n==2) || (n==1)) {
            return 1;
        }

        return fSayi(n-1) + fSayi(n-2);
    }


    public static void main(String[] args) {

        System.out.println(fSayi(6));

    }
}
