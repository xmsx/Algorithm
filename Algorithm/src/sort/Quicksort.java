package sort;
/**
 * Quicksort 快速排序
 * 思想：
 * 分治法，每次找一个中间值，将数组比较划分，左小右大分开。
 */
import java.util.Scanner;

public class Quicksort {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] array = new int[1000];
		int n = in.nextInt();
		for(int i=0;i<n;i++)
			array[i] = in.nextInt();
		quicksort(array,0,n-1);
		for(int i=0;i<n;i++)
			System.out.println(array[i]);
	}
	/**
	 * 递归操作
	 * @param array
	 * 				数组
	 * @param st
	 * 				数组开始下标
	 * @param ed
	 * 				数组结尾下标
	 */
	public static void quicksort(int[] array,int st,int ed){
		int pivot;
		if(st<ed){
			pivot = partition(array,st,ed);
			quicksort(array,st,pivot-1);
			quicksort(array,pivot+1,ed);
		}
	}
	/**
	 * 划分操作
	 * @param array
	 * @param st
	 * @param ed
	 * @return 中间值下标
	 */
	public static int partition(int[] array,int st,int ed){
//		int i=st,j=ed;
//		while(i<j){
//			while(i<j && array[i]<=array[j])j--;
//			if(i<j){
//				int tmp = array[i];
//				array[i] = array[j];
//				array[j] = tmp;
//				i++;
//			}
//			while(i<j && array[i]<=array[j])i--;
//			if(i<j){
//				int tmp = array[i];
//				array[i] = array[j];
//				array[j] = tmp;
//				j--;
//			}
//		}
//		return i;
		int pos = ed;
		int pivot = array[st];
		for(int i=ed;i>=st;i--){
			if(array[i]>pivot){
				swap(array, pos, i);
				pos--;
			}
		}
		swap(array, pos, st);
		return pos;
	}
	public static void swap(int[] array, int pos, int i) {
		int tmp = array[i];
		array[i] = array[pos];
		array[pos] = tmp;
	}
}
