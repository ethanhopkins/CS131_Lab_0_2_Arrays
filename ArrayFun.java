/**
 * This program defines methods to be used with an array of square objects
 * @author Ethan Hopkins
 * @version 1.0
 * Programming Lab 0.2 Arrays
 * Spring Semester/Freshman Year
 */
//default constructor
public class ArrayFun {
	Square myArray[] = new Square[6];
	
	//setter
	public void setArrayItem(int index, Square s) {
		myArray[index] = s;
	}//end setter
	
	//getter
	public Square getArrayItem(int index) {
		return myArray[index];
	}//end getter
	
	
	//preferred constructor
	int size = myArray.length;
	
	public ArrayFun(int size) {
			Square sq1 = new Square();
			myArray[0] = sq1;
			
			Square sq2 = new Square();
			myArray[1] = sq2;
			
			Square sq3 = new Square();
			myArray[2] = sq3;

			Square sq4 = new Square();
			myArray[3] = sq4;
			
			Square sq5 = new Square();
			myArray[4] = sq5;
			
			Square sq6 = new Square();
			myArray[5] = sq6;
	}//end preferred constructor
	
	
	//forward method
	public void forward() {
		for (int i = 0; i < 6; i++) {
			myArray[i].side = i;
			System.out.println(i + "). " + myArray[i].area());
		}
	}//end forward method
	
	//backward method
	public void backward() {
		for (int i = 5; i >= 0; i--) {
			myArray[i].side = i;
			System.out.println(i + "). " + myArray[i].area());
		}
	}//end backward method
	
	//sum method
	public void sum() {
		for (int i = 0; i < 7; i++) {
			myArray[i].area();
		}
	}//end sum method
}
