package ch11;

import java.util.ArrayList;
import java.util.List;

/**
 *  foreach的例子
 * @author cjy
 *
 */
public class ForeEachDemo {

	public ForeEachDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		for (String string : list) {
			System.out.println(string);
		}
		//上面代码和下面代码等效
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
