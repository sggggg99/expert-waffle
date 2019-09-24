package ch09;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * 本例子演示了如何使用char的方式 读取、写入文件
 * @author cjy
 *
 */
public class ReadWriteFileCharDemo {
	public static int CHUNK_SIZE = 4096;

	public ReadWriteFileCharDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		try {
			String s = readFile("D:/temp/1.txt");
			System.out.println(s);
//			List<String> list=readLine("D:/elipse/course/red.txt");
//			for(int i=0;i<list.size();i++) {
//				System.out.println(list.get(i));
//			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 从一个文件中读取字符串
	 * @param fsrc
	 * @return
	 * @throws IOException
	 */
	public static String readFile(String fsrc) throws IOException {
		Reader reader = null;
		try {
			StringBuffer buf = new StringBuffer();			
			char[] chars = new char[CHUNK_SIZE];
			reader = new FileReader(fsrc);			
			int readed = reader.read(chars);
			while (readed != -1) {
				buf.append(chars, 0, readed);				
				readed = reader.read(chars);
			}
			return buf.toString();
		} finally {
			close(reader);
		}
	}

	/**
	 * 从一个文本文件中，一次读取一行，放到list中
	 * @param fsrc
	 * @return
	 * @throws IOException
	 */
	public static List<String> readLine(String fsrc) throws IOException {
		Reader reader = null;
		LineNumberReader lineReader = null;
		try {
			reader = new FileReader(fsrc);
			lineReader = new LineNumberReader(reader);
			String line = lineReader.readLine();
			List<String> lines = new ArrayList<String>();
			while (line != null) {
				lines.add(line);
				line = lineReader.readLine();
			}
			return lines;
		} finally {
			close(lineReader);
			close(reader);
		}
	}

	/**
	 * 把字符串写到文件中
	 * @param fileName
	 * @param content
	 * @throws IOException
	 */
	public void writeFile(String fileName, String content) throws IOException {
		OutputStream out = null;
		try {
			
			out = new FileOutputStream(fileName, false);
			out.write(content.getBytes());
			out.flush();
		} finally {
			close(out);
		}

	}

	/**
	 * 关闭输入输入流
	 * @param inout
	 */
	public static void close(Closeable inout) {
		if (inout != null) {
			try {
				inout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
