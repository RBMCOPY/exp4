package exp4;


public class text {
	static Student student0=new Student();
	//static Student student1=new Student(student0.name,student0.sex,student0.age,student0.stuNo);
	static ReadandWrite file = new ReadandWrite();
	public static void main(String[] args) {
		
		  System.out.println("**********ѧ����Ϣ¼��**********");//10
		  student0.inputInformation(); 
		  System.out.println("\n\n������Ϣ��");
		  System.out.println("����     �Ա�      ����       ѧ��    ");
		  System.out.println(student0.name+"   "+student0.sex+"    "+student0.age+"    "+student0.StudentID);
		
		String a=file.readFile();
		String b = file.operationFile(a);
//		System.out.println(b);
		if(file.outFile(addNewInformation(student0)))
		System.out.println("��Ϣ����ɹ���");
		if(file.outFile(b))
			System.out.println("��ҵ����ɹ���\n�뷵��D�̲鿴��");

	}
	public static String addNewInformation(Student student) {
		String information = null;
		information="������Ϣ��\n���� �Ա� ����       ѧ��    \n"+student0.name+"   "+student0.sex+"    "+student0.age+"    "+student0.StudentID+"\n�����ҵ��\n";
		 return information;
	}
}
