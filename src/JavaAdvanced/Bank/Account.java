package JavaAdvanced.Bank;


public class Account {
    protected int balance;    //protected pozwala na dostep do pola w podrzędnych klasach
    private int accountNumber;
    private Client owner;


    public Account(int accountNumber, int balance, Client owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;

    }

    public void deposit(int depositAmount)  {
        if (depositAmount < 0) {
            throw new IllegalArgumentException("Cannot deposit less than zero");
        }
        if (depositAmount > 0) {
            balance += depositAmount;
        } else {
            System.out.println("You cannot deposit less than zero!");
        }
    }

    public void withdraw(int withdrawAmount) throws NegativeBalanceException {
        if (withdrawAmount < 0) {
            throw new IllegalArgumentException("Cannot withdraw less than zero");
        }
        if (balance-withdrawAmount<0) {
            throw new NegativeBalanceException("You don't have enough money!");
        }
        if (balance - withdrawAmount > 0) {
            balance -= withdrawAmount;
        } else {

            System.out.println("You don't have enough money to withdraw");
        }
    }



    public int getBalance() {
        return balance;
    }

    public void transfer(Account accountTo, int amountToTransfer) throws NegativeWithdrawException, NegativeBalanceException {

        if (getBalance() > amountToTransfer) {
            withdraw(amountToTransfer);
            accountTo.deposit(amountToTransfer);
        } else {
            System.out.println("There is not enough money to transfer");
        }
    }

    public String toString() {
        System.out.println(super.toString());
        return "Stan konta " + accountNumber + " wynosi " + balance + " zł";
    }
}
