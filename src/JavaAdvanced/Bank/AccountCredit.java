package JavaAdvanced.Bank;

public class AccountCredit extends Account {

    public AccountCredit(int accountNumber, int balance, Client owner) {
        super(accountNumber, balance, owner);
    }

    public void withdraw(int withdrawAmount) {

            super.balance -= withdrawAmount;

    }
}
