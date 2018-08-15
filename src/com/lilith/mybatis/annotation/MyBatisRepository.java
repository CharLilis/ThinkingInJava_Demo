package com.lilith.mybatis.annotation;

import org.springframework.stereotype.Repository;

@Repository
public @interface MyBatisRepository {
	String value() default "";
}
