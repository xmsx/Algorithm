package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class client {
	public static void main(String[] args) throws IOException{
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println(ip);
		Socket s = new Socket("192.168.229.1", 10000);
		InputStream fis = new FileInputStream("d://t.txt");
		
		//PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		OutputStream ops =  s.getOutputStream();
		int t = 0;
		byte[] buf = new byte[1024];
		while((t=fis.read(buf))!=-1){
			ops.write(buf, 0, t);
		}
		s.shutdownOutput();
		InputStream is = s.getInputStream();
		byte[] b = new byte[1024];
		int i = is.read(b);
		String str = new String(b, 0, i);
		System.out.println(str);
		fis.close();
		ops.close();
		is.close();
	}

}
