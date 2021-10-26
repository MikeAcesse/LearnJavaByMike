package imooc.mthread.part20;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/26 17:32
 */
public class Data {
	public Data(String message) {
		this.message = message;
	}

	private String message;

	public Data() {

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
