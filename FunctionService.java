package com.config;

//此处并未使用@Service来声明Bean
public class FunctionService {
public String sayHello(String word) {
	return "Hello" + " " + word + " !";
}
}
