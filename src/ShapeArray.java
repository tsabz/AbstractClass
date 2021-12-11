import java.util.Scanner;

public class ShapeArray {

	public static void main(String[] args) {
		// Shape - Rectangle
        
		// take user input for width and length
        System.out.println("Please Enter width & length: ");
        Scanner userInputRec = new Scanner(System.in);
        
        // assign userInput to width and length
        
        double width = userInputRec.nextDouble();
        double length = userInputRec.nextDouble();
        
        //  Instantiate one rectangle
        Shape rectangle = new Rectangle(width, length);
        
        // print out stats for rectangle 
    
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\narea: " + rectangle.area()
                + "\nperimeter: " + rectangle.parameter() + "\n");
        
        System.out.println("*****************************************");
		// Shape - Circle
        
        System.out.println("Please Enter radius for circle: ");
        
        Scanner userInputCircle = new Scanner(System.in);
        
        double radius = userInputCircle.nextDouble();
        
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
                + "\narea: " + circle.area()
                + "\nperimeter: " + circle.parameter() + "\n");
        
        System.out.println("*****************************************");
        
	}

}
