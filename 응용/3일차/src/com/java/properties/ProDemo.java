package com.java.properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class ProDemo {

	public static void main(String[] args) {
//		Properties p = System.getProperties();
//		Set<Entry<Object, Object>> entry = p.entrySet();
//		for (Entry<Object, Object> e : entry) {
//			System.out.println("key=" + e.getKey() + " value = " + e.getValue());
//		}

		String defaultDir = System.getProperty("user.dir");
		Properties prop = new Properties();

		InputStream is = null;
//		try {
//			is = new FileInputStream(defaultDir + "\\config.properties");
//			prop.load(is);
//			String ip = prop.getProperty("ip");
//			String id = prop.getProperty("id");
//			String max = prop.getProperty("max");
//			System.out.println(ip);
//			System.out.println(id);
//			System.out.println(max);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (is != null)
//					is.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		// try with resource
		try(InputStream ips 
				= new FileInputStream(
						defaultDir + "\\config.properties"
						)) 
		{
			prop.load(ips);
			String ip = prop.getProperty("ip");
			String id = prop.getProperty("id");
			String max = prop.getProperty("max");
			System.out.println(ip);
			System.out.println(id);
			System.out.println(max);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
