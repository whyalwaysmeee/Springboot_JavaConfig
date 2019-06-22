package com.config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(JavaConfig.class);//使用ACAC作为Spring的容器，接受输入一个配置类作为参数
	
	UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);//获得声明配置的UseFunctionService的Bean
	
	System.out.println(useFunctionService.SayHello("ctgod"));
	
	context.close();
}
}
