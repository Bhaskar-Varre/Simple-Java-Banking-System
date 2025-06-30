import java.util.Scanner;


class BankAccount {
	private double balance = 0;
	Scanner scanner = new Scanner(System.in);
    BankAccount(){
        
		int option = 0;
		while (option != 4) {
			System.out.println("Welcome to the Bank of Java");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.print("Enter an option: ");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				checkBalance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				exit();
				break;
			default:
				System.out.println("Invalid option. Try again.");
				break;
			}
		}
		scanner.close();

    }



	 void checkBalance() {
		System.out.println("Your current balance is $" + balance);
	}

	 void deposit() {
		
		System.out.print("Enter the amount to deposit: $");
		double amount = scanner.nextDouble();
		balance += amount;
		System.out.println("$" + amount + " has been deposited to your account.");
		checkBalance();
	}

	 void withdraw() {
	
		System.out.print("Enter the amount to withdraw: $");
		double amount = scanner.nextDouble();
		if (amount > balance) {
			System.out.println("Insufficient funds.");
		} else {
			balance -= amount;
			System.out.println("$" + amount + " has been withdrawn from your account.");
		}
		checkBalance();
	}

	 void exit() {
		System.out.println("Thank you for banking with us. Have a great day!");
	}
}
public class Customer {
	public static void main(String[] args) {
	    BankAccount customer1 = new BankAccount();
		
	}
}
