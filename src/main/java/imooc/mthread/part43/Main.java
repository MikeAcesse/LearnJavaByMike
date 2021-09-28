package imooc.mthread.part43;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/28 9:41
 */
public class Main {
	public static void main(String[] args) {
		Data data = new Data();  //创建Data对象
		// 输出修改前的数据
		System.out.println("修改前，ID: "+data.id+" 名称： "+data.name);
		// 创建ID修改器
		AtomicIntegerFieldUpdater<Data> idUpdater = AtomicIntegerFieldUpdater.newUpdater(Data.class,"id");
		// 创建名称修改器
		AtomicReferenceFieldUpdater<Data,String> nameUpdater = AtomicReferenceFieldUpdater.newUpdater(Data.class,String.class,"name");
		//修改id
		idUpdater.set(data,100);
		//修改名称
		nameUpdater.set(data,"renrenle");
		// 输出修改后的数据
		System.out.println("修改前，ID: "+data.id+" 名称： "+data.name);


	}
}
