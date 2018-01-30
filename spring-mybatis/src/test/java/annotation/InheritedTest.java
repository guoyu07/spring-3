package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * @describe:
 * @author:yang.bo@pelerin.cn
 * @date:2018年1月30日上午9:07:46
 */
public class InheritedTest {

	@Test
	public void test_inherited() throws Exception {

		Class<Child> clazz = Child.class;
		test_class(clazz);
		test_method(clazz);
		test_field(clazz);
	}

	private void test_class(Class<?> clazz) throws Exception {

		System.out.println("---class test---");
		print(clazz.getAnnotations());

		if (clazz.isAnnotationPresent(InheritedTest01.class)) {
			System.out.println(clazz.getAnnotation(InheritedTest01.class));
		}

		if (clazz.isAnnotationPresent(InheritedTest02.class)) {
			System.out.println(clazz.getAnnotation(InheritedTest02.class));
		}
		System.out.println("-------------------------");

	}

	private void test_method(Class<?> clazz) throws Exception {

		System.out.println("---test method---");
		Method[] methods = clazz.getMethods();
		if (methods != null && methods.length > 0) {
			for (Method method : methods) {
				System.out.println("--- " + method.getName() + " start ---");
				print(method.getAnnotations());
				System.out.println("--- " + method.getName() + " end ---");
			}
		}
		System.out.println("-------------------------");

	}

	private void test_field(Class<?> clazz) throws Exception {

		System.out.println("---test field---");
		Field[] fields = clazz.getFields();
		if (fields != null && fields.length > 0) {
			for (Field field : fields) {
				System.out.println("--- " + field.getName() + " start ---");
				print(field.getAnnotations());
				System.out.println("--- " + field.getName() + " end ---");
			}
		}
		System.out.println("-------------------------");

	}

	private void print(Annotation[] annotations) throws Exception {

		if (annotations != null && annotations.length > 0) {
			for (Annotation annotation : annotations) {
				System.out.println(annotation.toString());
			}
		}

	}
}
