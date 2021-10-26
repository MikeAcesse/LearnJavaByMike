package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/7 17:45
 */
public class TestMap {
	public static void main(String[] args) {
		Map<String,String[]> map = new HashMap<String,String[]>();
		String[] everyWeeks={"每周","每月","每年"};
		String[] dayOfWeeks={"星期日","2号","一月"};
		String[] baslineNumbers={"3","10","8"};
		map.put("everyweek",everyWeeks);
		map.put("dayofweek",dayOfWeeks);
		map.put("baselinenumber",baslineNumbers);
		System.out.println(map.size());
		System.out.println(map.toString());
	}
}
