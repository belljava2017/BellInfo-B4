package com.bellinfo.batch4.session15;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		// 1 way of creating a file
		File simpleFile = new File(
				"C:\\Users\\kaizen\\workspace\\BellInfo-B4\\bellInfob4.txt");

		try {
			simpleFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileInputStream fis;
		try {
			
            // 2nd way of creating a file
            String fileName = "wellsfargo.txt";
            String path = System.getProperty("user.dir");
            System.out.println(path);
            String absolutePath = path+File.separator+fileName;
            System.out.println(absolutePath);
            File wellsFile = new File(absolutePath);
            wellsFile.createNewFile();
            
            // 1 way of reading a file using inputStream
            fis = new FileInputStream(simpleFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(bis);
			while (dis.available() != 0) {
				System.out.println(dis.readLine());
			}
			
			// 2nd way of reading a file - BufferedReader
			FileReader fr = new FileReader(wellsFile);
			BufferedReader br = new BufferedReader(fr);
			String line;
			
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
