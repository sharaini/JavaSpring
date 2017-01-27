package org.sharath;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Triangle triangle=new Triangle();
		//BeanFactory fac=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		/*
		 * app contxt beanfac big brother no much diff
		 * under src means classpath 
		 */
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//ApplicationContext context2=new ClassPathXmlApplicationContext("spring2coll2.xml");
		/**
		 * if youre writing desktop you have to register hookk to close the application context 
		 *bean life cycle shutdown using 
		 *
		 *Bean post processsors are classes that tells the spring that it has to do something after initializing
		 *if you want a bean to execute something after initialization preprocessors are a way
		 *post processor runs after initialization of all the beans it has a seperate class
		 *config rel codin
		 *
		 *Beanfactory post processor extension point if bean factory is itself used you can use bean factory post processor
		 *
		 *bean fac rep wit appl contxt with adit sup like messaging and internalisation
		 *file with key and value pairs in prop and ref to them for messaging
		 *you need to have a message source bean
		 */
		//ApplicationContext context3=new ClassPathXmlApplicationContext("beanlisinher.xml");
		/*AbstractApplicationContext context3=new ClassPathXmlApplicationContext("ForInt.xml");
		context3.registerShutdownHook();
		//Triangl triangle=(Triangl)context3.getBean("triangle1");
		Shape sh=(Shape) context3.getBean("circle1");
		sh.draw();
		Shape sh2=(Shape) context3.getBean("triangle1");
		sh2.draw();*/
		/*AbstractApplicationContext context3=new ClassPathXmlApplicationContext("ForInt4.xml");
		context3.registerShutdownHook();
		//Triangl triangle=(Triangl)context3.getBean("triangle1");
		//when you use components its going to take first letter of class as lower case
		Shape sh=(Shape) context3.getBean("annCircle4");
		sh.draw();*/
		AbstractApplicationContext con3=new ClassPathXmlApplicationContext("MessageSourceBean.xml");
		Shape shh=(Shape) con3.getBean("circle1");
		shh.draw();
		//name of the property,string  of objects if in case it takes arguments ,default message if it doesnot find the message youre looking for
		//System.out.println(con3.getMessage("greeting",null,"Default Greeting",null));
		//Shape sh2=(Shape) context3.getBean("triangle1");
		//sh2.draw();
		//triangle.draw();
		/**
		 * event handling 3 core 
		 * event publisher which publishes the event
		 * event listener which listens to event
		 * event is an object too
		 * if you want to publish your own event you have to create your own event class
		 *  
		 * 
		 */
	}

}
