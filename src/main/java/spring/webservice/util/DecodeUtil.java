package spring.webservice.util;



public class DecodeUtil {

	private static String key = "0000";

	public static String decode (String key,String text) {
		
		char[] c = key.toCharArray();
		int cLength = c.length;
		StringBuffer result = new StringBuffer();
		char[] t = text.toCharArray();
		for (int i = 0; i < t.length; i++) {
			int m = i%cLength;
			t[i] =(char)((int)t[i]-(int)c[m]); 
			result.append(t[i]);
		}
		  System.err.println("解密后： "+result.toString());
		return result.toString();
		
	}

	public static String encode(String key, String text) {

		char[] c = key.toCharArray();
		int cLength = c.length;
		StringBuffer result = new StringBuffer();
		char[] t = text.toCharArray();
		for (int i = 0; i < t.length; i++) {
			int m = i % cLength;
			t[i] = (char) ((int)t[i]+(int)c[m]);
			result.append(t[i]);
		}
        System.err.println("加密后： "+result.toString());
		return result.toString();

	}
	

	public static void main(String[] args) {
		String text = "";
		String k = null;
		String en = encode(k==null?key:k, text);
		System.err.println("密文: "+en.toString());
		String de = decode(k==null?key:k,en);
		System.err.println("明文： "+de.toString());
	}
	
}
