package annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @describe:
 * @author:yang.bo@pelerin.cn
 * @date:2018年1月30日上午9:01:22
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface InheritedTest01 {

	String value() default "test01";
}
