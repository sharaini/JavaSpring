package org.sharath;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/*same class with different beans and meta data using xml is advantage over annotations*/
/*
 * component scan  tag search for other annotation apart from @component called stereotypes when you write j2ee which perform certain
 * actions like to implement certain rules like @Service springs going to give additional info 
 * @repository tells spring that this is a data object
 * @controller spring knows this as a controller
 * it adds level of documentation ,it adds what role bean does in ent level application 
 * @author Sharath
 *
 */
//@Component	use this for making this as a component
public class AnnCircle4 implements Shape{
	
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
