/**
 * 
 */
package PerScholas.src.week5assignment.shapes;

/**
 * @author Habboubi
 *
 */
public class Shape {

	private double area;
	private double radius;
	private double volume;
	private double height;
	private double diameter;
	
	public Shape() {}
	public Shape(double area,double radius,double volume,double height,double diameter) {
		this.area=area;
		this.radius=radius;
		this.volume=volume;
		this.height=height;
		this.diameter=diameter;
	}
	
	public void print(double first) {
		
		System.out.printf("Answer:%f.3 ",first);
	}
	
	public void print(double first,double second) {
		System.out.printf("Answer: %f.3  :  %f.3",first,second);
		
	}
	
	public void print(double first,double second,double third) {
		System.out.printf("Answer:  %f.3  :  %f.3  :  %f.3",first,second,third);
		
	}
	

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * @return the volume
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(double volume) {
		this.volume = volume;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the diameter
	 */
	public double getDiameter() {
		return diameter;
	}

	/**
	 * @param diameter the diameter to set
	 */
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	
	
	
}
