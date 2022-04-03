package Project;
import java.util.Scanner;

public class BankAcc {
	int balance;
	int preTran;

	public void deposite(int amount) {
		
		if(amount > 0) {
			balance=balance+amount;
			preTran=amount;
			}else {
				System.out.println("Invalid Amount");
			}
		}
	
	public void withdraw(int amount) {
		if(amount > 0) {
			balance=balance-amount;
			preTran=-amount;}
		else {
				System.out.println("Invalid Amount");	
			}
		}
	
	public void getpreTran() {
		
		if(preTran>0 ) {
			
			System.out.println("Deposited ="+preTran);
			
		}
		else if(preTran<0) {
			System.out.println("Withdrawn ="+Math.abs(preTran));
			
		}
		
		else {
			
			System.out.println("NO TRANSACTION OCCARED");
		}
		
		
		
	}
	public void showMenu(){
		int option;
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("\n");
		System.out.println("1.Check Balance\n2.Deposite\n3.Withdraw\n4.Previous Transaction\n5.Exit");
		do {
			System.out.println("Enter an Option -");
			option=scan.nextInt();
			System.out.println("\n");
			switch(option) {
			case 1:
				System.out.println("Balance ="+balance);
				System.out.println("\n");
				break;
			case 2:
				System.out.println("Enter an amount to Deposite =");
			    int amount=scan.nextInt();
			    deposite(amount);
			    System.out.println("\n");
			    break;
			case 3:
				System.out.println("Enter an amount to Withdraw =");
			    int amount2=scan.nextInt();
			    withdraw(amount2);
			    System.out.println("\n");
			    break;
			case 4:
				getpreTran();
				System.out.println("\n");
				break;
			case 5:
				System.out.println("You have been successfully logged out");
				break;
			default:
				System.out.println("Invalid Choice!! Please Enter again");
				break;
			}
			
		}while(option != 5);
		
	}
	}



