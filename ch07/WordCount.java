package ch07;

public class WordCount implements Comparable {
	private String word;
	private int count;

	public WordCount(String word, int count) {
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
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (null == o) {
			throw new java.lang.NullPointerException();
		}
		if (o instanceof WordCount) {
			WordCount that = (WordCount) o;
			if (this.count == that.getCount()) {
				//这句话目的是什么
				return this.word.compareTo(that.getWord());
			} else {
				//为什么要加负号
				return -Integer.valueOf(this.count).compareTo(that.getCount());
			}
		} else {
			throw new java.lang.IllegalArgumentException("我没法和别的对象比较：" + o.getClass());
		}

	}
}
