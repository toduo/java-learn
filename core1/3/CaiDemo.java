import java.util.Arrays;
import java.util.Scanner;

class CaiDemo
{
	/**
	 * ��� ��ʾ
	 */
	public static void main(String[] args)
	{
		//
		Scanner in= new Scanner(System.in);
		System.out.println("Ҫ���ɶ��ٸ����֣�");
		int k=in.nextInt();
		System.out.println("Ҫ�Ӷ��ٸ�������ѡȡ��");
		int b=in.nextInt();
		
		//������������
		int[] ji=new int[b];
		for(int i=0;i<ji.length;i++)
		{
			ji[i]=i+1;
		}
		//������
		int[] result=new int[k];
		for(int i=0;i<result.length;i++)
		{
			int r=(int)(Math.random()*b);
			result[i]=ji[r];
			ji[r]=ji[b-1];
			b--;
		}
		//�Խ������ ����
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
		int ks=Arrays.binarySearch(ji, 100);
		System.out.println("K;"+ks+"\n value:"+ji[ks]);
	}
}