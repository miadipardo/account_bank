package entities;

public class BankAccount {

	private String name;
	private int numberAccount;
	private double balance;
	
	public BankAccount() {
		
	}

	// contrato que a classe vai cumprir.nao sera obrigatorio dizer o saldo inicial
	public BankAccount(String name, int numberAccount) {
		this.name = name;
		this.numberAccount = numberAccount;
	}

	public BankAccount(String name, int numberAccount, double balance) {
		this.name = name;
		this.numberAccount = numberAccount;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public double getBalance() {
		return balance;
	}
    //realizando deposito, ira pegar o saldo em conta + o valor que sera depositado, amount se refere ao valor depositado
	public void deposit(double amount) {
		balance += amount;
	}
    //realizando saque, ira pegar o saldo em conta - o valor que sera retirado da conta e tambem sera cobrado a taxa de saque
	public void withdrawal(double amount) {
		balance -= amount + 5.00;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nAccount: " + numberAccount + "\nBalance: " + balance + "$";
	}
	
}
