package queue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class KClosest_past {
	public Point[] kClosest(Point[] points, Point origin, int k) {
        // Write your code here
        final int originx = origin.x;
        final int originy = origin.y;

        Arrays.sort(points, new Comparator<Point>(){
            @Override
            public int compare(Point o1, Point o2) {
                // TODO Auto-generated method stub
                int first_dis = (o1.x - originx) * (o1.x - originx)+(o1.y - originy) * (o1.y - originy);
                int second_dis = (o2.x - originx) * (o2.x - originx)+(o2.y - originy) * (o2.y - originy);
                int dis_diff = first_dis - second_dis;
                if(dis_diff < 0){
                    return -1;
                }
                else if(dis_diff > 0){
                    return 1;
                }
                else{
                    if(o1.x < o2.x){
                        return -1;
                    }
                    else if(o1.x > o2.x){
                        return 1;
                    }
                    else{
                        if(o1.y < o2.y){
                            return -1;
                        }
                        else if(o1.y > o2.y){
                            return 1;
                        }
                        else{
                            return 0;
                        }
                    }               
                }               
            }

        });     
        Point[] tmp = new Point[k];
        for(int i = 0; i < k; i++){
            tmp[i] = points[i];
        }
        return tmp; 
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        KClosest_past sl = new KClosest_past();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            points[i] = new Point(a,b);
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        Point origin = new Point(a,b);
        int k = sc.nextInt();
        sc.close();
        Point[] tmp = sl.kClosest(points, origin, k);
        for(int i = 0; i < k; i++){
          System.out.println(tmp[i].x + " " + tmp[i].y);
        }
    }

}
