package sef.module8.activity;
//Needs to be completed
//1 - extend this class from Exception class
public class CustomExceptionActivity extends Exception{
	

	//2 - Override getMessage() and provide the following message 
	// "You are not allowed to use this program"
	private int validUsers;
	public CustomExceptionActivity (String message, int validUsers) {
		super(message);
		this.validUsers = validUsers;
	}
		public CustomExceptionActivity (String message, int validUsers, Throwable cause) {
			super(message, cause);
			this.validUsers = validUsers;
		}
		public String toString() {
			return super.toString();
		}
		public String getMessage() {
			return super.getMessage() +"You are not allowed to use this program";
			
		 }
}


