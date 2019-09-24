package ch09;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 本例子演示了如何用面向byte的方式 读取、写入文件
 * @author cjy
 *
 */
public class ReadWriteFileByteDemo {
	public static int CHUNK_SIZE = 4096;

	public ReadWriteFileByteDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			copyFile("D:\\temp\\1.txt", "D:\\temp\\2.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 复制IO流
	 * @param in
	 * @param out
	 * @throws IOException
	 */
	public static void copyIO(InputStream in, OutputStream out) throws IOException {
		byte[] buf = new byte[CHUNK_SIZE];
		/**
		 * 从输入流读取内容的典型方法
		 */
		int len = in.read(buf);
		while (len != -1) {
			out.write(buf, 0, len);
			len = in.read(buf);
		}
	}

	/**
	 * 复制文件
	 * @param fsrc
	 * @param fdest
	 * @throws IOException
	 */
	public static void copyFile(String fsrc, String fdest) throws IOException {
		InputStream in=null;
		OutputStream out=null;
		try {
			in = new FileInputStream(fsrc);
			out = new FileOutputStream(fdest, true);
			copyIO(in, out);	
			
		} finally {
			close(in);
			
			close(out);
		}
	}
	
	/**
	 * 关闭一个输入 输出流
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
