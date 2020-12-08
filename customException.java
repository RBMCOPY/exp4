package exp4;

public class customException extends Exception{
	
	String message;
	public String customException(String input) {
		message = "您输入的“"+input+"”不正确，请输入正确性别！";
		return message;
	}
	
	public String customException(int input) {
		message = "您输入的“"+input+"”不正确，请输入正确年龄！";
		return message;
	}
}
