package com.huawei.classroom.student.h10.q05;

public class StudentUtilB {
	StudentUtilB()
	{
		
	}
	public String[] sort(String a)
	{
		String[] everystu=a.split(";");
		String[][] all=new String[everystu.length][2];
		for(int i=0;i<everystu.length;i++)
		{
			all[i]=everystu[i].split(",");
		}
		for(int i=0;i<all.length;i++)
		{
			for(int j=0;j<all.length-i-1;j++)
			{
				if(Double.parseDouble(all[j][1])<Double.parseDouble(all[j+1][1]))
				{
					String[] tem = all[j];
					all[j]=all[j+1];
					all[j+1]=tem;	
				}
			}
		}
		String[] ans=new String[all.length];
		for(int i=0;i<all.length;i++)
		{
			ans[i]=all[i][0];
		}
		return ans;
	}
}
