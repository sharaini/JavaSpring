package org.sharath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;

public class Circle4 implements Shape,ApplicationEventPublisherAware{
	
	private Point center;
	@Autowired
	private MessageSource messageSource;
	private ApplicationEventPublisher pub;
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(this.messageSource.getMessage("drawing.circle",null,"Default",null));
		System.out.println(this.messageSource.getMessage("drawing.point",new Object[]{center.getX(),center.getY()},"default",null));
		System.out.println(this.messageSource.getMessage("greeting",null,"Default Greeting",null));
		DrawEvent de=new DrawEvent(this);//creating a new event
		/* we have local var pub in order to get handle of this we have to implement applicationeventpublisheraware */
		//behind the scenes application context helps to provivde the publisher*/
		pub.publishEvent(de);
		
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher pub) {
		// TODO Auto-generated method stub
		//springs going to use this method to set the publisher
		this.pub=pub;
	}
	
}
