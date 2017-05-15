package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class _1 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,0,6};
		System.out.println(isContinuous(a));
 	}
	public static boolean isContinuous(int [] numbers) {
		if(numbers == null || numbers.length<1) return false;
        Arrays.sort(numbers);
        int numzero = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == 0)
                numzero++;
            else
                break;
        }
        int gap = 0;
        for(int i=numzero;i<numbers.length-1;i++){
            if(numbers[i+1]-numbers[i] == 0){
                return false;
            }
            gap += numbers[i+1]-numbers[i]-1;
        }
        if(numzero >= gap)return true;
        else return false;
    }
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<array.length;i++){
        	int t = array[i];
        	if(!hs.contains(t)){
        		hs.add(t);
        	}else{
        		hs.remove(t);
        	}
        }
        Iterator<Integer> it = hs.iterator();
        int[] ans = new int[2];
        int i = 0;
        while(it.hasNext()){
        	ans[i++] = it.next();
        }
        num1[0] = ans[0];
        num2[0] = ans[1];
    }

}
