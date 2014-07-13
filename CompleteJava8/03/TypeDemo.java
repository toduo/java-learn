public class TypeDemo
{
	/**
	 * java 类型转换
	 */
	public static void main(String[]args)
	{
		int a=200;
		int q;
		char b=20;
		byte c,f;
		c=(byte)a;
		f=(byte)b;
		q=a*b; //类型自动提升  char  和int  已经把结果 提升到int了
		System.out.println(c);  //- 56 已经不够  56 127+56+0=
		System.out.println(f);
		
		System.out.println(q);
	}
}