class StringDemo 
{
	//string ��ʾ
	public static void main(String []args)
	{   String str="���";
	    String str_1="hello";
	    String str_2="���";
		System.out.println(str.equals(str_1));
		System.out.println(str.equals(str_2));
		//��������ַ����� �Ƿ���� �����ִ�Сд
		String str_3="HELLO";
		System.out.println(str_1.equalsIgnoreCase(str_3));
		String str_4="";
		//����ַ����Ƿ�Ϊ��
		if (str_4.equals(""))
		{
			System.out.println("�ַ���Ϊ��");
		}else
		{
			System.out.println("�ַ�����Ϊ��");
		}
		//�������
		System.out.println(str.codePointAt(str.length()-1));
		//����һ���ַ���
		StringBuilder builders=new StringBuilder();
		builders.append("helo");
		builders.append("����");
		String str_6=builders.toString();
		System.out.println(str_6);
	}
	
}