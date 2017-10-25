package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _17ÁÔ±ªÒÆ¶¯ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long time = in.nextLong();
		time -= 28800;
		Date date = new Date(time*1000);
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String ans = df.format(date);
		System.out.println(ans);
	}
}
