/**
 * 
 */
package PerScholas.src.week5assignment.shapes;

/**
 * @author Habboubi
 *
 */
public class Cylinder extends Shape{

public Cylinder() {}
	
	public Cylinder(double radius,double height,double area,double volume,double diameter) {
		this.setArea(area);
		this.setRadius(radius);
		this.setDiameter(diameter);
		this.setVolume(volume);
		this.setHeight(height);
		
	}

	
//	public static double radiusCylinder(double diameter) {
//		
//
//		return radius;
//	}
	public static double baseAreaCylinder(double radius) {
		double basearea = Math.PI*Math.pow(radius, 2);
		return basearea;
	}
	public static double volumeCylinder(double radius, double height) {
		double volume = Math.PI*Math.pow(radius,2)*height;
		return volume;
	}
	public static double diameterCylinder(double volume, double height,double radius) {
		double diameter =2*Math.sqrt((Math.PI*Math.pow(radius,2)*height)/(Math.PI*height)) ;
		return diameter;
	}
	
}
