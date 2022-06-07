public class Main {

    public static void main(String[] args) {


        Fighter f1 = new Fighter("Kara Şimşek", 10, 100, 80, 100);
        Fighter f2 = new Fighter("Uçan Karınca", 15, 98, 65, 70);

        Match match = new Match(f1, f2, 110, 60);
        match.run();



    }
}
