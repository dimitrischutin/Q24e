package Banking_OOP;

public class Account {

    private Person client;
    private String IBAN;
    private double balance;

    public Account(Person client, String IBAN, double balance) {
        this.client = client;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public Person getClient() {
        return client;
    }

    public String getIBAN() {
        return IBAN;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return client.toString() + '[' + IBAN + "] " + balance;

    }

    public String secureToString() {
        return client.toString() + '[' + getSecureIban() + "] " + balance;
    }

    private String getSecureIban() {
        String rez = "";
        for (int i = 0; i < IBAN.length(); i++) {
            if (i < 2 || i >= IBAN.length() - 2) {
                rez += IBAN.charAt(i);
            } else {
                rez += '*';
            }
        }
        return rez;
    }
}
