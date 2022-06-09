

public class Main {

    static boolean isPalindrom (String word){
        for (int i = 0 ; i<word.length(); i++){
            for (int n= word.length()-1;n>i ; n--){
                if (word.charAt(n)==word.charAt(i)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println(isPalindrom("anne"));




    }
}
