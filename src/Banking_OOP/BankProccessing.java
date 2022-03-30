package Banking_OOP;

public class BankProccessing {

    private Account[] bankAccounts;

    public BankProccessing(Account[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public Account[] getBankAccounts() {
        return bankAccounts;
    }

    @Override
    public String toString() {
        String rez = "[";
        for (int i = 0; i < bankAccounts.length; i++) {
            rez += bankAccounts[i].toString() + ",   " + System.lineSeparator();
        }
        rez += "]";
        return rez;
    }


    public String toSecoureString() {
        String rez = "[";
        for (int i = 0; i < bankAccounts.length; i++) {
            rez += bankAccounts[i].secureToString() + ",   " + System.lineSeparator();
        }
        rez += "]";
        return rez;

    }

    public double getSumOfAccounts() {
        double res = 0;
        for (int i = 0; i < bankAccounts.length; i++) {
            res += bankAccounts[i].getBalance();
        }
        return res;
    }

}