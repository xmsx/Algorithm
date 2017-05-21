package others;

import java.util.Scanner;

public class hihooffer17_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0;
		for(int i=0;i<n;i++){
			String c1,c2;
			c1 = in.next();
			c2 = in.next();
			if(c1.equals(c2))sum++; 
		}
		System.out.println(String.format("%.2f", sum/n*100)+"%");
	}

}
