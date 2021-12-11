
// a class "Rectangle" that extends the Shape class 

public class Rectangle extends Shape {
	
	// attributes width and length
	double width;
	double length;

	
//	parameterized constructor needed initialize the data
	
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
	
// 	"toString" method that prints out the area and parameter
    public String toString() {
		return  "Rectangle Parameter: " + area() + " Rectangle Area: " + parameter();
    	
    }
    
    
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * length;
	}

	@Override
	public double parameter() {
		// TODO Auto-generated method stub
		return 2 * (length + width);
	}
	
}
