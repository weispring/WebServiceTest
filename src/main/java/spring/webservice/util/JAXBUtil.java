package spring.webservice.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBUtil {
	public static String marshalBeanToCDATA(Object bean,Class<?> type){
		String cdataStr = "";
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(type);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			marshaller.marshal(bean, out);
			cdataStr = out.toString();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return cdataStr;
	}
	
	public static String marshalBeanToXmlStr(Object bean,Class<?> type){
		String cdataStr = null;
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(type);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			marshaller.marshal(bean, out);
			cdataStr = new String(out.toByteArray(),"utf-8");
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return cdataStr;
	}
	
	public static String marshalBeanToXmlStr(Object bean,Class<?> type,Boolean isFormat,Boolean isFragment){
		String cdataStr = "<?xml version=\"1.0\" encoding=\"utf-8\"?><error>接口服务端程序异常</error>";
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(type);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, isFormat);
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, isFragment);
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			marshaller.marshal(bean, out);
			cdataStr = new String(out.toByteArray(),"utf-8");
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return cdataStr.replace(" standalone=\"yes\"", "");
	}
	
	public static Object unmarshallXmlStrToBean(String xmlStr,Class<?> clazz){
		Object obj = null;
		try {
			JAXBContext jc = JAXBContext.newInstance(clazz);  
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			obj = unmarshaller.unmarshal(new ByteArrayInputStream(xmlStr.getBytes("utf-8")));
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}  
		return obj;
	}
	

}
