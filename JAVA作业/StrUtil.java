package com.huawei.classroom.student.h10.q04;

public class StrUtil {
	StrUtil()
	{
		
	}
	public String removeDulpicatedChar(String a)
	{
		StringBuffer b=new StringBuffer(a);
		int[] allchar=new int[200];
		for(int i=0;i<b.length();i++)
		{
			if(allchar[b.charAt(i)]!=0) 
				{
					b.deleteCharAt(i);
					i--;
				}
			else allchar[b.charAt(i)]++;
		}
		String ans=b.toString();
		return ans;
	}
}
