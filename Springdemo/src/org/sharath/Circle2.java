package org.sharath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle2 implements Shape{
	
	private Point center;
	public Point getCenter() {
		return center;
	}
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Center is "+center.getX()+","+center.getY());
	}
	
}
