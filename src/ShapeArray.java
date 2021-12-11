import java.util.Scanner;

public class ShapeArray {

	public static void main(String[] args) {
		// Shape - Rectangle
        
		// take user input for width and length
        System.out.println("Please Enter width & length: ");
        Scanner userInput = new Scanner(System.in);
        
        double width = userInput.nextDouble();
        double length = userInput.nextDouble();
        
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.parameter() + "\n");


	}

}
