package org.sharath;

public class Triangle {
	private String type;
	private int height;
	public int getHeight(){
		return height;
	}
	public Triangle(String type){
		this.type=type;
	}
	public Triangle(int height){
		this.height=height;
	}
	public Triangle(String type,int height){
		this.type=type;
		this.height=height;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void draw(){
		System.out.println(getType()+getHeight()+"Triangle draawn");
	}
	/*whatever the value object is dependent on (type) is injected using spring framework in the same way you can inject an object
	*property tag in spring is using the setter injection
	*other way is using constructor injection
	*using constructor-arg tag
	*/
}
