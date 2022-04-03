
	package Project;

	import java.io.File;
	import java.io.FileWriter;
	import java.util.Scanner;
//FILE
//Exception Handling
	public class CreateFile{
		File f1;
		FileWriter W1;
		public  void File(String UN,String EP) {
	    	try {
	    		f1=new File("C:\\Users\\Chisty\\Music\\UserAccount.text");
	    		if(f1.createNewFile()) {
	    			System.out.println("File created");
	    		}else {
	    			System.out.println("File already exist");
	    		}
	    		
	    		
	    		
	    	}catch(Exception e){
	    		System.out.println("Error"+e);
	    	}
	    	try {
				W1=new FileWriter(f1,true);
				W1.write(UN+", "+EP+"\n");
				W1.close();
					
					}catch(Exception e){
		    		System.out.println("Error"+e);
		    	}}
	    	public  void FileShow() {	
	    	
	    	try {
	    		File f1=new File("C:\\Users\\Chisty\\Music\\UserAccount.text");
	    		Scanner read=new Scanner(f1);
	    		while(read.hasNext()) {
	    			
	    			String UN=read.next();
	    			String EP=read.next();
	    			System.out.println("User name - " +UN+"Password -"+EP);
	    		}
	    		read.close();
	    		
	    	}catch(Exception e){
	    		System.out.println("Error"+e);
	    	}	
	    		
	    	}}
	    
		

	


