package exp4;

public class customException extends Exception{
	
	String message;
	public String customException(String input) {
		message = "������ġ�"+input+"������ȷ����������ȷ�Ա�";
		return message;
	}
	
	public String customException(int input) {
		message = "������ġ�"+input+"������ȷ����������ȷ���䣡";
		return message;
	}
}
