package cn.kisor.rpc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 *
 * @author 孙浩
 * @email sunhao5@jd.com
 * @description
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Component
// 表明可被 Spring 扫描
public @interface Consumer {
	Class<?> value();
}
