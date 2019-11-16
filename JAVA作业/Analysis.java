
package com.huawei.classroom.student.h07;

import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 在本包下增加合适的类和方法，使得Test类能够测试通过 具体要求见实验一 注意 本程序不但要测试通过，还需要写适当的注释
 * 
 * 不要引用jdk1.8以外第三方的包
 * 
 * @author cjy
 *
 */
public class Analysis {

	/**
	 * 
	 */
	public Analysis() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 提示 ：将一个文本文件读取到一个字符串中返回 提示：参考ch09.ReadWriteFileCharDemo.java
	 * 
	 * @param filename
	 *            红楼梦文本文件的全路径名
	 * @return 文本的内容
	 */
	private String readFromTxt(String filename) throws Exception {
		Reader reader = null;
		try {
			StringBuffer buf = new StringBuffer();
			char[] chars = new char[1024];
			reader = new FileReader(filename);
			int readed = reader.read(chars);
			while (readed != -1) {
				buf.append(chars, 0, readed);
				readed = reader.read(chars);
			}
			return buf.toString();
		}
		finally {
			close(reader);
		}
	}

	/**
	 * 关闭输入输入流
	 * 
	 * @param inout
	 */
	private void close(Closeable inout) {
		if (inout != null) {
			try {
				inout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * 将红楼梦文本文件拆分为120个章节
	 * 
	 * @param content
	 * @return 返回120个元素的字符串数组
	 */
	private String[] splitContentToChapter(String content) {
		// 提示 使用 content.split(" 第[一,二,三,四,五,六,七,八,九,十,零]{1,5}回 ");正则表达拆分
		// 百度一下正则表达式
		String contents[] = content.split(" 第[一,二,三,四,五,六,七,八,九,十,零]{1,5}回 ");
		
		return contents;
	}

	/**
	 * 统计某个字符 在一个字符串里面出现的频度
	 * 
	 * @param content
	 * @param sub
	 * @return
	 */
	private int getCount(String content, String sub) {
		int count = 0;
		if(content.contains(sub)){
			while(true){
				int indexof = content.indexOf(sub);
				if(indexof != -1){
					content = content.substring(indexof + sub.length());
					count++;
				}
				else break;
			}
		}

		return count;
	}

	/**
	 * 计算红楼梦中某个字符串 str 出现的频率
	 * 
	 * @param filename
	 *            存放了红楼梦这本书的文本文件名
	 * @param str
	 *            要统计的字符串
	 * @return 一个长度是120的一维数组
	 * @throws Exception 
	 */
	public int[] getStringFrequent(String filename, String str) throws Exception {
		// 提示 1 readFromTxt 得到小说的内容
		// 提示 2 splitContentToChapter 得到每章内容
		// 提示 3 针对每章 调用 getCount方法
			String readtxt = readFromTxt(filename);
			String arr [];
			arr = splitContentToChapter(readtxt);
			int [] result = new int[arr.length];
			for(int i = 0; i <result.length;i++){
				result[i] = getCount(arr[i], str);
			}
			return result;
	}
}
