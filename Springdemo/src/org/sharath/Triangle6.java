package org.sharath;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle6 implements InitializingBean,DisposableBean{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public void draw(){
		System.out.println("Point A="+getPointA().getX()+","+getPointA().getY());
		System.out.println("Point A="+getPointB().getX()+","+getPointB().getY());
		System.out.println("Point A="+getPointC().getX()+","+getPointC().getY());
	}
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initializing beans init method called for triangle");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Disposable bean destroy bean has been called");
	}
}
