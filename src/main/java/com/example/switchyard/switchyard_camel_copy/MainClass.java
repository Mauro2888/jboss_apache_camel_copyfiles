package com.example.switchyard.switchyard_camel_copy;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
public class MainClass {

	public static void main(String[] args) {
		copyFiles();
	}
	
	public static void copyFiles(){
		CopyBuilder copyBuildData = new CopyBuilder();
		CamelContext cx = new DefaultCamelContext();
		try {
			cx.addRoutes(copyBuildData);
			cx.start();
			Thread.sleep(5 * 60 * 1000);
			cx.stop();
			System.out.println("copy success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
