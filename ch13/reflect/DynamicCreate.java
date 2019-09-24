package ch13.reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * 本例子演示了如何动态构建
 * 
 * @author cjy
 *
 */
public class DynamicCreate {

	public static void main(String[] args) {
		try {
			

			String className = "ch13.reflect.Student";
			//String className = args[0];
			//Object obj = createObject(className);
			Object obj=new Student();
			

			String[] classNames = { "java.lang.String", "java.lang.Integer" };
			obj = createObject4(className, classNames, "jack", 123);
			//Object obj = createObject23(className,  "jack", new Integer(123) );
			System.out.println(obj.getClass().toString() + " " + obj);
//			System.out.println(obj.getClass().toString() + " " + obj);
//			obj = createObject23("ch13.reflect.AnyThing", new Integer(1));
//			obj = createObject23("ch13.reflect.AnyThing", "a","b");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static Object createObject(String className)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class clazz = Class.forName(className);
		Object obj = clazz.newInstance();
		return obj;
	}

	public static Object createObject2(String className)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		Class clazz = Class.forName(className);
		Object obj = clazz.getConstructor(new Class[0]).newInstance();
		return obj;
	}

	public static Object createObject3(String className)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		Class clazz = Class.forName(className);
		Class[] classes = new Class[2];
		classes[0] = String.class;
		classes[1] = Integer.class;
		Object obj = clazz.getConstructor(classes).newInstance("tom", 123);
		return obj;
	}

	public static Object createObject4(String className, String[] argsClassNames, Object... values)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		 
		Class clazz = Class.forName(className);
		Class[] classes = new Class[argsClassNames.length];
		for (int i = 0; i < classes.length; i++) {
			classes[i] = Class.forName(argsClassNames[i]);
		}
		Object obj = clazz.getConstructor(classes).newInstance(values);
		return obj;
	}

	public static Object createObject23(String className,  Object... values)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		Class clazz = Class.forName(className);
		Class[] classes = new Class[values.length];
		for (int i = 0; i < classes.length; i++) {
			classes[i] = values[i].getClass();
		}
		Object obj = clazz.getConstructor(classes).newInstance(values);
		return obj;
	}

}
