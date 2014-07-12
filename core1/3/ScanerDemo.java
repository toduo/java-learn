import java.io.Console;
import java.util.Scanner;
import java.util.Date;
import java.util.Arrays;

class ScanerDemo
{
	public static void main(String []args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("请输入你的姓名:");
		//String name=in.nextLine();
		//Console cons=System.console();
		//String name =cons.readLine("姓名:");
		//char[] password=cons.readPassword("密码:");
		//System.out.println("我的名字："+name+",密码："+password);
	//	System.out.printf("%1$tY %1$tm %1$td %1$tA",new Date());
		String strDate= String.format("%1$tY %1$tm %1$td %1$tA", new Date());
		System.out.println(strDate);
		int[] a=new int[100];//声明 一个数组
		 for (int i=0;i<100;i++)
		 {
			 a[i]=i;
		 }
		 System.out.println(Arrays.toString(a));
		 
		String[] names=new String[3];
		names[0]="小刚";
		names[1]="丽南";
		names[2]="李连杰";
		for(String n:names)
		{
			System.out.println("姓名:"+n);
		}
	}
}