class StringDemo 
{
	//string 演示
	public static void main(String []args)
	{   String str="你好";
	    String str_1="hello";
	    String str_2="你好";
		System.out.println(str.equals(str_1));
		System.out.println(str.equals(str_2));
		//检查两个字符串的 是否相等 不区分大小写
		String str_3="HELLO";
		System.out.println(str_1.equalsIgnoreCase(str_3));
		String str_4="";
		//检查字符串是否为空
		if (str_4.equals(""))
		{
			System.out.println("字符串为空");
		}else
		{
			System.out.println("字符串不为空");
		}
		//返回马甸
		System.out.println(str.codePointAt(str.length()-1));
		//构建一个字符串
		StringBuilder builders=new StringBuilder();
		builders.append("helo");
		builders.append("我们");
		String str_6=builders.toString();
		System.out.println(str_6);
	}
	
}