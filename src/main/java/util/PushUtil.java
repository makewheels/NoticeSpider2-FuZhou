package util;

import java.util.List;

import bean.Notice;
import config.NotifyList;

/**
 * 推送
 * 
 * @author Administrator
 *
 */
public class PushUtil {

	/**
	 * 推送新公告
	 * 
	 * @param notice
	 */
	public static void pushNotice(Notice notice) {
		StringBuilder content = new StringBuilder();
		content.append("<b>任务名</b>：" + notice.getMissionName() + "<br><br>");
		content.append("<b>标题</b>：" + notice.getTitle() + "<br><br>");
		content.append("<b>本公告</b>：<a href='" + notice.getWholeUrl() + "'>点击跳转该公告</a><br><br>");
		content.append("<b>公告栏</b>：<a href='" + notice.getNoticeBoardUrl() + "'>点击跳转总公告栏</a>");
		List<String> mailList = NotifyList.getMailList();
		for (String mail : mailList) {
			AliyunMailUtil.send(mail, "新公告：" + notice.getMissionName(), content.toString());
		}
	}

}
