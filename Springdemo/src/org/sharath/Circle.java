package org.sharath;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{
	private Point center;
	public Point getCenter() {
		return center;
	}
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Center is "+center.getX()+","+center.getY());
	}
	
}
