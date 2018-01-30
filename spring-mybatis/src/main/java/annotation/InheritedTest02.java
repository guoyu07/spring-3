package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @describe:
 * @author:yang.bo@pelerin.cn
 * @date:2018年1月30日上午9:01:22
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface InheritedTest02 {

	String value() default "test02";
}
