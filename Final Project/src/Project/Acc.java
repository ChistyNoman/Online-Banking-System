package Project;
//Abstraction

public class Acc extends CreateAcc {  //Inheritance
	
	Acc(String FN,String LN,String UN,String EP){  //constructor
		this.FN=FN;
		this.LN=LN;
		this.UN=UN;
		this.EP=EP;
	}
		public  void Account() {
			System.out.println("Welcome "+FN+" "+LN+" in our XXAA Banking Service.Your account is Successfully created.Your User Name "+UN);
			System.out.println("---------------------------------------------------------------------");
			
			
		}
			

	}



