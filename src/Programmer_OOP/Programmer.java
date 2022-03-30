package Programmer_OOP;

public class Programmer extends Employee {

    public Programmer(String name, double salary) {
        super(name, salary);
    }


    public void doWork() {
        System.out.println("I am a programmer and I write code");
    }


}
