package ch13.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class DynamicField {

	public static void main(String[] args) {
		Object obj = new StudentPublic("jack", 123);
		try {
			dynamicField(obj, "name", "tom");
			System.out.println(((StudentPublic) obj).name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static void dynamicField(Object obj, String fieldName, Object value) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		Field field = obj.getClass().getField(fieldName);
		field.set(obj, value);
	}
}
