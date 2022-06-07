public class Teacher {

    String name;
    String pNumber;
    String branch;

    Teacher (String name, String pNumber, String branch) {

        this.name=name;
        this.pNumber=pNumber;
        this.branch=branch;
    }

    void print () {

        System.out.println("Adı :" + name);
        System.out.println("Telofonu :" + pNumber);
        System.out.println("Bölümü :" + branch);
    }
}
