/**
 * 
 */
package PerScholas.src.week5assignment.shapes;

/**
 * @author Habboubi
 *
 */
public class Circle extends Shape{

	public Circle() {}
	
	public Circle(double diameter,double radius,double area) {
		this.setArea(area);
		this.setRadius(radius);
		this.setDiameter(diameter);
		
	}

	
	public static double radiusCircle(double diameter) {
		
		double radius;
		 
		radius = diameter/2;
		return radius;
	}
	public static double areaCircle(double radius) {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}

			
}
