package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class web {
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(10000);
		Socket s = ss.accept();
		
		String str = s.getInetAddress().toString();
		System.out.println(str+".......connected");
		
		//BufferedReader bfr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		InputStream fis = s.getInputStream();
		//BufferedWriter bfw =new BufferedWriter( new FileWriter("d:/s.txt"));
		
		FileOutputStream fos = new FileOutputStream("d:/s.txt");
		
		byte[] buf = new byte[1024];
		int t=0;
		while((t = fis.read(buf)) != -1){
			fos.write(buf, 0, t);
		}
		OutputStream os = s.getOutputStream();
		PrintStream ps = new PrintStream(os,true);
		ps.write("succeed".getBytes());
		fis.close();
		fos.close();
		s.close();
		ps.close();
	}

}
