import java.util.Arrays;
import java.util.Scanner;

class CaiDemo
{
	/**
	 * 抽彩 演示
	 */
	public static void main(String[] args)
	{
		//
		Scanner in= new Scanner(System.in);
		System.out.println("要生成多少个数字？");
		int k=in.nextInt();
		System.out.println("要从多少个数据中选取？");
		int b=in.nextInt();
		
		//构建基本数组
		int[] ji=new int[b];
		for(int i=0;i<ji.length;i++)
		{
			ji[i]=i+1;
		}
		//保存结果
		int[] result=new int[k];
		for(int i=0;i<result.length;i++)
		{
			int r=(int)(Math.random()*b);
			result[i]=ji[r];
			ji[r]=ji[b-1];
			b--;
		}
		//对结果进行 排序
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
		int ks=Arrays.binarySearch(ji, 100);
		System.out.println("K;"+ks+"\n value:"+ji[ks]);
	}
}