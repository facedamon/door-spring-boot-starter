package org.facedamon.door.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author facedamon
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface DoDoor {

    //获取入参类属性中某个值
    String key() default "";

    //拦截返回json内容
    String returnJson() default "";
}
