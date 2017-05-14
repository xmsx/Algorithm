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
		int[] a = {3,32,321};
//		String s = "123123";
//		System.out.println(MoreThanHalfNum_Solution(a));
		String[] s = {"321","32","3"};
		Arrays.sort(s);
		System.out.println( s[1] );
		System.out.println(PrintMinNumber(a));
		
	}
	public int FirstNotRepeatingChar(String str) {
		if(str.length()==0)return -1;
        char[] c = str.toCharArray();
        int l = c.length;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<l;i++){
            char key = c[i];
            if(!map.containsKey(key)){
				map.put(key, 1);
			}else{
				int val = map.get(key)+1;
				map.put(key,val);
			}
        }
        int ans = 100000;
        Iterator<Entry<Character, Integer>> i = map.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry<Character, Integer> e = (Map.Entry<Character, Integer>) i.next();
			//System.out.println(e.getKey()+":"+e.getValue());
			if(e.getValue()==1){
				ans = Math.min(ans,str.indexOf(e.getKey().toString()));
			}	
        }
        return ans;
    }
	private static String PrintMinNumber(int[] a) {
		// TODO Auto-generated method stub
		String[] s = new String[a.length];
		for(int i=0;i<a.length;i++){
            s[i] = String.valueOf(a[i]);
        }
		Arrays.sort(s);
		String ans = new String();
		for(int i=0;i<a.length;i++){
			ans += s[i];
		}
		return ans;
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
//		Set keyset = map.keySet();
//		Iterator<Integer> it = keyset.iterator();
//		Set<Entry<Integer,Integer>> me = map.entrySet();
//		Iterator<Entry<Integer,Integer>> it = me.iterator();
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
