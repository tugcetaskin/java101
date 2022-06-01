import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ay;
        System.out.println("Doğduğunuz ayı giriniz:");
        ay = input.nextInt();

        int gun;
        System.out.println("Doğduğunuz günü giriniz:");
        gun = input.nextInt();

        boolean b1 = ay==1 && (gun<=20);
        String str1 = b1 ? "Oğlak burcusunuz." : " " ;
        System.out.println(str1);

        boolean b2 = ay==1 && (gun>20);
        String str2 = b2 ? "Kova Burcusunuz" : " " ;
        System.out.println(str2);

        boolean b3 = ay==2 && (gun<=19);
        String str3 = b3 ? "Kova Burcusunuz" : " " ;
        System.out.println(str3);

        boolean b4 = ay==2 && (gun>20) ;
        String str4 = b4 ? "Balık Burcusunuz" : " " ;
        System.out.println(str4);

        boolean b5 = ay==3 && (gun<=20) ;
        String str5 = b5 ? "Balık Burcusunuz" : " " ;
        System.out.println(str5);

        boolean b6 = ay==3 && (gun>20) ;
        String str6 = b6 ? "Koç Burcusunuz" : " " ;
        System.out.println(str6);

        boolean b7 = ay==4 && (gun<=20) ;
        String str7 = b7 ? "Koç Burcusunuz" : " " ;
        System.out.println(str7);

        boolean b8 = ay==4 && (gun>20) ;
        String str8 = b8 ? "Boğa Burcusunuz" : " " ;
        System.out.println(str8);

        boolean b9 = ay==5 && (gun<=20) ;
        String str9 = b9 ? "Boğa Burcusunuz" : " " ;
        System.out.println(str9);

        boolean b10 = ay==5 && (gun>20) ;
        String str10 = b10 ? "İkizler Burcusunuz" : " " ;
        System.out.println(str10);

        boolean b11 = ay==6 && (gun<=21) ;
        String str11 = b11 ? "İkizler Burcusunuz" : " " ;
        System.out.println(str11);

        boolean b12 = ay==6 && (gun>21) ;
        String str12 = b12 ? "Yengeç Burcusunuz" : " " ;
        System.out.println(str12);

        boolean b13 = ay==7 && (gun<=22) ;
        String str13 = b13 ? "Yengeç Burcusunuz" : " " ;
        System.out.println(str13);

        boolean b14 = ay==7 && (gun>22) ;
        String str14 = b14 ? "Arslan Burcusunuz" : " " ;
        System.out.println(str14);

        boolean b15 = ay==8 && (gun<=23) ;
        String str15 = b15 ? "Arslan Burcusunuz" : " " ;
        System.out.println(str15);

        boolean b16 = ay==8 && (gun>23) ;
        String str16 = b16 ? "Başak Burcusunuz" : " " ;
        System.out.println(str16);

        boolean b17 = ay==9 && (gun<=23) ;
        String str17 = b17 ? "Başak Burcusunuz" : " " ;
        System.out.println(str17);

        boolean b18 = ay==9 && (gun>23) ;
        String str18 = b18 ? "Terazi Burcusunuz" : " " ;
        System.out.println(str18);

        boolean b19 = ay==10 && (gun<=23) ;
        String str19 = b19 ? "Terazi Burcusunuz" : " " ;
        System.out.println(str19);

        boolean b20 = ay==10 && (gun>23) ;
        String str20 = b20 ? "Akrep Burcusunuz" : " " ;
        System.out.println(str20);

        boolean b21 = ay==11 && (gun<=22) ;
        String str21 = b21 ? "Akrep Burcusunuz" : " " ;
        System.out.println(str21);

        boolean b22 = ay==11 && (gun>22) ;
        String str22 = b22 ? "Yay Burcusunuz" : " " ;
        System.out.println(str22);

        boolean b23 = ay==12 && (gun<=21) ;
        String str23 = b23 ? "Yay Burcusunuz" : " " ;
        System.out.println(str23);

        boolean b24 = ay==12 && (gun>21) ;
        String str24 = b24 ? "Oğlak Burcusunuz" : " " ;
        System.out.println(str24);








    }
}
