package imooc.mthread.part43;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/26 17:32
 */
public class Data {
    volatile  int id;
	volatile String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
