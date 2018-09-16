package com.lilith.file;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class TestFile {
//	@Test
	public void testFile01() throws Exception {
		File file1 = new File("C:\\Users\\Perform\\Desktop\\新建文本文档.txt");
		File file2 = new File(file1, "新建文本文档1.txt");
//		if(!file2.exists()) {
//			file2.mkdirs();
//			file2.createNewFile();
//			System.out.println(file2.exists());
//		}
		file1.getPath();
		System.out.println(file1.getPath());
		System.out.println(file2.isFile());
		System.out.println(file2);
	}
	
	private int k = 0;
	private int j = 0;
//	@Test
	public void testDeletFile() {
		deleteFile("D:\\英雄联盟");
		System.out.println("删除了"+j+"个文件，"+k+"个文件夹");
	}
	/**
	 * 
	 * @param path
	 */
	public void deleteFile(String path) {
		File file1 = new File(path);
		File file2 = null;
		File[] fileNames = null;
		if(file1.isDirectory()) {
			fileNames = file1.listFiles();
			for(int i = 0; i < fileNames.length; i++) {
				file2 = fileNames[i];
				deleteFile(file2.getAbsolutePath());
			}
			deleteFile(file1);
			k++;
		}else {
			deleteFile(file1);
			j++;
		}
	}
	
	public void deleteFile(File file) {
		System.out.println("正在删除文件"+file.getAbsolutePath()+".....");
		if(file.delete()) {
			System.out.println("删除成功");
		}else {
			System.out.println("删除失败");
		}
	}
	
	@Test
	public void testFileFitler() {
		File file = new File("E:\\征信文档");
		File[] list = file.listFiles();
		for(File file1 : list) {
			System.out.println(file1.getAbsolutePath());
		}
		System.out.println("过滤后");
		list = file.listFiles(new FileFilter() {
			
			public boolean accept(File file) {
				// TODO Auto-generated method stub
				return file.getAbsolutePath().endsWith(".doc");
			}
		});
		for(File file1 : list) {
			System.out.println(file1.getAbsolutePath());
		}
	}
}
