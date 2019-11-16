package com.huawei.classroom.student.h06;

import java.util.TreeMap;
import java.util.*;

/**
 * 把你作业的代码写到这个类里面
 * 不可以修改类的名字、包名、和固有的几个方法名以及方法的可见性
 * 可以增加其他方法、属性、类
 * 可以引用jdk的类
 * 不要引用jdk1.8以外第三方的包
 * 
 * @author cjy
 *
 */
public class Home06 {
	public Home06() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 计算出一段文字中不重复的字符的个数，例如“天津市天津大学 ”不重复字符为5
	 * 提示：使用java.util.HashSet 
	 * 难度系数1星
	 * @param s
	 * @return
	 */
	public int getDistinctCharCount(String s) {
		char [] arr = s.toCharArray();
		Set<Character> set = new HashSet(); 
		for(int i = 0;i < arr.length;i++) {
			set.add(arr[i]);
		}
		
		return set.size();
	}
	/**
	 * 返回一段文字中，出现频率最高的字符（不考虑并列第一的情况） 例如：getFrequentChar("好好学习") 返回'好'
	 * 例如：getFrequentChar("我是天津大学软件学院学生") 返回'学'
	 * 提示：使用一个长度为65535的数组，或者使用HashMap   
	 * 难度系数2星
	 * @param s
	 * @return
	 */
	public char getFrequentChar(String s) {
		char [] arr = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char c;
		for(int i = 0;i < arr.length;i++) {
			c = arr[i];
			if(map.get(c) == null) {
				map.put(c, 1);
			}
			else {
				Integer value = map.get(c);
				value++;
				map.put(c, value);
			}
		}
		int max = 0;
		char result = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(map.get(arr[i]) > max) {
				max = map.get(arr[i]);
				result = arr[i];
			}
		}
		
		return result;

	}
	

	
	/**
	 * 返回一段文字中，出现频率最高的词（每个词由2个字符构成，任意两个相邻的字符称为一个词，例如“天津大学，你好”由“天津”“津大”“大学”“学，”“，你”“你好” 6个词构成)
	 * 不会出现频率最高并列的情况
	 * 提示：使用HashMap 
	 * 难度系数2星
	 * @param content
	 * @return
	 */
	public String getFrequentWord(String content){
		String arr[] = new String[content.length()-1];
		for(int i = 0;i < content.length()-1;i++) {
			arr[i] = String.valueOf(content.charAt(i)) + String.valueOf(content.charAt(i + 1));
		}
		HashMap<String,Integer> map = new HashMap();
		String s;
		for(int i = 0;i < arr.length;i++) {
			s = arr[i];
			if(map.get(s) == null) {
				map.put(s, 1);
			}else {
				int values = map.get(s);
				values++;
				map.put(s, values);
			}
		}
		int max = 0;
		String result = "";
		for(int i = 0;i < arr.length;i++) {
			if(map.get(arr[i]) > max) {
				max = map.get(arr[i]);
				result = arr[i];
			}
		}
		return result;
	}
	 
	 
	
	/**
	 * 把一个StringBufer中所有的空格去掉
	 * 提示：不能新建StringBuffer对象，必须在原来的基础上删掉原来字符串
	 * 难度系数1星
	 * @param buf
	 */
	public void zipStringBufer(StringBuffer buf) {
		 int length = 0;
		 int i = 0;
		 while(length < buf.length()) {
			 i = buf.indexOf(" ");
			 buf.deleteCharAt(i);
			 length = i;
		 }
	}

 
}

