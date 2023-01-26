/**
 * The program will calculate the area of a square
 * @author Ethan Hopkins
 * @version 1.0
 * Homework 1
 * Spring Semester/Freshman Year
 */
//preferred constructor
public class Square {

	double side = 2;
	
	//default constructor
	public Square() {
		double side = 0;
	}
	
	
	//getter
	public double getSide() {
		return side;
	}
	
	//setter
	public void setSide(double newSide) {
		side = newSide;
	}
	
	
	//area method
	public double area() {
		return Math.pow(side, 2);
	}
	
}
