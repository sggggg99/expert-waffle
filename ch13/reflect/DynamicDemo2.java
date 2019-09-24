package ch13.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 这个例子展示了如何动态的调用一个带有参数的方法
 * @author cjy
 *
 */
public class DynamicDemo2 {
	public static void main(String[] args) {
		Object obj = new Student("jack", 123);
		try {
			//((Student)obj).setName("tom");
			String[] argClassName = { "java.lang.String" };
			//Object result=dynamicInvokeMethod(obj,"setName");
			dynamicInvokeMethod2(obj, "setName", argClassName, "tom");
			dynamicInvokeMethod4(obj, "setName",  "tom");
			System.out.println(((Student) obj).getName());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static Object dynamicInvokeMethod2(Object obj, String methodName, String[] argsClassNames, Object... values)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException, ClassNotFoundException {
		Class[] classes = new Class[argsClassNames.length];
		for (int i = 0; i < classes.length; i++) {
			classes[i] = Class.forName(argsClassNames[i]);
		}
		Method method = obj.getClass().getMethod(methodName, classes);
		return method.invoke(obj, values);
	}
	
	public static Object dynamicInvokeMethod4(Object obj, String methodName,   Object... values)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException, ClassNotFoundException {
		Class[] classes = new Class[values.length];
		for (int i = 0; i < values.length; i++) {
			classes[i] =values[i].getClass();
		}
		Method method = obj.getClass().getMethod(methodName, classes);
		return method.invoke(obj, values);
	}

}
