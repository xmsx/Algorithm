package sort;
/**
 * heapsort 堆排序
 * 思想：
 * 每一次都维护一个大顶堆，然后取堆顶元素，放在堆末，重新维护这个大顶堆，依次得到递增排序。
 * 递减则是维护一个小顶堆。
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
	 * 堆的维护
	 * @param array
	 * @param k 起始维护的定点索引
	 * @param n 维护的堆的大小
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
	 * 堆排序
	 * @param array 操作的数组
	 * @param n 堆的大小
	 */
	public static void heapsort(int[] array,int n){
		//初始化大顶堆，从堆底维护起得到原始大顶堆。
		for(int i=(n-1)/2;i>=0;i--){
			siftheap(array,i,n);
		}
		for(int i=1;i<=n-1;i++){
			int tmp = array[0];
			array[0] = array[n-i];
			array[n-i] = tmp;
			//因为原始堆为大顶堆，此后每次维护只需维护堆顶元素即可
			siftheap(array,0,n-i);
		}
	}
}
