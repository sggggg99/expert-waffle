
package com.huawei.classroom.student.h08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 在本包下增加合适的类和方法，使得Test类能够测试通过 具体要求见实验二 注意 本程序不但要测试通过，还需要写适当的注释
 * 
 * 不要引用jdk1.8以外第三方的包
 * 
 * @author cjy
 *
 */
public class DataUtil {

	/**
	 * 
	 */
	public DataUtil() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 提示 本方法能够从一个文本文件中读取每一行，将每一行放到一个List<String>返回
	 * @param detailFileName
	 * @return
	 * @throws IOException
	 */
	private List<String> readFromFile(String detailFileName) throws IOException {
		Reader reader;
		BufferedReader bReader = null;
		try {
			reader = new FileReader(detailFileName);
			bReader = new BufferedReader(reader);
			List<String> list = new ArrayList<String>();

			String line = bReader.readLine();
			while (null != line) {
				list.add(line);
				line = bReader.readLine();
			}
			return list;
		} finally {
			if (bReader != null) {
				bReader.close();
			}
		}

	}
	/**
	 * detailFileName文件是一个超市的购物小票 每行表示一次购物，每个商品之间用半角逗号分开 请找出 “哪 两个商品总被同时 购买"
	 * 将这两个商品名字用逗号分隔 返回
	 * 
	 * @param detailFileName
	 *            购物小票的文件名
	 * @return 哪 两个商品总被同时 购买,两个商品之间用半角逗号分隔
	 */
	public String getFrequentItem(String detailFileName) throws Exception {
		List<String> contents = new ArrayList<>();
		try {
		    contents = readFromFile(detailFileName);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < contents.size(); i++){
			String [] single = contents.get(i).split(",");
			for(int j = 0; j < single.length; j++){
				
               for(int k = j + 1; k <=single.length-1; k++){
					
					String key = single[j] + "," + single[k];
					String key2 = single[k] + "," + single[j];
					if(map.containsKey(key) ||map.containsKey(key2)){
						int newVal = map.get(key) + 1;
						map.put(key, newVal);
						map.put(key2, newVal);
					}
					else {
						map.put(key,0);
						map.put(key2,0);
					}
				}
			}
		}
		int max = 0;
		String thekey = null;
		for(String key : map.keySet()){
			int nowVal = map.get(key);
			if(max < nowVal) {
				max = nowVal;
				thekey = key;
			}
		}
	   return thekey;
	}

}
