package others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder sb = new StringBuilder();
//		sb.append("123123123\n");
//		sb.append("qweqweqwe\n");
//		sb.append("asdasdasd\n");
//		sb.append("zxczxczxc\n");
////		System.out.println(sb.toString());
//		char[] c = null;
//		c = sb.toString().toCharArray();
//		Arrays.sort(c);
//		String s  = bbb(sb);
//		System.out.println(s);
//		String s =new String("zxc");
//		System.out.println(s=="zxc");
		int[] a = {1,2,3,2,2,2,5,4,2};
		String s = "123123";
		s.
		System.out.println(MoreThanHalfNum_Solution(a));
	}

	private static String bbb(StringBuilder sb) {
		// TODO Auto-generated method stub
		return sb.toString();
	}
	public static int MoreThanHalfNum_Solution(int [] array) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++){
			int key = array[i];
			if(!map.containsKey(key)){
				map.put(array[i], 1);
			}else{
				int val = map.get(key)+1;
				map.put(key,val);
			}
		}
		Iterator<Entry<Integer, Integer>> i = map.entrySet().iterator();
		while(i.hasNext()){
			Map.Entry<Integer, Integer> e = (Map.Entry<Integer, Integer>) i.next();
			//System.out.println(e.getKey()+":"+e.getValue());
			if(e.getValue() > array.length/2){
				return e.getKey();
			}	
		}
		return 0;
    }
}
