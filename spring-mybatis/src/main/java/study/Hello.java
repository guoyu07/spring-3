package study;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @describe:
 * @author:yang.bo@pelerin.cn
 * @date:2018年1月22日下午6:40:05
 */
@Target({ TYPE })
@Retention(RUNTIME)
public @interface Hello {

	String name() default "";
}
