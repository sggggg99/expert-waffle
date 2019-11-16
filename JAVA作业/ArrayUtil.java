package com.huawei.classroom.student.h10.q03;

public class ArrayUtil {
	public ArrayUtil() {
		// TODO Auto-generated constructor stub
	}
	public int getMin(int[] a)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}

}
