package sort;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] str = new String[5];
		char[][] c = new char[5][100];
		for(int i = 0 ;i < 5 ; i++){
			str[i] = in.nextLine();
			c[i] = str[i].toCharArray();
			Arrays.sort(c[i]);
			str[i] = String.valueOf(c[i]);
			System.out.println(str[i]);
		}
		
	}

}
