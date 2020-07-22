package com.net;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/22 19:03
 */
public class Client {
	public static void main(String[] args) throws IOException {
		Socket sock = new Socket("localhost",6666); //连接指定服务器和端口
		InputStream input  = sock.getInputStream();
		OutputStream output = sock.getOutputStream();
		handle(input,output);

	}

	public static void handle(InputStream input, OutputStream output) throws IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
		BufferedReader reader = new BufferedReader(new InputStreamReader(input,StandardCharsets.UTF_8));
		Scanner scanner = new Scanner(System.in);
		System.out.println("[server] "+reader.readLine());
		for(;;){
			System.out.println(">>> "); //打印提示
			String s = scanner.nextLine(); //读取一行输入
			writer.write(s);
			writer.newLine();
			writer.flush();
			String resp = reader.readLine();
			System.out.println("<<< "+resp);
			if(resp.equals("bye")){
				break;
			}
		}
	}
}
