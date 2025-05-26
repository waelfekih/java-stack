public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    public static int accounts = 0;
    public static double totalHolding = 0 ;
    public static double totalMoney = 0; // refers to the sum of all bank account checking and savings balances
    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        //this.totalMoney = totalMoney ;
        BankAccount.accounts += 1;

    }
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public int getAccounts() {
        return this.accounts;
    }

    public double getTotalMoney() {
        return this.totalMoney;
    }

    // SETTERS
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public void setSavingBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance ;
    }

    public void setAccounts(int accounts) {
        this.accounts = accounts ;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney ;
    }
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void depositMoney(double amount , String account) {
        if (account.equals("checking")) {
            this.checkingBalance += amount ;
        } else if (account.equals("savings")) {
            this.savingsBalance += amount ;
        }
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdrawMoney(double amount, String account) {
        if (account.equals("checking")) {
            if (amount <= this.checkingBalance) {
                this.checkingBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient money in checking account");
            }
        } else if (account.equals("savings")) {
            if (amount <= this.savingsBalance) {
                this.savingsBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient money in savings account");
            }
        }
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void displayAccountBalance() {
		System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsBalance, this.checkingBalance));
	    }
    }

