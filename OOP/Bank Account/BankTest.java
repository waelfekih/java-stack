class BankTest {
    public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.depositMoney(100.49, "checking");
		ba.depositMoney(3.00, "savings");
		ba.displayAccountBalance();

		System.out.println(BankAccount.totalMoney);

		ba.withdrawMoney(50, "checking");
		ba.withdrawMoney(50, "savings");
		ba.displayAccountBalance();

		System.out.println(BankAccount.totalMoney);

        BankAccount ba2 = new BankAccount();
		ba2.depositMoney(3, "checking");
		ba2.depositMoney(99, "savings");
		ba2.displayAccountBalance();
        ba2.withdrawMoney(50, "checking");
	}
}
