package classloader;

import java.io.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/26 11:16
 * 加密工具类
 */
public class FileUtis {
	public static void test(String path) {
		File file = new File(path);
		try {
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(path+"en");
			int b = 0;
			int b1 = 0;
			while((b=fis.read()) != -1){
              //每个byte 异或一个数字2
				fos.write(b^2);
			}
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
