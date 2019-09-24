package ch13.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 这个例子展示了如何动态调用无参数方法
 * 
 * @author cjy
 *
 */
public class DynamicDemo {

	public static void main(String[] args) {
		Object obj = new Student("jack", 123);
		try {
			//变相的调用了getName()方法
			//((Student)obj).getName();
			Object result = dynamicInvokeMethod(obj, "getName");
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static Object dynamicInvokeMethod(Object obj, String methodName) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Method method = obj.getClass().getMethod(methodName);
		return method.invoke(obj);
	}

}
