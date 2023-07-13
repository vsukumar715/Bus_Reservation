package red_bus;

public class UserAccount {
	private long mobileNumber;
	private String email_id;
	private String password;
	UserAccount(long mobileNumber,String email_id,String password){
		this.mobileNumber=mobileNumber;
		this.email_id=email_id;
		this.password=password;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber=mobileNumber;
	}
	public void setEmailId(String email_id) {
		this.email_id=email_id;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public String getEmailId() {
		return email_id;
	}
	public String getPassword() {
		return password;
	}
}
