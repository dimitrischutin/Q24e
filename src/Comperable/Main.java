package Comperable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Person[] people =
                {
                        new Person("Jack", 28),
                        new Person("Nick", 20),
                        new Person("Mike", 23),
                        new Person("Lena", 25)
                };
        System.out.println(Arrays.toString(people));
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

    }
}
