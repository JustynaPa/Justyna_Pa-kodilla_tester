package homework;

public class ATMsystem {

    private CashSlot cashSlot;

    public ATMsystem(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw (Account account, int amount) {
        if (account.getBalance() >= amount && amount > 0 ) {
            cashSlot.dispense(amount);
        }
        account.debit(amount);
    }

    public String cashFlowProcess(Account account, int amount) {
        if (amount <= 0) {
            return "An invalid requested amount has been provided. Try again.";
        } else if (account.getBalance() < amount) {
            return "The amount requested exceeds the limit of available funds.";
        }
            return "The operation was successful. Thank you for using our services.";
    }

    public String displayBalance(Account account) {
        return "Your account balance is: $" + account.getBalance();
    }
}
