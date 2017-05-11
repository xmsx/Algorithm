package queue;
import java.util.Comparator;
import java.util.PriorityQueue;
public class _PriorityQueue {
	private String name;
	private int score;
	public _PriorityQueue(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String toString(){
		return name+": "+score;
	}
	public static void main(String[] args){
		Comparator<_PriorityQueue> Order =  new Comparator<_PriorityQueue>(){  
            public int compare(_PriorityQueue o1, _PriorityQueue o2){  
                // TODO Auto-generated method stub  
                int s1 = o1.getScore();  
                int s2 = o2.getScore();  
                if(s1>s2)return 1;
                else if(s1>s2)return -1;
                else return 0;
            }
		};
		PriorityQueue<_PriorityQueue> pq = new PriorityQueue(100,Order);
		_PriorityQueue  t = new _PriorityQueue("",0);
		for(int i=0;i<100;i++){
			t.setName("S"+1);
			t.setScore(i);
			pq.add(t);
		}
		System.out.println(pq.peek());
	}
}
