package Comperable;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                name +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
