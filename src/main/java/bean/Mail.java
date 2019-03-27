package bean;

/**
 * 要通知的邮箱对象
 * 
 * @author Administrator
 *
 */
public class Mail {
	private String address;
	private boolean enable;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

}
