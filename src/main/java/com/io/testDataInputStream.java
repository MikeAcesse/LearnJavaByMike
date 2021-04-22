package com.io;

import javax.swing.text.StyledEditorKit;
import java.io.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/21 20:11
 */
public class testDataInputStream {
	public static void main(String[] args) {
		Member[] members = {new Member("Justin",90),new Member("mike",95),new Member("Bush",100)};
		try {
			DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("E:/fan.log"));
			for(Member member : members){
				outputStream.writeUTF(member.getName()); //写入UTF字符串
				outputStream.writeInt(member.getAge()); //写入int数据
			}
			outputStream.flush(); //所有数据至目的地
			outputStream.close(); //关闭流
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {

			DataInputStream dataInputStream = new DataInputStream(new FileInputStream("E:/fan.log"));
			for (int i = 0; i < members.length; i++) { //读出数据并还原对象
                  String name = dataInputStream.readUTF();
                  int score = dataInputStream.readInt();
                  members[i]= new Member(name,score);

			}
			dataInputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//显示还原后的数据
		for(Member member : members){
			System.out.printf("%s\t%d%n",member.getName(),member.getAge());
		}
	}
}
