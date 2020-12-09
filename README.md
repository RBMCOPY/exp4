# 计192 2019310194 任博淼
# JAVA实验四
# 阅读程序
## 实验目的
1.掌握字符串String及其方法的使用；  
2.掌握文件的读取/写入方法；  
3.掌握异常处理结构。  

## 实验过程
1.设计学生类（可利用之前的）；  
2.采用交互式方式实例化某学生；  
3.设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。  

## 实验要求
1.填写学生基本信息；
2.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”;  
3.允许提供输入参数，统计古诗中某个字或词出现的次数;  
4.输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A;  
5.考虑操作中可能出现的异常，在程序中设计异常处理程序。  

## 实验步骤
1.根据要求设计主类；   
2.添加学生类，引用上一实验结果；    
3.添加主类并定义变量；    
4.在主类中添加文件处理模块，查找字符模块，错误处理模块；  
5.导入其他类；   
6.排版输出顺序；    
7.测试程序；  
8.撰写实验报告；     
9.完成实验。

## 核心方法
1.循环  
public void inputInformation() {  
	Scanner reader = new Scanner(System.in);  
	a:for(;;) {  
		try {  
			System.out.println("请输入姓名");  
	        name=reader.nextLine();  
	        System.out.println("录入成功~");  
	        break a;  
		}  
		catch(Exception e) {  
			System.out.println("您输入的 “"+name+"” 格式不正确，请重新输入！");  
		}  
2.错误处理  
b:for(;;) {  
	try{
	    System.out.println("请输入性别（中文）");  
	    sex=reader.nextLine();  
	    sexquestion(sex);  
	    break b;  
	}  
	catch(customException e) {  
		System.out.println(e.customException(sex));  
	}  
	}  
3.文件录入  
public String readFile() {  
		String original = null;  
		int n=-1;  
		char[] a = new char[100];//缓存，  
		try {  
			File file = new File("D:\\text.txt");  
			InputStream fli = new FileInputStream(file);  
			InputStreamReader in = new InputStreamReader(fli, "UTF-8");  
		while((n=in.read(a,0,100))!=-1) {  
		String s = new String(a,0,n);  
		this.n=n;  
		if(original!=null)  
		original = original+s;  
		else original=s;  
		}  
        in.close();  
      	}  
		catch (IOException e) {  
			System.out.println("File read erroe:"+e);  
		}  
		return original;  
	}  
   
## 实验结果
![1](https://github.com/RBMCOPY/experiment4/blob/main/32f311c718813f9aff8e9cd65fac9dc.png)
![2](https://github.com/RBMCOPY/experiment4/blob/main/adff5bdd4b08b0e92b35a50ccdbaf70.png)
![3](https://github.com/RBMCOPY/experiment4/blob/main/c3fb8cf97a520692b0a8bfe9e3b7c4b.png)

## 实验感想
   实验结束了，大家都有一种解脱的感觉。当然我想自己更多的是兴奋和一点点的成就感。现在我觉得，学习java要不断的复习和运用，做到举一反三，将所学知识充分融入到平时的学习生活中去，从而为以后的工作
打好坚实的基础。感谢学校和老师能够为我们提供这次机会，让我们更好的掌握和了解java 这门语言。通过这次实训，我真的从中体会了很多东西。我对这个介于人类与非人类之间的计算机编程语言有了较上学期更进一
步的认识。其间开心过、郁闷过、无奈过、彷徨..随着实训的圆满成功与实验报告的顺利完成，有点微微的自豪感使人难忘。至于我做的程序，还不是很完善，所以我将一直去完善它，不断地学习下去。伴随着学习的深
入，我发现高深的东西还有很多很多，等待着我自己去发掘。对于java语言，我会更加努力。
