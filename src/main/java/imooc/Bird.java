package imooc;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/23 18:06
 */
public abstract class Bird {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract int fly();
}
