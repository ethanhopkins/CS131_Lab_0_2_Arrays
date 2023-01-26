/**
 * The program will calculate the area of a circle
 * @author Ethan Hopkins
 * @version 1.0
 * Homework 1
 * Spring Semester/Freshman Year
 */
//preferred constructor
public class Circle {
	double radius = 1;
	
	
	//getter
	public double getRadius(double radius) {
		return radius;
	}
	
	//setter
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	
	//area method
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	//default constructor
	public Circle() {
		double radius = 0;
	}
}
