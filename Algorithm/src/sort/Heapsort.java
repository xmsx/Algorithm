package sort;
/**
 * heapsort ������
 * ˼�룺
 * ÿһ�ζ�ά��һ���󶥶ѣ�Ȼ��ȡ�Ѷ�Ԫ�أ����ڶ�ĩ������ά������󶥶ѣ����εõ���������
 * �ݼ�����ά��һ��С���ѡ�
 */

import java.util.Scanner;

public class Heapsort {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] array = new int[1000];
		int n = in.nextInt();
		for(int i=0;i<n;i++)
			array[i] = in.nextInt();
		heapsort(array,n);
		for(int i=0;i<n;i++)
			System.out.println(array[i]);
	}
	/**
	 * �ѵ�ά��
	 * @param array
	 * @param k ��ʼά���Ķ�������
	 * @param n ά���ĶѵĴ�С
	 */
	public static void siftheap(int[] array,int k,int n){
		int i,j;
		i = k;
		j = i*2+1;
		while(j<n){
			if(j<n-1 && array[j]<array[j+1])j++;
			if(array[i]>array[j])break;
			else{
				int tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
				i = j;
				j = i*2+1;
			}
		}
	}
	/**
	 * ������
	 * @param array ����������
	 * @param n �ѵĴ�С
	 */
	public static void heapsort(int[] array,int n){
		//��ʼ���󶥶ѣ��Ӷѵ�ά����õ�ԭʼ�󶥶ѡ�
		for(int i=(n-1)/2;i>=0;i--){
			siftheap(array,i,n);
		}
		for(int i=1;i<=n-1;i++){
			int tmp = array[0];
			array[0] = array[n-i];
			array[n-i] = tmp;
			//��Ϊԭʼ��Ϊ�󶥶ѣ��˺�ÿ��ά��ֻ��ά���Ѷ�Ԫ�ؼ���
			siftheap(array,0,n-i);
		}
	}
}
