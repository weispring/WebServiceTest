package spring.webservice.util;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;

import javax.sound.sampled.AudioFormat.Encoding;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;



public class TestWs {

	 public void soap() throws Exception{  
		  
		HttpClient client = new HttpClient();
		PostMethod postMethod = new PostMethod("http://localhost:8090/WebService");
		// 3.设置请求参数
		 postMethod.setRequestBody(new
		 FileInputStream("C:\\Users\\lixia\\Desktop\\22.xml")); //文件名自定义
		 /* String param = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
				+ "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""
				+ "xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
				+ "	<soap:Body><doSomething xmlns=\"http://control.test.spring/\"><value>yui</value>"
				+ "	</doSomething></soap:Body></soap:Envelope>";
		
         param = param.replace("<", "&lt;");
         param = param.replace(">", "&gt;");
         param = param.trim();
         
		 byte[] b = param.getBytes("utf-8");
         InputStream is = new ByteArrayInputStream(b, 0, b.length);
         RequestEntity re = new InputStreamRequestEntity(is, b.length,
                  "application/soap+xml; charset=utf-8");
         postMethod.setRequestEntity(re);*/

		// 修改请求的头部
		postMethod.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
		// postMethod.addParameter("value", "12345");
		// 4.执行请求 ,结果码
		int code = client.executeMethod(postMethod);
		System.out.println("结果码:" + code);
		// 5. 获取结果
		String result = postMethod.getResponseBodyAsString();
		System.out.println("Post请求的结果：" + result);
	    }  
	 public static void main(String[] args) throws Exception {
		
		 ClientUtil clientUtil = new ClientUtil("http://localhost:8090/WebService?wsdl");
		 String result = clientUtil.doSomething("123");
		 System.err.println(result);
		 result = clientUtil.testMultiParams("value", "leixing");
		 System.err.println(result);
	}

}
