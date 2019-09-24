package ch07;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Map Set综合使用的例子
 * 
 * @author cjy
 *
 */
public class MapDemo {

	public static void main(String[] args) {
		String content;
		try {
			// 读取红楼梦的内容;
			// 文件地址要根据每个同学存放的位置不同而不同
			// red2.txt里面我已经去掉了大部分的特殊字符
			content = RedContent.readFile("D:/course/course/code_demo/src/ch07/red2.txt");
			System.out.println("红楼梦共计：" + content.length() + "字");
			System.out.println("红楼梦前100个字符（保证读取出来的不乱码）" + content.substring(0, 100));

			MapDemo mapDemo = new MapDemo();
			// 依次统计1,2,3
			// 我在我的电脑上只跑到i=3, i=1大约1秒，i=2大约70秒 i=3好几百秒
			// 目前的算法很简单，但是效率很低，大家能想法优化么？
			// 如果对只取前10个频率最高的词汇，你们最快能优化到多少？

			for (int i = 1; i < 10; i++) {
				// 当前时间
				long l = System.currentTimeMillis();
				System.out.println("出现最频繁的" + i + "个字统计");
				mapDemo.getFrequentWord(content, i);
				System.out.println("本次耗时:" + (System.currentTimeMillis() - l) / 1000 + "秒");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * @param content
	 * @param wordLen
	 */
	public void getFrequentWord(String content, int wordLen) {
		Set set = getWordCount(content, wordLen);
		Iterator it = set.iterator();
		int line = 0;
		// 打印top10
		while (it.hasNext() && line <= 10) {
			line++;
			WordCount wordCount = (WordCount) it.next();
			System.out.println(wordCount.getWord() + ":" + wordCount.getCount());
		}
	}

	/**
	 * 统计content中 wordLen长的字符串出现的频率
	 * @param content
	 * @param wordLen
	 * @return
	 */
	public Set getWordCount(String content, int wordLen) {
		// Map的使用，key是词，value是出现的次数
		Map wordCounts = new HashMap();
		for (int i = 0; i < content.length() - wordLen - 1; i++) {
			// 依次截取每个词
			String word = content.substring(i, i + wordLen);
			// wordCounts.keySet().contains(word) 说明已经统计过这个词了，不需要再统计
			if (!wordCounts.keySet().contains(word)) {
				// 得到出现频率
				int count = this.getCount(content, word);
				wordCounts.put(word, count);
				
				int myCount=(int)wordCounts.get(word);
				 
			}
		}

		// 对所有词进行排序,注意 我用了TreeSet目的是排序

		Set set = new TreeSet();
		// 使用iterator遍历
		Iterator it = wordCounts.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			int count = (int) wordCounts.get(key);
			// 请大家阅读WrodCount.compareTo方法
			WordCount wordCount = new WordCount(key, count);
			set.add(wordCount);
		}
		System.out.println("set 大小：" + set.size());
		return set;
	}

	/*
	 * 判断一个词在一个大字符串里出现的频率
	 */
	public int getCount(String content, String word) {
		if (word == null) {
			return 0;
		}
		if (word.trim().length() == 0) {
			return 0;
		}
		int pos = 0;
		int count = 0;
		//注意下面的这个循环
		pos = content.indexOf(word, pos);
		while (pos >= 0) {
			count++;
			//为什么要 content.indexOf(word, pos + word.length());
			//而不是  content.indexOf(word, pos);
			pos = content.indexOf(word, pos + word.length());
		}
		return count;
	}

}
