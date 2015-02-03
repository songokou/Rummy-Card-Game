/**
 * the user class to keep track of user name
 * ip and start status
 * 
 *
 */

public class User{
	private String name;
	private String ip;
	private boolean isStart = false;
	
	public User(String name, String ip) {
		this.name = name;
		this.ip = ip;
	}

	public String getName() {
		return name;
	}

	public boolean getisStart(){
		return isStart;
	}
	
	public void setisStart(boolean b){
		isStart = b;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}