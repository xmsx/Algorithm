package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Point {
    public int x;
    public int y;
    Point() { x = 0; y = 0; }
    Point(int a, int b) { x = a; y = b; }
}
class Point_len {
	public int x,y,len;
}
public class KClosest {

	public static void main(String[] args) {
		Point[] points = new Point[5];
		points[0] = new Point(4,6);
		points[1] = new Point(4,7);
		points[2] = new Point(4,4);
		points[3] = new Point(2,5);
		points[4] = new Point(1,1);
		Point origin = new Point(0,0);
		Point[] ans = new Point[3];
		ans = kClosest(points,origin, 3);
		for(int i=0;i<3;i++)
		System.out.println(ans[i].x+"--"+ans[i].y);
		
	}
	public static Point[] kClosest(Point[] points, Point origin, int k) {
		Point[] ans = new Point[k];
		for(int i=0;i<k;i++)ans[i] = new Point();
		Point_len[] t = new Point_len[points.length];
		for(int i=0;i<points.length;i++)t[i] = new Point_len();
		//System.out.println(ans[0].x);
		for(int i=0 ;i< points.length;i++) {
			//System.out.println(points[i].x+"--"+points[i].y);
			t[i].x = points[i].x;
			t[i].y = points[i].y;
			t[i].len = (origin.x - points[i].x)*(origin.x - points[i].x)
					 + (origin.y - points[i].y)*(origin.y - points[i].y);
		}
		Comparator<Point_len> Order =  new Comparator<Point_len>(){

			@Override
			public int compare(Point_len o1, Point_len o2) {
				if(o1.len==o2.len) {
					if(o1.x == o2.x) 
						return (o1.y-o2.y);
					
					return (o1.x-o2.x);
				}
				return (o1.len-o2.len);
			}
		};
		PriorityQueue<Point_len> sort = new PriorityQueue(k,Order);
		for (int i=0;i<points.length;i++){
			sort.add(t[i]);
		}
		for(int i=0;i<k;i++) {
			ans[i] = new Point(sort.peek().x, sort.poll().y);
		}
		return ans;
        
    }

}
