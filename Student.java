package exp4;

import java.util.Scanner;

public class Student {
	String name;
	String sex;
	int age;
	String StudentID;

public void inputInformation() {
	Scanner reader = new Scanner(System.in);
	a:for(;;) {
		try {
			System.out.println("����������");
	        name=reader.nextLine();
	        System.out.println("¼��ɹ�~");
	        break a;
		}
		catch(Exception e) {
			System.out.println("������� ��"+name+"�� ��ʽ����ȷ�����������룡");
		}
	}
	b:for(;;) {
	try{
	    System.out.println("�������Ա����ģ�");
	    sex=reader.nextLine();
	    sexquestion(sex);
	    break b;
	}
	catch(customException e) {
		System.out.println(e.customException(sex));
	}
	}
	c:for(;;) {
		try{
			System.out.println("���������䣨15-30�꣩");
			age=reader.nextInt();
		    agequestion(age);
		    break c;
		}
		catch(customException e) {
			System.out.println(e.customException(age));
		}
		}
	d:for(;;) {
		try {
			Scanner reader0 = new Scanner(System.in);
			System.out.println("������ѧ��");
			StudentID=reader0.nextLine();
	        System.out.println("¼��ɹ�~");
	        break d;
		}
		catch(Exception e) {
			System.out.println("������ġ�"+StudentID+"����ʽ����ȷ�����������룡");
		}
	}
	
}
public void sexquestion(String sex) throws customException{
	String x="��";
	String y="Ů";
	if (sex.equals(x)||sex.equals(y)){
		System.out.println("¼��ɹ�~");
		}
	else throw new customException();
}
public void agequestion(int age) throws customException{
	int x=15;
	int y=30;
	if (age>=x&&age<=y){
		System.out.println("¼��ɹ�~");
		}
	else throw new customException();
}

}
