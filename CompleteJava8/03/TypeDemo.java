public class TypeDemo
{
	/**
	 * java ����ת��
	 */
	public static void main(String[]args)
	{
		int a=200;
		int q;
		char b=20;
		byte c,f;
		c=(byte)a;
		f=(byte)b;
		q=a*b; //�����Զ�����  char  ��int  �Ѿ��ѽ�� ������int��
		System.out.println(c);  //- 56 �Ѿ�����  56 127+56+0=
		System.out.println(f);
		
		System.out.println(q);
	}
}