package application;

import javax.swing.JOptionPane;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instanciação da classe bankAccount
		BankAccount account = new BankAccount();

		int numberAccount = Integer.parseInt(JOptionPane.showInputDialog("Number account: "));
		String name = JOptionPane.showInputDialog("Holder name: ");
		String question = JOptionPane.showInputDialog("Want you a initial deposit y/n?");

		// verificando se tera deposito inicial
		if (question.equalsIgnoreCase("y")) {

			double balance = Double.parseDouble(JOptionPane.showInputDialog("Initial deposit: "));
			// enviando dados para classe
			account = new BankAccount(name, numberAccount, balance);

			System.out.println("Account data: ");
			System.out.println(account);
		} else {

			// enviando dados para classe caso o usuario não queira iniciar com um deposito
			account = new BankAccount(name, numberAccount);
			System.out.println("Account data: ");
			System.out.println(account);
		}

		System.out.println("=============== DEPOSIT ===============");

		double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter a deposit value: "));
		account.deposit(amount);
		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.println("=============== WITHDRAW ===============");

		amount = Double.parseDouble(JOptionPane.showInputDialog("Enter a withdraw value: "));
		account.withdrawal(amount);
		System.out.println("Updated account data: ");
		System.out.println(account);
	}

}
