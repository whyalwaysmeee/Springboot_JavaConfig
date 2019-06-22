package com.config;
import com.config.FunctionService;

//此处并未使用@Service注解来声明Bean
public class UseFunctionService {
//此处并未使用@AutoWired注解来注入Bean
FunctionService functionService;
public void setFunctionService(FunctionService functionService) {
	this.functionService = functionService;
}

public String SayHello(String word) {
	return functionService.sayHello(word);
}
}
