package com.lilith.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import org.junit.Test;

public class TestClass01 {

//	@Test
	public void selectBak(){
		String path = "Z:\\陈杰";
		File file = new File(path);
//		File[] files = file.listFiles(new FileFilter() {
//			public boolean accept(File file) {
//				return file.getName().endsWith(".bak");
//			}
//		});
//		
//		for(File file1 : files){
//			System.out.println(file1.getAbsolutePath());
//		}
		
		selectFileType(file);
	}
	
	public void selectFileType(File file){
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(File file1 : files){
				selectFileType(file1);
			}
		}else{
			if(file.getName().endsWith(".bak")){
				moveFile(file.getAbsolutePath(), "Z:\\backup\\" + file.getName());
			}
		}
	}
	
	/**
	 * 移动文件（先复制，后删除源文件）
	 * @param oldPath
	 * @param newPath
	 */
	public void moveFile(String oldPath, String newPath){
		try {
			System.out.println("old:"+oldPath+"	new:"+newPath);
			File oldFile = new File(oldPath);
			File newFile = new File(newPath);
			
			if(!newFile.exists()){
				newFile.createNewFile();
			}
			
			FileInputStream is = new FileInputStream(oldFile);
			BufferedInputStream bis = new BufferedInputStream(is);
			FileOutputStream os = new FileOutputStream(newFile);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			
			byte[] b = new byte[1024];
			int i;
			
			while((i = bis.read(b)) != -1){
				bos.write(b, 0, i);
			}
			
			bis.close();
			bos.close();
			
			oldFile.delete();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * 文件内容追加
	 */
//	@Test
	public void testFileSetter() {
		try {
			File file = new File("C:\\Users\\Perform\\Desktop\\新建文本文档 (2).txt");
			
			FileOutputStream os = new FileOutputStream(file, true);
			//FileWriter,FileReader 
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
			bw.write("cc");
			bw.newLine();
			bw.write("aa");
			bw.flush();
			bw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	Thread t1;
	Thread t2;
	
	
	
	
}
