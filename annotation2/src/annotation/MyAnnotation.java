package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义注解 Test <br>
 * 为方便测试：注解目标为类 方法，属性及构造方法<br> 
 * 注解中含有三个元素 id ,name和 gid;  <br>
 * id 元素 有默认值 0 <br>
 */ 
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String name() ;
    int id() default 0;
    Class<Long> gid();
}