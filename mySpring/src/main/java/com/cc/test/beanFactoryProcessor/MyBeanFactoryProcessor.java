package com.cc.test.beanFactoryProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 插手Spring BeanFactory的初始化
 *
 * @author hyl
 * @date 02/26/2020
 */
@Component
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AnnotatedBeanDefinition beanDefinition = (AnnotatedBeanDefinition) beanFactory.getBeanDefinition("myService");
		System.out.println("MyBeanFactoryProcessor ...");
		beanDefinition.setScope("prototype");
	}
}
