package red_bus;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Utility {
	static 
	public byte getByteInput() {
		Scanner scan=new Scanner(System.in);
		boolean flag=true;
		byte byteValue=-1;
		do {
			if(scan.hasNextByte()) {
				byteValue=scan.nextByte();	
				flag=false;
			}else {
				System.out.println("Entered invalid data,Try again!");
				scan.next();
			}
		}while(flag);
		
		return byteValue;
	}
	public int  getIntegerInput() {
		Scanner scan=new Scanner(System.in);
		boolean flag=true;
		int intValue=-1;
		do {
			if(scan.hasNextInt()) {
				intValue=scan.nextInt();
				flag=false;
			}else {
				System.out.println("Entered invalid data,Try again");
				scan.next();
			}
		}while(flag);
		return intValue;
	}
	public  long getLongInput() {
		Scanner scan=new Scanner(System.in);		
		long longValue=-1;
		boolean flag=true;
		do {
			if(scan.hasNextLong()) {
				longValue=scan.nextLong();
				flag=false;
			}else {
				System.out.println("Entered invalid data,Try again");
				scan.next();
			}
		}while(flag);
		return longValue;
	}
	public  String getStringInput() {
		Scanner scan=new Scanner(System.in);
		
		return scan.nextLine();
	}
	public boolean isValidEmail(String mail) {
		return Pattern.matches("^[A-Za-z0-9._-]{3,12}+@gmail.com$", mail);
	}
	public  boolean isValidMobileNumber(long mobileNumber){
		String str= String.valueOf(mobileNumber);
		return Pattern.matches("^[6789]{1}[0-9]{9}",str);
	}
	public  boolean isValidPassword(String password) {
		return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=])(?=\\S+$).{6,}$",password);
	}
	
}
