
public class Triangle extends Shape {
	// attributes 
	double length_side1;  
	double length_side2; 
	double length_side3; 
	double triangle_area;
	double triangle_parameter;
	
    public Triangle(double length_side1, double length_side2, double length_side3) {
        this.length_side1 = length_side1;
        this.length_side2 = length_side2;
        this.length_side3 = length_side3;
    }

	@Override
	public double area() {
//		https://www.mathopenref.com/heronsformula.html
		double p = (length_side1 + length_side2 + length_side3) / 2;
//		p	 (	p	−	a	) 	(	p	−	b	)	 (	p	−	c	)
		return triangle_area = Math.sqrt(p * (p - length_side1) * (p - length_side2) * (p - length_side3));
	}

	@Override
	public double parameter() {
//		https://www.mathopenref.com/heronsformula.html
		return (triangle_parameter = length_side1 + length_side2 + length_side3) / 2 ;
	}
	
// 	"toString" method that prints out the area and parameter
    public String toString() {
		return  "Parameter: " + triangle_parameter + " Area: " + triangle_area;
    	
    }
    

}
