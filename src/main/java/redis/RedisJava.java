package redis;

import redis.clients.jedis.Jedis;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/8/6 12:22
 */
public class RedisJava {
	public static void main(String[] args) {
		//连接本地的 Redis 服务
		Jedis jedis = new Jedis("localhost");
		System.out.println("连接成功");
		//查看服务是否运行
		System.out.println("服务正在运行: "+jedis.ping());
	}
}
