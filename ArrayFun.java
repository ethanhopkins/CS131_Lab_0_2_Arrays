/**
 * This program defines methods to be used with an array of square objects
 * @author Ethan Hopkins
 * @version 1.0
 * Programming Lab 0.2 Arrays
 * Spring Semester/Freshman Year
 */
//default constructor
public class ArrayFun {
	Square myArray[] = new Square[6]; //array to hold 6 square objects.
	
	int size = myArray.length; //integer to hold the length of myArray
	
	
	/**
	 * The preferred constructor creates and assigns a square object to 
	 * each index of the array.
	 * 
	 * @param size; uses the length of the array as a parameter.
	 */
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
	
	
	/**
	 * This method will print every element of myArray from left to right.
	 */
	public void forward() {
		for (int i = 0; i < 6; i++) {
			myArray[i].side = i;
			System.out.println(i + "). " + myArray[i].area());
		}
	}//end forward method
	
	
	/**
	 * This method will print every element of myArray from left to right.
	 */
	public void backward() {
		for (int i = 5; i >= 0; i--) {
			myArray[i].side = i;
			System.out.println(i + "). " + myArray[i].area());
		}
	}//end backward method
	
	
	/**
	 * This method will use an accumulator to add all of the area values
	 * of every square object within myArray and print the result.
	 */
	public void sum() {
		double sum = 0;
		for (int i = 0; i < 6; i++) {
			//Accumulator
			sum = sum + myArray[i].area();
		}
		System.out.println("Sum: " + sum);
	}//end sum method
	
	
	/**
	 * 
	 * @param index; the index of the value that is being changed.
	 * @param s; the new square value to be set.
	 */
		public void setArrayItem(int index, Square s) {
			myArray[index] = s;
		}//end setter
		
		
		/**
		 * 
		 * @param index; the specified index to return an item from.
		 * @return the element at the specified index.
		 */
		public Square getArrayItem(int index) {
			return myArray[index];
		}//end getter
	
}//end class
