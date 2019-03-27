package config;

import java.util.ArrayList;
import java.util.List;

import bean.Mail;
import util.Leancloud;

/**
 * 通知列表
 * 
 * @author Administrator
 *
 */
public class NotifyList {

	/**
	 * 要通知的邮箱列表
	 * 
	 * @return
	 */
	public static List<String> getMailList() {
		List<Mail> allMailList = Leancloud.getMailList();
		List<String> notifyMailList = new ArrayList<>();
		for (Mail mail : allMailList) {
			if (mail.isEnable()) {
				notifyMailList.add(mail.getAddress());
			}
		}
		return notifyMailList;
	}

}
