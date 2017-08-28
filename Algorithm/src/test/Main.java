package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int k;
		String s ;
		s = in.nextLine();
		String[] ss ;
		ss = s.split(" ");
		int[] a = new int[ss.length];
		for(int i=0;i<ss.length;i++){
			a[i] = Integer.parseInt(ss[i]);
			//System.out.println(a[i]);
		}
		k = in.nextInt();
		heapsort(a,a.length,k);
		//Arrays.sort(a);
		System.out.println(a[a.length-k]);
	}
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
	public static void heapsort(int[] array,int n,int k){
		//初始化大顶堆，从堆底维护起得到原始大顶堆。
		for(int i=(n-1)/2;i>=0;i--){
			siftheap(array,i,n);
		}
		for(int i=1;i<=k;i++){
			int tmp = array[0];
			array[0] = array[n-i];
			array[n-i] = tmp;
			//因为原始堆为大顶堆，此后每次维护只需维护堆顶元素即可
			siftheap(array,0,n-i);
		}
	}
}
