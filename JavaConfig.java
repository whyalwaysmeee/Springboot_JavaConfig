package com.config;
import org.springframework.context.annotation.*;

@Configuration //表明配置类。此处未使用ComponentScan，因为下面会定义要使用的所有Bean
public class JavaConfig {
@Bean //声明返回值是一个Bean，名称是方法名。
public FunctionService functionService() {
	return new FunctionService();
}

@Bean   
public UseFunctionService useFunctionService() {
	UseFunctionService useFunctionService = new UseFunctionService();
	useFunctionService.setFunctionService(functionService());      //直接调用FunctionService()
	return useFunctionService;
}
@Bean
public UseFunctionService useFunctionService(FunctionService functionService) {  /*另一种注入方式，直接将FunctionService作为参数给
	useFunctionService().Spring容器中只要存在某个Bean，就可以在另一个Bean的声明方法的参数中写入*/
	UseFunctionService useFunctionService = new UseFunctionService();
	useFunctionService.setFunctionService(functionService);
	return useFunctionService;

}
}
