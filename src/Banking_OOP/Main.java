package Banking_OOP;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ivan", "Ivanov");
        System.out.println(p1);
        Account a1 = new Account(p1, "DE1234567", 1000);
        System.out.println(a1);

        Account a2 = new Account(new Person("Irina", "Ivanova"), "DE12345678", 1500);

        Account[] accounts = {a1, a2,
                new Account(new Person("Oleg", "Olegov"), "IT12345678", 100),};

        BankProccessing proccessing = new BankProccessing(accounts);
        System.out.println(proccessing.toSecoureString());

        System.out.println(a1.secureToString());

        System.out.println(proccessing.getSumOfAccounts());
    }
}
