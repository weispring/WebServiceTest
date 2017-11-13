package spring.test.control;
/**
 * 程序启动器
 * 
 */

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Properties;

import javax.servlet.Servlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

	@Controller
	@SpringBootApplication
	//@EnableAutoConfiguration
	public class TestControl {

	    @RequestMapping("/EEE")
	    @ResponseBody
	    String home(HttpServletRequest re) throws UnsupportedEncodingException {
	    	
	    	Cookie [] cookies=re.getCookies();
	        for (Cookie cookie : cookies) {
				System.err.println(cookie.getComment());
				System.err.println(cookie.getDomain());
				System.err.println(cookie.getName());
				System.err.println(cookie.getMaxAge());
				
			
				System.err.println(cookie.getPath());
				System.err.println(cookie.getSecure());
				System.err.println(cookie.getValue());
				System.err.println(cookie.getVersion());
				
				String string=new String(cookie.getValue());
				System.err.println(	URLDecoder.decode(string, "UTF-8"));
			}
	        return "Hello World!";
	    }

	    public static void main(String[] args) throws Exception {
	        //SpringApplication.run(TestControl.class, args);
	        
	        SpringApplication application=new SpringApplication();
	        
	        Properties properties=new Properties();
	        InputStream inputStream=TestControl.class.getClassLoader().getResourceAsStream("application.properties");
	        properties.load(inputStream);
	        application.setDefaultProperties(properties);
	        application.run(TestControl.class, args);
	    }
	}