package org.sharath;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Disbeanposproces implements BeanPostProcessor{
	//you had to tell this to be registered as a bean processor
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		
		System.out.println("After Initialization bean name is"+beanName);
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In before initialization bean name is"+beanName);
		return bean;
	}

}
