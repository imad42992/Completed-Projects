/**
 * 
 */
package PerScholas.src.week5assignment.shapes;

/**
 * @author Habboubi
 *
 */
public class Sphere extends Shape{
		
public Sphere() {}
	
	public Sphere(double diameter,double radius,double area,double volume) {
		this.setArea(area);
		this.setRadius(radius);
		this.setDiameter(diameter);
		this.setVolume(volume);
		
	}

	
	public static double radiusSphere(double diameter) {
		
		double radius;
		 
		radius = diameter/2;
		return radius;
	}
	public static double surfaceAreaSphere(double radius) {
		double surfacearea = 4*Math.PI*Math.pow(radius, 2);
		return surfacearea;
	}
	public static double volumeSphere(double radius) {
		double volume = (4/3)*Math.PI*Math.pow(radius,3);
		return volume;
	}
}
