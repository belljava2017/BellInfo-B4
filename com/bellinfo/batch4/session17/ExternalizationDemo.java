package com.bellinfo.batch4.session17;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ExternalizationDemo {

	public static void main(String[] args) {
		String fileName = "Site.txt";
		String absPath = System.getProperty("user.dir");
		String fullPath = absPath+File.separator+fileName;
		
		Site site = new Site();
		
		try(FileInputStream fis = new FileInputStream(fullPath);
			ObjectInputStream ois = new ObjectInputStream(fis);){
			site =(Site)ois.readObject();
			System.out.println(site);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
			

	}

}
