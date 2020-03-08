package JavaAdvanced.Bank;

import JavaAdvanced.NegativeBalanceException;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) throws NegativeWithdrawException {

        Client pc1 = new ClientPersonal("Ewa", "Strojna");  // jak tak napiszemy to nie będziemy mogli wykorzystać metod dla
        //ClientPersonal, ponieważ "przedstawiam się" jako Client, dlatego gtrzeba rzutować
        Client bc1 = new ClientBusiness("Firma");
        Account account1 = new AccountChecking(1234, 0, pc1);
        Account account2 = new AccountCredit(9876, 5499, bc1);
        Account account3 = new AccountCredit(5674, 22300, pc1);

        ((ClientBusiness) bc1).getIDT();  //rzutowanie żeby wykorzystać metody z ClientBusiness

        System.out.println(pc1.toString());
        int action;
        do {
            Scanner scanner = new Scanner(System.in);
        /*   System.out.println("What's your account name?");
           String account=scanner.nextLine();*/
            System.out.println("What do you want to do?");
            System.out.println("1-deposit");
            System.out.println("2-withdraw");
            System.out.println("3-balance");
            System.out.println("4-transfer");
            System.out.println("0-exit");
            action = scanner.nextInt();
            try {
                switch (action) {
                    case 1:
                        System.out.println("Enter amount to deposit");
                        int amount = scanner.nextInt();
                        account1.deposit(amount);
                        break;

                    case 2:
                        System.out.println("Enter amount to withdraw");
                        amount = scanner.nextInt();
                        account1.withdraw(amount);
                        break;
                    case 3:
                        System.out.println("account 1: " + account1.balance);
                        break;
                    case 4:
                        System.out.println("Enter amount to transfer");
                        amount = scanner.nextInt();
                        account1.transfer(account2, amount);
                        break;

                }
            } catch (IllegalArgumentException e) {
                System.out.println("Obsługa catch" + e.getMessage());
            }catch (NegativeBalanceException e){
                System.out.println(e);
            } finally {
                System.out.println("Zawsze się wykonam");
            }

        }
        while (action != 0);


        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
    }
}

