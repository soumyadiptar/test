package com.test.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessorFactory implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanname) throws BeansException {
		System.out.println("Inside beanpostprocessor befor init"+beanname);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanname) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Inside beanpostprocessor after init"+beanname);
		return bean;
	}

}
