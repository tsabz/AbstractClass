import java.util.Scanner;

// driver class
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
        
        System.out.println("Please Enter 3 lengths for each side of a triangle: ");
        
        Scanner userInputTriangle = new Scanner(System.in);
        
    	double length_side1 = userInputTriangle.nextDouble();  
    	double length_side2 = userInputTriangle.nextDouble(); 
    	double length_side3 = userInputTriangle.nextDouble();
    	
    	Shape triangle = new Triangle(length_side1, length_side2, length_side3);
        
        System.out.println("Length Side 1: " + length_side1 + " length side 2: " + length_side2 + 
        		" length side 3: " + length_side3
                + "\narea: " + triangle.area()
                + "\nperimeter: " + triangle.parameter() + "\n");

	}

}
