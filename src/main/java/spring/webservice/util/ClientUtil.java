package spring.webservice.util;


import java.net.MalformedURLException;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClientUtil {

	private static final Logger log = LoggerFactory.getLogger(ClientUtil.class);
	private static final String KEY="chuangge";
	private WebServiceService implService = null;
	private WebService serviceImpl = null;
//	static {
//		implService = new ChuanggeWebServiceImplService();
//		serviceImpl = implService.getChuanggeWebServiceImplPort();
//	}
	public ClientUtil(String url){
		try {
			implService = new WebServiceService(new URL(url));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setServiceImpl( implService.getWebServicePort());
	}
	public WebService getServiceImpl() {
		return serviceImpl;
	}
	public void setServiceImpl(WebService serviceImpl) {
		this.serviceImpl = serviceImpl;
	}
	// 获取业务数据
	public String doSomething(String xmlData) {
		String result = null;
		try {
		
			result = getServiceImpl().doSomething(xmlData);
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error("webservice接口VreBusiness调用异常", e);
		}
		return result;
	}

	// 获取车辆照片文件、评估报告
	public String testMultiParams(String value,String type) {
		String rsp = null;
		try {
			
			rsp = getServiceImpl().testMultiParams(value, type);
		} catch (Exception e) {
			log.error("webservice接口DownloadFile调用异常", e);
		}
		return rsp;
	}
}
