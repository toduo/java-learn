import java.io.Console;
import java.util.Scanner;
import java.util.Date;
import java.util.Arrays;

class ScanerDemo
{
	public static void main(String []args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("�������������:");
		//String name=in.nextLine();
		//Console cons=System.console();
		//String name =cons.readLine("����:");
		//char[] password=cons.readPassword("����:");
		//System.out.println("�ҵ����֣�"+name+",���룺"+password);
	//	System.out.printf("%1$tY %1$tm %1$td %1$tA",new Date());
		String strDate= String.format("%1$tY %1$tm %1$td %1$tA", new Date());
		System.out.println(strDate);
		int[] a=new int[100];//���� һ������
		 for (int i=0;i<100;i++)
		 {
			 a[i]=i;
		 }
		 System.out.println(Arrays.toString(a));
		 
		String[] names=new String[3];
		names[0]="С��";
		names[1]="����";
		names[2]="������";
		for(String n:names)
		{
			System.out.println("����:"+n);
		}
	}
}