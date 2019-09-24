package ch07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 读取小说的内容
 * @author cjy
 *
 */
public class RedContent {
	
	
	public static String readFile(String filename)
			throws FileNotFoundException, IOException {

		File src = null;
		int totalReaded = 0;
		int readed = 0;
		FileInputStream reader = null;
		byte data[];
		try {
			src = new File(filename);
			if (!src.exists()) {
				System.out.println(src.getAbsolutePath());
				throw new IllegalArgumentException("读取文件失败：指定文件" + filename
						+ "不存在。");
			}
			if (src.isDirectory()) {
				throw new IllegalArgumentException("读取文件失败：" + filename
						+ "是目录而不是文件。");
			}

			Long len = src.length();

			data = new byte[len.intValue()];
			for (reader = new FileInputStream(filename); reader.available() > 0;) {
				readed = reader.read(data, totalReaded,
						(len.intValue() - totalReaded));
				totalReaded += readed;
			}
			return new String(data, "GBK");
		} finally {

			if (reader != null) {
				reader.close();
			}

		}

	}
	
}
