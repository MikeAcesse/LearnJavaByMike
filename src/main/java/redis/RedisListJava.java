package redis;

import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/8/6 13:54
 */
public class RedisListJava {
	public static void main(String[] args) {
		//连接本地的 Redis 服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("连接成功");
		//存储数据到列表中
		jedis.lpush("site-list", "Runoob");
		jedis.lpush("site-list", "Google");
		jedis.lpush("site-list", "Taobao");
		// 获取存储的数据并输出
		List<String> list = jedis.lrange("site-list", 0 ,2);
		for(int i=0; i<list.size(); i++) {
			System.out.println("列表项为: "+list.get(i));
		}
	}
}
