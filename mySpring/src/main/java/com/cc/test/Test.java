package com.cc.test;

import com.cc.test.beanFactoryProcessor.MyBeanFactoryProcessor;
import com.cc.test.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

/**
 * 测试类
 *
 * @author hyl
 * @date 02/21/2020
 */
public class Test {

	public static void main(String[] args) {

		test_2();
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.register(MyService.class);
//		context.refresh();
//		MyService service = context.getBean(MyService.class);
//		System.out.println(service);

//		context.register(SpringConfig.class);
//		context.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());
//		context.refresh();
	}

	public static void test(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
	}

	public static void test_2(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		MyService service = context.getBean(MyService.class);
		System.out.println(service);
	}

}
