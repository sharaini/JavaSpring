package org.sharath;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanPP implements BeanFactoryPostProcessor{
//when bean factory is initialized the following method is called 
	//application cotext is acting like bean factory + additional functionality which calls get bean
	//property place holder configurer is an out of box beanfactory postprocessor spring provides
	//mainly if you want to use the properties file for values
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("My bean factory post processor is called");
	}

}
