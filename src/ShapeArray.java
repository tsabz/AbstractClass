

// driver class
public class ShapeArray {

	public static void main(String[] args) {
		// Shape - Rectangle
		System.out.println("program started");
      
		
		// Initiating shapeArray
		Shape shapeArray[] = new Shape[3];
		
		shapeArray[0] = new Circle(3); 
		shapeArray[1] = new Rectangle(5,7);
		shapeArray[2] = new Triangle(24, 30, 18);
		
		for(int i = 0; i < shapeArray.length; i++) {
			System.out.println(shapeArray[i].toString());
		}
		
		
	}

}

//https://www.youtube.com/watch?v=pKH_KLQuof4
//https://www.mathopenref.com/heronsformula.html
//https://www.youtube.com/watch?v=1hUUsuDfmSw
