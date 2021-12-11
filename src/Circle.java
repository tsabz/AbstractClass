
// circle extends Shape

public class Circle extends Shape {
	
	// radius attributes 
	double radius = 3;
	double pi = Math.PI;
	double circle_parameter;
	double circle_area;
	
	// parameterized constructor needed initialize the data
	
   public Circle(double radius) {
        this.radius = radius;
    }
   
   //	"toString" method that prints out the area and parameter
   
   public String toString() {
		return  "Circle Parameter: " + area() + " Circle Area: " + parameter();
   	
   }
   
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi * Math.pow(radius, 2); 
	}

	@Override
	public double parameter() {
		// TODO Auto-generated method stub
		return 2 * pi * radius;
	}

}
