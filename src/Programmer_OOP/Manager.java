package Programmer_OOP;

public class Manager extends Employee {
    ;
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " The bonus is " + bonus;
    }

    public void doWork() {
        System.out.println("I am a manager and I get big salary");
    }

    public void paySalary() {
        System.out.println(getName() + " get " + (getSalary() + bonus));
    }
}
