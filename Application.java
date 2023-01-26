/**
 * The program acts as the main method for each of the classes
 * @author Ethan Hopkins
 * @version 1.0
 * Programming Lab 0.2 Arrays
 * Spring Semester/Freshman Year
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Square class main
		Square sq1 = new Square();
		System.out.println("Square area: " + sq1.area());
		
		//Circle class main
		Circle c1 = new Circle();
		System.out.println("Circle area: " + c1.area());
		
		//ArrayFun class main
		ArrayFun fun = new ArrayFun(6);
		fun.forward();
		System.out.println("\n");
		fun.backward();
		System.out.println("\n");
	}

}
