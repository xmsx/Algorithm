package sort;

import java.util.Scanner;

/**
 * �����е������
 * @author MFS
 * ��Ŀ��
 * �������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�
 * ����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ�������
 *  �����P%1000000007
 * ��⣺
 * �鲢����ĸĽ��������ݷֳ�ǰ����������(�ݹ�ֵ�ÿ���������һ��������)��
 * �ϲ����飬�ϲ�ʱ������ǰ�������ֵarray[i]���ں�������ֵarray[j]ʱ��
 * ��ǰ������array[i]~array[mid]���Ǵ���array[j]�ģ�count += mid+1 - i
 * �ο���ָOffer�����Ǹо���ָOffer�鲢��������һ���������̡�
 * ���о��ǲ��������������Ƚϴ󣬶�ÿ�η��ص�count mod(1000000007)����
 *
 */
public class InversePairs {
	
    public static long InversePairs(int [] array) {
        if(array==null||array.length==0)
        {
            return 0;
        }
        int[] copy = new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            copy[i] = array[i];
        }
        long count = InversePairsCore(array,copy,0,array.length-1);//��ֵ��������
        return count;
          
    }
    private  static int InversePairsCore(int[] array,int[] copy,int low,int high)
    {
        if(low==high)
        {
            return 0;
        }
        int mid = (low+high)>>1;
        int leftCount = InversePairsCore(array,copy,low,mid)%1000000007;
        int rightCount = InversePairsCore(array,copy,mid+1,high)%1000000007;
        int count = 0;
        int i=mid;
        int j=high;
        int locCopy = high;
        while(i>=low&&j>mid)
        {
            if(array[i]>array[j])
            {
                count += j-mid;
                copy[locCopy--] = array[i--];
                if(count>=1000000007)//��ֵ��������
                {
                    count%=1000000007;
                }
            }
            else
            {
                copy[locCopy--] = array[j--];
            }
        }
        for(;i>=low;i--)
        {
            copy[locCopy--]=array[i];
        }
        for(;j>mid;j--)
        {
            copy[locCopy--]=array[j];
        }
        for(int s=low;s<=high;s++)
        {
            array[s] = copy[s];
        }
        return (leftCount+rightCount+count)%1000000007;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++){
			array[i] = in.nextInt();
		}
		System.out.println(InversePairs(array));
	}
}
