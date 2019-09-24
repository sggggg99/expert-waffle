package ch09;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class UseFile {
	public static void main(String args[]) throws Exception {
		// 创建目录
		File dir1 = new File("D:\dir1");
		if (!dir1.exists()) {
			dir1.mkdir();
		}

		// 在某个目录下 创建目录
		File dir2 = new File(dir1, "dir2");
		if (!dir2.exists()) {
			dir2.mkdirs();
		}

		// 在某个目录下 创建多层目录
		File dir4 = new File(dir1, "dir3\\dir4");
		if (!dir4.exists())
			dir4.mkdirs();

		// 在某个目录下 创建文件
		File file = new File(dir2, "test.txt");
		if (!file.exists())
			file.createNewFile();

		file = new File("D:/dir1/mytest.txt");
		if (!file.exists())
			file.createNewFile();

		listDir(dir1);

		deleteDir(dir1);
	}

	/**
	 * 察看目录信息
	 * 
	 * @throws IOException
	 */
	public static void listDir(File dir) throws IOException {
		if (dir.isFile()) { 
			System.out.println(
					"文件:" + dir.getCanonicalPath() + "  修改日期:" + new Date(dir.lastModified()) + " 大小:" + dir.length());
			return;
		}
		File[] lists = dir.listFiles();
		// 打印当前目录下包含的所有子目录和文件的详细信息
		for (int i = 0; i < lists.length; i++) {
			File f = lists[i];
			// 如果为目录，就递归调用listDir()方法
			System.out.println("目录:" + f.getCanonicalPath() + "  修改日期:" + new Date(f.lastModified()));
			listDir(f);

		}
	}

	/** 删除目录或文件，如果参数file代表目录，会删除当前目录以及目录下的所有内容 */
	public static void deleteDir(File file) {
		// 如果file代表文件，就删除该文件
		if (file.isFile()) {
			file.delete();
			return;
		}

		// 如果file代表目录，先删除目录下的所有子目录和文件
		File[] lists = file.listFiles();
		for (int i = 0; i < lists.length; i++) {
			deleteDir(lists[i]); // 递归删除当前目录下的所有子目录和文件
		}
		// 最后删除当前目录
		file.delete();
	}
}
