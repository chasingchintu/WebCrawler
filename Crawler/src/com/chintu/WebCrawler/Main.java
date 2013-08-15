package com.chintu.WebCrawler;

import java.io.*;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		try{
			URL url = new URL("http://www.samsungindiasoft.com");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String temp = "";
			while(null != (temp=br.readLine())){
				System.out.println(temp);
			}
		} 
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
