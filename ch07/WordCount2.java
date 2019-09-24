package ch07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordCount2  {
	 public static void main(String[] args) {
		Set  set=new HashSet();
		 
		WordCount2 count=new WordCount2("ab",5);
		set.add(count);
		
		WordCount2 count2=new WordCount2("ab",0);
		System.out.println(set.contains(count2));
		
		if(!set.contains(count2)) {
			set.add(count2);
		}
		
		Iterator it=set.iterator();
		while(it.hasNext()) {
			WordCount2 wordCount2=(WordCount2)it.next();
			System.out.println(wordCount2.word+"="+wordCount2.count);
		}
		 
		
		
	}
	private String word;
	private int count;

	public WordCount2(String word, int count) {
		super();
		this.word = word;
		this.count = count;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return word.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return ((WordCount2) obj).word.equals(this.word);
	}
}
