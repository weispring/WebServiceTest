package spring.webservice.util;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * 《盖章请求系统信息部分》
 * @author 吴敏
 * @author 陈冰
 */
@XmlRootElement(name="BaseData")
@XmlAccessorType(XmlAccessType.FIELD)
public class BaseData {
	@XmlElement(name = "SYS_ID")
	private String sysId;
	@XmlElement(name = "USER_ID")
	private String userId;
	@XmlElement(name = "USER_PSD")
	private String userPsd;
	
	public String getSysId() {
		return sysId;
	}
	public void setSysId(String sysId) {
		this.sysId = sysId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPsd() {
		return userPsd;
	}
	public void setUserPsd(String userPsd) {
		this.userPsd = userPsd;
	}
	public BaseData(String sysId, String userId, String userPsd) {
		super();
		this.sysId = sysId;
		this.userId = userId;
		this.userPsd = userPsd;
	}
	public BaseData() {
	}
}
