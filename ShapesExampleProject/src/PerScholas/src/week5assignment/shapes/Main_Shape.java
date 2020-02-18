/**
 * 
 */
package PerScholas.src.week5assignment.shapes;

import java.util.ArrayList;



import java.util.Scanner;



/**
 * @author Habboubi
 *
 */
public class Main_Shape {
	static Scanner input = new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Object> circleData = new ArrayList<Object>();
		ArrayList<Object> sphereData = new ArrayList<Object>();
		ArrayList<Object> cylinderData = new ArrayList<Object>();
		int userInput;
		do {
		 userInput=0;	
		 System.out.println("------------------");
		System.out.printf("Select Shape:\n1.Circle\n2.Sphere\n3.Cylinder\n4.Exit\n");
		userInput = input.nextInt();
		double var =0;
		double var2 =0;
		switch(userInput) {
		case 1:
			System.out.println("------------------");
			System.out.println("Enter diameter of circle");
			
			var = input.nextDouble();
			Circle myCircle = new Circle(var,Circle.radiusCircle(var),
					Circle.areaCircle(Circle.radiusCircle(var)));
			circleData.add(myCircle);
			System.out.println("Radius: "+myCircle.getRadius());
			System.out.println("Area: "+myCircle.getArea());
			System.out.println("Diameter: "+ myCircle.getDiameter());
			var =0;
		
			break;
		case 2:
			System.out.println("------------------");
			System.out.println("Enter diameter of Sphere");
			var = input.nextDouble();
			Sphere mySphere = new Sphere(var,Sphere.radiusSphere(var),
					Sphere.surfaceAreaSphere(Sphere.radiusSphere(var)),
					Sphere.volumeSphere(Sphere.radiusSphere(var)));
			sphereData.add(mySphere);
			System.out.println("Radius: "+mySphere.getRadius());
			System.out.println("Surface Area: "+mySphere.getArea());
			System.out.println("Diameter: "+ mySphere.getDiameter());
			System.out.println("Volume: "+ mySphere.getVolume());
			
			var=0;
			break;
		case 3:
			System.out.println("------------------");
			System.out.println("Enter raduis of Sphere");
			var = input.nextDouble();
			System.out.println("Enter height of Sphere");
			var2 = input.nextDouble();
			Cylinder myCylinder = new Cylinder(var,
					var2,Cylinder.baseAreaCylinder(var),
					Cylinder.volumeCylinder(var, var2),
					Cylinder.diameterCylinder(Cylinder.volumeCylinder(var, var2), var2,var));
			cylinderData.add(myCylinder);
			System.out.println("Radius: "+myCylinder.getRadius());
			System.out.println("Base Area: "+myCylinder.getArea());
			System.out.println("Diameter: "+ myCylinder.getDiameter());
			System.out.println("Volume: "+ myCylinder.getVolume());
			System.out.println("Height: "+ myCylinder.getHeight());
			var=0;
			var2=0;
			break;
		case 4:
			System.out.println("End!");
			break;
		
		}
		
		}while(userInput!=4);
		
		
		
	}

}
