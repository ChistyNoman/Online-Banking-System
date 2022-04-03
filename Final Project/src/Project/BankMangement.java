package Project;

import java.util.Scanner;

public class BankMangement {

	public static void main(String[] args) {
		
		//CreateFile obj3=new CreateFile();
		int choice;
		do {
		System.out.println("Welcome to XXAA Online Bank");
		System.out.println("1.Create an Account\n2.Account details\n3.Exit");
		System.out.println("Enter your choice :");
		Scanner scan=new Scanner(System.in);
		choice=scan.nextInt();
		 switch(choice) {
		 case 1:
			 Scanner sca=new Scanner(System.in);
				System.out.println("First name-");
				String FN=sca.nextLine();
				System.out.println("Last name-");
				String LN=sca.nextLine();
				System.out.println("Enter your User name-");
				String UN=sca.nextLine();
				
				String EP;
				while(true)
			    {
					System.out.println("Enter your Password-");
			     EP=sca.nextLine();    
				if(EP.length()<4)
			        {
			            System.out.println("Password Must Be 4 Character Minimum Length");
			        }
			        else {
			            break;
			        }
			    }
				CreateAcc O;      //Polymorphic Behaviour of Objects
				O=new Acc(FN,LN,UN,EP); 
				O.Account();
				//obj3.File(UN, EP);
				BankAcc obj=new BankAcc();
				obj.showMenu();
			     break;
		 case 2:
			//obj3.FileShow();
			 break; 
		 case 3: 
			 System.out.println("Thank you for visiting our service.");
			 System.exit(0); 
			break; 
		 default:
		     System.out.println("We are sorry,invalid choice");
		 break;
	
		 }
		 }while(choice != '3');
		
		}
	}


