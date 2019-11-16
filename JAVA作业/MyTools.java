package com.huawei.classroom.student.h09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
/**
 * 在本包下增加合适的类和方法， 本程序不但要测试通过，还需要写适当的注释
 * 
 * 不要引用jdk1.8以外第三方的包
 * 
 * @author cjy
 *
 */
public class MyTools {
	public String stulist;
	public String picdir;
	public ArrayList<String> stu=new ArrayList<String>();
	/**
	 * 
	 * @param studentListFile  存放学生名单的文件名
	 * @param picDir 图片存放的目录（不会包含子目录）
	 * @throws FileNotFoundException 
	 */
	public MyTools(String studentListFile,String picDir) throws FileNotFoundException {
		// TODO Auto-generated constructor stub
		this.picdir=picDir;
		this.stulist=studentListFile;
		File stul=new File(stulist);
		Scanner sca=new Scanner(stul);
		while(sca.hasNext())
		{
			this.stu.add(sca.nextLine());
		}
	}
	
	
	public Set<String> getOverSizeStudentList() throws Exception {
		Set<String> list=new HashSet<String>();
		Set<String> list1=new HashSet<String>();
		List<String>ty=new ArrayList<String>();
		File pic=new File(picdir);
		File[] stupic=pic.listFiles();
		for(int i=0;i<stupic.length;i++)
		{
			if(stupic[i].length()>128*1024) 
			{
				String t=stupic[i].getName().substring(0,stupic[i].getName().lastIndexOf(".") );
				list.add(t);
			}
		}
		return list;
	}
	
	public Set<String> getNoPicStudentList()  throws Exception {
		File pic=new File(picdir);
		Set<String> list=new HashSet<String>();
		String[][] tem=new String[stu.size()][3];
		for(int j=0;j<tem.length;j++)
		{
			tem[j]=stu.get(j).split("\t");
		}
		File[] stupic=pic.listFiles();
		String[] hasname=new String[stupic.length];
		for(int i=0;i<stupic.length;i++)
		{
			hasname[i]=stupic[i].getName();	
		}
		for(int j=0;j<tem.length;j++)
		{
			boolean in=false;
			for(int k=0;k<hasname.length;k++)
			{
				String temm=tem[j][0]+".jpg";
				if(temm.equals(hasname[k])) in=true;
			}
			if(!in) list.add(tem[j][0]);
		}
		return list;
	}

}
