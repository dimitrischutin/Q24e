package Programmer_OOP;

public class Main {

    public static void main(String[] args) {
        Programmer p1 = new Programmer("P1", 1000);
        Programmer p2 = new Programmer("P2", 2000);
        QA_Engineer q1 = new QA_Engineer("Q1", 1001);
        QA_Engineer q2 = new QA_Engineer("Q2", 1500);
        Manager m1 = new Manager("M1", 10000, 1000);

        System.out.println(p1);

        Employee[] employees = {p1, p2, q1, q2};
        for (int i = 0; i < employees.length; i++) {
            employees[i].paySalary();
            employees[i].doWork();
        }

        System.out.println(m1);

        m1.paySalary();
    }
}
