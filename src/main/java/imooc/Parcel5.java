package imooc;


import org.eclipse.jetty.client.api.Connection;
import org.eclipse.jetty.client.api.Destination;
import org.eclipse.jetty.util.Promise;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/26 11:48   局部内部类
 */
public class Parcel5 {
     public Destination destionation (String str){
     	class PDestination implements Destination {
	        private String label;
	        private PDestination(String whereTo){
		        label =whereTo;
	        }
	        public String readLabel(){
		        return label;
	        }

	        @Override
	        public String getScheme() {
		        return null;
	        }

	        @Override
	        public String getHost() {
		        return null;
	        }

	        @Override
	        public int getPort() {
		        return 0;
	        }

	        @Override
	        public void newConnection(Promise<Connection> promise) {

	        }
        }

	     return new PDestination(str);
     }

	public static void main(String[] args) {

	}
}
