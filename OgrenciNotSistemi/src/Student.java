public class Student {

    Course mat;
    Course fizik;
    Course tarih;
    double verbalMat;
    double verbalFzk;
    double verbalTrh;
    String name;
    String ogNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String ogNo, String classes, Course mat, Course fizik, Course tarih) {

        this.name = name;
        this.ogNo = ogNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.tarih = tarih;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(double note1, double note2, double note3) {

        if (note1 >= 0 && note1 <= 100) {
            this.mat.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.fizik.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.tarih.note = note3;
        }
    }

    void addVerbalNote(int v1, int v2, int v3) {
        if (v1 >= 0 && v1 <= 100) {
            this.verbalMat = v1;
        }

        if (v2 >= 0 && v2 <= 100) {
            this.verbalFzk = v2;
        }

        if (v3 >= 0 && v3 <= 100) {
            this.verbalTrh = v3;
        }
    }

    void isPass() {

        printNote();

        this.avarage = ((this.mat.note * 0.8) + (this.verbalMat * 0.2) + (this.fizik.note * 0.8) + (this.verbalFzk * 0.2) + (this.tarih.note * 0.8) + (this.verbalTrh * 0.2)) / 3.0;

        if (this.avarage >= 60) {
            System.out.println("Geçtiniz.");
        } else {
            System.out.println("Kaldınız.");
        }

    }

    void printNote() {

        System.out.println("Matematik Notu:" + mat.note + "\nMatematik Sözlü Notu:" + verbalMat);
        System.out.println("--------------");
        System.out.println("Fizik Notu:" + fizik.note + " \nFizik Sözlü Notu:" + verbalFzk);
        System.out.println("--------------");
        System.out.println("Tarih Notu:" + tarih.note + " \nTarih Sözlü Notu:" + verbalTrh);
        System.out.println("--------------");
    }
}
