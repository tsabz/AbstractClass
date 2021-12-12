# AbstractClass

### UML Diagram

<img width="641" alt="Screen Shot 2021-12-11 at 7 02 41 PM" src="https://user-images.githubusercontent.com/36241267/145695439-55393e62-7715-43cf-bfbe-ba2890c88497.png">


Option #2:  Creating an Abstract Class Shape II
Create an abstract class "Shape" with the following specifications:

an abstract method "area()" of return type double
an abstract method "perimeter()" of return type double.
Put your code in a Java source file named "Shape.java."

I.

Create a class "Rectangle" that extends the Shape class with the following specifications:

Attributes:
width, length
Constructor:
Implement a parameterized constructor needed initialize the data.
toString:
Implement a "toString" method that prints out the area and perimeter.
Implement methods to compute the area and perimeter.

II.

Create a class "Circle" that extends the Shape class with the following specifications:

Attributes:
radius
Constructor:
Implement a parameterized constructor to initialize the data.
toString:
Implement a "toString" method that prints out the area and perimeter.
Implement methods to compute the area and perimeter.

III.

Create a class "Triangle" that extends the Shape class with the following specifications:

Attributes:
length of side1, length of side2, length of side3, each is a double
Constructor:
Implement a parameterized constructor to initialize the data.
toString:
Implement a "toString" method that prints out the area and perimeter.
Implement methods to compute the area and perimeter.

IV.

Create a driver class named "ShapeArray" with the following specifications:

Instantiate one triangle.
Instantiate one circle.
Instantiate one square.
Store the class instances into an array named "shapeArray."
Loop through the array and print out the instance data of each object
using the object instance's "toString" method.
