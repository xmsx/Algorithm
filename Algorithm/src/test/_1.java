package test;

import java.util.HashSet;
import java.util.Iterator;

public class _1 {
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
