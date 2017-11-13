package spring.test.control;

import javax.jws.WebParam;
import javax.xml.bind.JAXB;

import spring.webservice.util.BaseData;
import spring.webservice.util.JAXBUtil;
@javax.jws.WebService
public class WebService {

	public WebService() {
		// TODO Auto-generated constructor stub
	}

	public String testMultiParams(@WebParam(name="value",targetNamespace="") String value){
		
		return " just do it "+value;
	}
	
	public String doSomething(@WebParam(name="value",targetNamespace="") String value,
			@WebParam(name="type",targetNamespace="") String type){
		BaseData baseData = new BaseData();
		baseData.setSysId(type);
		baseData.setUserId(value);
		String requestXml = JAXBUtil.marshalBeanToXmlStr(baseData,BaseData.class);
		return requestXml;
	}
}
