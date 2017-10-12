package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class _10ø∆¥Û—∂∑…2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()) {
			int n = in.nextInt();
			//System.out.println(n);
			Team t = null;
			Map<String,Team> m = new TreeMap<String,Team>();
			
			for(int i=0;i<n;i++){
				String s = in.next();
				t = new Team(s);
				m.put(s, t);
			}
			for(int i = 0;i<n*(n-1)/2;i++) {
				String s1 = in.next(),s2 = in.next();
				//System.out.println(s1+s2);
				String[] st = s1.split("-");
				String[] sc = s2.split(":");
				//System.out.println(st[0]+" "+sc[0]+":"+st[1]+" "+sc[1] );
				int c1 = Integer.parseInt(sc[0]);
				int c2 = Integer.parseInt(sc[1]);
				if(c1>c2){
					Team t1 = m.get(st[0]);
					t1.s +=3;
					t1.g1 += c1-c2;
					t1.g2 += c1;
					Team t2 = m.get(st[1]);
					t2.s +=0;
					t2.g1 += c2-c1;
					t2.g2 += c2;
				} else if(c1==c2) {
					Team t1 = m.get(st[0]);
					t1.s +=1;
					t1.g2 += c1;
					Team t2 = m.get(st[1]);
					t2.s +=1;
					t2.g2 += c2;
				} else {
					Team t1 = m.get(st[0]);
					t1.s +=0;
					t1.g1 += c1-c2;
					t1.g2 += c1;
					Team t2 = m.get(st[1]);
					t2.s +=3;
					t2.g1 += c2-c1;
					t2.g2 += c2;
				}
				Team t1 = m.get(st[0]);

				Team t2 = m.get(st[1]);
				//System.out.println(t1.n +":"+t1.s+"----"+t2.n +":"+t2.s);
			}
			List<Map.Entry<String,Team>> l = new ArrayList<Map.Entry<String,Team>>(m.entrySet());
			Collections.sort(l,new Comparator<Map.Entry<String,Team>>(){

				@Override
				public int compare(Entry<String, Team> o1, Entry<String, Team> o2) {
					Team t1 = o1.getValue();
					Team t2 = o2.getValue();
					if(t1.s > t2.s) return -1;
					else if(t1.s<t2.s) return 1;
					else {
						if(t1.g1>t2.g1) return -1;
						else if(t1.g1<t2.g1) return 1;
						else {
							if(t1.g2>t2.g2) return -1;
							else if(t1.g2<t2.g2) return 1;
							else return 0;
						}
					}
				}
			});
			int k = n/2;
			for(Map.Entry<String, Team> ans:l) {
				--k;
				System.out.println(ans.getKey());
				if(k==0) break;
			}
		}
	}
}
class Team {
	String n;
	int s;
	int g1,g2;
	Team(String s ){
		this.n = s;
	}
}
