
// a class "Rectangle" that extends the Shape class 

public class Rectangle extends Shape {
	
	// attributes width and length
	double width;
	double length;
	double rectangle_parameter;
	double reactangle_area;
	
//	parameterized constructor needed initialize the data
	
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
	
// 	"toString" method that prints out the area and parameter
    public String toString() {
		return  "Parameter: " + rectangle_parameter + " Area: " + reactangle_area;
    	
    }
    
    
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return reactangle_area = width * length;
	}

	@Override
	public double parameter() {
		// TODO Auto-generated method stub
		return  rectangle_parameter = 2 * (length + width);
	}
	
}
