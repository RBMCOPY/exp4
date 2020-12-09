package exp4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class text {
	static Student student0=new Student();
	//static Student student1=new Student(student0.name,student0.sex,student0.age,student0.stuNo);
	static ReadandWrite file = new ReadandWrite();
	public static void main(String[] args) {
		
//		  System.out.println("**********学生信息录入**********");//10
//		  student0.inputInformation(); 
//		  System.out.println("\n\n个人信息：");
//		  System.out.println("姓名     性别      年龄       学号    ");
//		  System.out.println(student0.name+"   "+student0.sex+"    "+student0.age+"    "+student0.StudentID);
//		
		String a=file.readFile();
		String b = file.operationFile(a);
//		System.out.println(b);
		if(file.outFile(addNewInformation(student0)))
		System.out.println("信息导入成功！");
		if(file.outFile(b))
			System.out.println("作业导入成功！\n请返回D盘查看。");
		StringBuffer s=new StringBuffer(b);
		a:
            while (true) {
                System.out.println("输入功能编号:" + "\n" + "1:查询古诗中的字或词"+" \n"+ "2:退出程序"+"\n");
                Scanner o = new Scanner(System.in);
                int m = o.nextInt();
                switch (m) {
                    case 1:
                        System.out.println("输入你想要查询的字或词");
                        Scanner scanner1 = new Scanner(System.in);
                        String s1 = scanner1.nextLine();
                        Pattern pattern = Pattern.compile(s1);
                        Matcher matcher = pattern.matcher(s);
                        if (matcher.find()) {
                            int num = 1;
                            while (matcher.find()) {
                                num++;
                            }
                            System.out.println("次数为" + num);
                        } else {
                            System.out.println("文本中没有该字符");
                        }
                        break;
                    case 2:
                        break a;
                    default:
                        System.out.println("您输入的编号有误，请重新输入");
                }
            }

	}
	public static String addNewInformation(Student student) {
		String information = null;
		information="个人信息：\n姓名 性别 年龄       学号    \n"+student0.name+"   "+student0.sex+"    "+student0.age+"    "+student0.StudentID+"\n完成作业：\n";
		 return information;
	}
}
