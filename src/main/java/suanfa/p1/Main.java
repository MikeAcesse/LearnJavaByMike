package suanfa.p1;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/2 14:56
 */
public class Main {
   static String  version1="7689.5.6.4";
   static String version2="76892.5.3";
	public static void main(String[] args) {
		int result = compareVersion(version1,version2);
		System.out.println(result);
		int resultb = twochar('D','B');
		System.out.println(resultb);
		System.out.println((int)'D');
	}

	public static int compareVersion(String version1,String version2){
		int len1 = version1.length();
		int len2 = version2.length();
		int index1 =0 ;
		int index2 = 0;
		while(index1 < len1 || index2 < len2){
			int ver1 = 0;
			int ver2 = 0;
			//先把第一个版本号（.）前面的数字转换成int 类型
			while(index1 < len1 && version1.charAt(index1) != '.'){
				ver1 = ver1 * 10 +version1.charAt(index1++) - '0';
			}
			//在把第二个版本号(.)前面的数字转换成int类型
			while (index2 < len2 && version2.charAt(index2) != '.') {
				ver2 = ver2 * 10 + version2.charAt(index2++) - '0';
			}
			//比较这两个数字的大小，如果不相等直接返回
			if (ver1 > ver2) {
				return 1;
			} else if (ver1 < ver2) {
				return -1;
			} else {
				//如果这两个数字相等，就继续后面的比较，
				//这里都加1表示跳过符号(.)
				index1++;
				index2++;
			}
		}
		return 0;
	}

	public static  int twochar(char a,char b){
		return a - b;
	}
}
