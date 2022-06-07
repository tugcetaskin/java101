public class Main {
    public static void main(String[] args) {

        Teacher t3= new Teacher("Mahmut Hoca", "5551", "TRH");
        Teacher t1 = new Teacher("Süleyman Hoca", "1212", "MAT");
        Teacher t2=new Teacher("Sinan Hoca", "1334", "FZK");

        Course tarih= new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t3);

        Course mat = new Course("Matematik", "102", "MAT");
        mat.addTeacher(t1);

        Course fizik= new Course("Fizik", "101", "FZK");
        fizik.addTeacher(t2);

        Student s1= new Student("Tuğçe", "328", "12", mat, fizik, tarih);
        s1.addBulkExamNote(100,85,45);
        s1.addVerbalNote(20,80,92);
        s1.isPass();


    }
}
