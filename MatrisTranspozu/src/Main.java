import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [][] aDizi= {  { 1,2,3 },
                { 4,5,6 }
                };

        int a=0;

        int[][] aTranspoz= new int [aDizi[0].length][aDizi.length];

        for (int i = 0 ; i< aDizi.length; i++){
            for (int y=0 ; y<aDizi[0].length; y++){
                aTranspoz[y][i]=aDizi[i][y];
            }
        }


        System.out.println("Dizinin Transpozu: ");
        for (int i = 0 ; i< aTranspoz.length; i++){
            for (int y=0 ; y<aTranspoz[i].length; y++){

                System.out.print(aTranspoz[i][y]+ "  ");
            }
            System.out.println();
        }

    }
}
