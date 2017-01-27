package org.sharath;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


public class Circle3 implements Shape{
	
	private Point center;
	public Point getCenter() {
		return center;
	}
	//JSR 250 annotation standard annotations to apply
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Center is "+center.getX()+","+center.getY());
	}
	@PostConstruct
	public void initialize(){
		System.out.println("Circle");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("DestroyCircle");
	}
}
