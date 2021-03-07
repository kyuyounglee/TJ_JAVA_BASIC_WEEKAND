package com.java.exception;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App05 {

	public static void main(String[] args) {
		// 상대경로
		Path path = Paths.get("test.txt");
		System.out.println(path.toAbsolutePath());		
		String fileName = path.toAbsolutePath().toString();
		
		
		FileInputStream is = null;
		BufferedInputStream bis = null;
		try {
			is = new FileInputStream(fileName);
			bis = new BufferedInputStream(is);			
			int data = -1;
			while( (data = bis.read()) != -1) {
				System.out.print((char)data);
			}						
		} catch (Exception e) {			
			e.printStackTrace();
		}finally {
			try {
				if(bis !=null)
					bis.close();
				if(is != null)
					is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
////////////////////////////////////////////////
// try -with - resource
		
		
		
		try(FileInputStream is2 = new FileInputStream(fileName);
			BufferedInputStream bis2 = new BufferedInputStream(is2);
			) 
		{
			int data = -1;
			while( (data = bis2.read()) != -1) 
			{
				System.out.print((char)data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	
	
	static void A(int a) throws Exception{
		a = 100;
		
	}

}
