package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/20 19:22
 */
public class FileCopy {
	public static void main(String[] args) throws IOException {
		byte[] buffer = new byte[512]; //一次取出的字节数大小，缓冲区大小
		int numberReader = 0;
		FileInputStream input = null;
		FileOutputStream out = null;
		try {
			input = new FileInputStream("./src/main/java/com/io/dbio.properties"); //相对路径
			out = new FileOutputStream("log/dbio.properties");
			while((numberReader = input.read(buffer)) !=-1){
                 out.write(buffer,0,numberReader);   //把buffer数据写入到out流中
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();
				out.close();
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}
