package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copy_paste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("e:/t.txt");
			fw.write("qweasdzxcqweasdzxcqweasdzxcqweasdzxc");
			fw.close();
			fr = new FileReader("e:/t.txt");
			fw = new FileWriter("d:/t.txt");
			char[] s = new char[1024];
			int len;
			while((len=fr.read(s))!=-1){
				fw.write(s, 0, len);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		finally {
			if(fw!=null)
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(fr!=null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
