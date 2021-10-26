package classloader;

import java.io.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/26 10:26
 */
public class DiskClassLoader extends ClassLoader {
	private String mLibPath;
	public DiskClassLoader(String path){
		mLibPath = path;
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		String fileName = getFileName(name);
		File file = new File(mLibPath,fileName);
		try {
			FileInputStream is = new FileInputStream(file);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int len = 0;
			while((len = is.read()) !=-1){
				bos.write(len);
			}
			byte[] data = bos.toByteArray();
			is.close();
			bos.close();
			return defineClass(name,data,0,data.length);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.findClass(name);
	}

	// 获取要加载的class文件名
	private String getFileName(String name) {
		int index = name.lastIndexOf('.');
		if(index == -1){
			return name+".class";
		}else{
			return name.substring(index+1)+".class";
		}
	}
}
