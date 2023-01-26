/**
 * The program will calculate the area of a square
 * @author Ethan Hopkins
 * @version 1.0
 * Homework 1
 * Spring Semester/Freshman Year
 */

public class Square {

	double side;//side will be used to determine the area of each square.
	
	/**
	 * The default constructor will initialize size to a value of 0.
	 */
	public Square() {
	side = 0;	
	}//end default constructor
	
	
	/** 
	 * @param side; the value of side will be 5 if any value is specified.
	 */
	public Square(double side) {
		side = 5;
	}//end preferred constructor
	
	
	/**
	 * This method will multiply the side variable to a power of 2 to 
	 * find the area.
	 * 
	 * @return the area value
	 */
	public double area() {
		return Math.pow(side, 2);
	}//end area method
	
	
	/**
	 * @return the value of side.
	 */
	public double getSide() {
		return side;
	}//end getter
	
	
	/**
	 * 
	 * @param newSide; the value of side to be set.
	 */
	public void setSide(double newSide) {
		side = newSide;
	}//end setter
	
}//end class
