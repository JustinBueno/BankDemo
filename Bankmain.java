// Bank Demo 
// Created Dec 5, 2018
// Justin Mirabueno 



package BankDemo;

public class BankMain {

		public static void main(String[] args){

				// Create cust1 
				Account cust1 = new Account();	// Created an account object
				cust1.deposit(500);

				//Create Cust2 
				Account cust2 = new Account();
				cust2.withdraw(400);

				System.out.print("Cust1 had a balance of ");
				System.out,println(cust1.getBalance());

				System.out.print("Cust2 had a balance of ");
				System.out.println(cust2.getBalance());

		}
} 
