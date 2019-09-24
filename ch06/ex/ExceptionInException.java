package ch06.ex;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 这个例子演示了 异常处理中 仍然可能发生异常
 * @author cjy
 *
 */
public class ExceptionInException {

	public ExceptionInException() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		FileInputStream in=null;
		try {
			in=new FileInputStream("D:/temp.txt");
			//..其他操作
		}catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			if(in!=null) {
				//这行导致的异常处理中的异常
				in.close();
			}
			
		}

	}

}
