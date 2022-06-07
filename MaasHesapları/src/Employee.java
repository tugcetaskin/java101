public class Employee {

    String name;
    int salary;
    int workOurs;
    int hireYear;
    int year=2021;

    Employee (String name, int salary, int workOurs, int hireYear) {
        this.name=name;
        this.salary=salary;
        this.workOurs=workOurs;
        this.hireYear=hireYear;
    }

    public double tax () {
        if (this.salary>1000) {
            double tax= this.salary * 0.03;
            return tax;
        }else {
            return 0;
        }
    }

    public double bonus () {
        if (this.workOurs>=40) {
            double bonus = (workOurs-40) * 30;
            return bonus;
        } else {
            return 0;
        }
    }

    public double raiseSalary () {
        int kYıl= year - this.hireYear;
        if (kYıl>=0 && kYıl<=9) {
            double raiseSalary = this.salary * 0.05;
            return raiseSalary;
        }
        else if (kYıl>9 && kYıl<20) {
            double raiseSalary = this.salary * 0.1;
            return raiseSalary;
        }else {
            double raiseSalary = this.salary * 0.15;
            return raiseSalary;
        }
    }

    public double toplamMaas() {
        double toplamMaas= this.salary - tax() + bonus() + raiseSalary();
        return toplamMaas;
    }

    public void print() {
        System.out.println("Ad : " + this.name +
                "\nMaaş : " + this.salary +
                "\nÇalışma Saati : " + this.workOurs +
                "\nBaşlangış Yılı : " + this.hireYear +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş Artışı : " + raiseSalary() +
                "\nToplam Maaş : " + toplamMaas());
    }
}
