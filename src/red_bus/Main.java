package red_bus;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class Main {
	static Set<UserAccount> userAccount=new HashSet<>();
	public static void main(String[] args) {
		Utility util=new Utility();
//		  userAccount.add(new UserAccount(9677595469l,"sukumar7@gmail.com","password1!"));
		boolean flag=false;
		while(!flag) {
			System.out.println("1. Admin Login");
			System.out.println("2. Users Login");
			System.out.println("3. Exit");
			System.out.println();
			System.out.println("Enter....");
			byte choice=util.getByteInput();
			switch(choice) {
				case 1:System.out.println("Admin login");
				break;
				case 2:System.out.println("User login");
				       System.out.println("Welcome to login page");
				       System.out.println("1. Sign In");
				       System.out.println("2. Sign Up");
				       System.out.println("3. Back");
				       System.out.println();
				       System.out.println("Enter...");
				       byte option=util.getByteInput();
				       if(option==1) {
				    	  // signIn();
				       }else if (option ==2) {
				    	   boolean flag1=true,flag2=true,flag3=true;
				    	   long mobileNumber=-1l; 
				    	   String emailId="";
				    	   String password="";
				    	   System.out.println("Enter your mobile number");
				    	   do {
					    	   mobileNumber=util.getLongInput();
					    	   if(util.isValidMobileNumber(mobileNumber)) {
					    		   System.out.println(mobileNumber);
					    		   flag1=false;
					    	   }else 
					    		   System.out.println("Plz enter valid mobile number");  
				    	   }while(flag1);
				    	   
				    	   System.out.println("Enter your Email-Id");
				    	   do {
				    		   emailId=util.getStringInput();
				    		   if(util.isValidEmail(emailId))
				    			   flag2=false;
				    		   else {
				    			   System.out.println("Plz enter valid email-id");
				    		   }
				    	   }while(flag2);
 
				    	   System.out.println("Enter the password");
				    	   do {
				    		   password=util.getStringInput();
				    		   if(util.isValidPassword(password)){				    			  
				    			   flag3=false;
				    		   }else {
				    			   System.out.println("Plz enter valid password");
				    		   }
				    	   }while(flag3);
				    	   signUp(mobileNumber,emailId,password);				    	  
				       }else if(option==3) {
				    	   System.out.println("back");
				       }else {
				    	   System.out.println("invalid option");
				       }
				break;
				case 3:flag=true;
			}
		}
		
	}
     private static void signUp(long mobileNumber, String emailId, String password) {
    	 System.out.println("Method invoked");
    	 Iterator<UserAccount> itr=userAccount.iterator();
    	  while(itr.hasNext()) {
    		  UserAccount user=itr.next();
    		      if(user==null) {
    		    	  userAccount.add(new UserAccount(mobileNumber,emailId,password));
        			  System.out.println("success fully first registred");
    		      }
    		      else if(!user.getEmailId().equals(emailId)) {
        			  userAccount.add(new UserAccount(mobileNumber,emailId,password));
        			  System.out.println("success fully registred");
        		  }else {
        			  System.out.println("User already exists");
        		  }
    	  }
     }

}
