/*Wap to print circumference of circle, perimeter of square, volume of a cube, 
total surface area of cylinder, and simple interest using method.*/
class Methods
{
public static void Circum(double rad)
{
Double cir=2*3.142*rad;
System.out.println("circumeferance of a circle is "+cir);
return;
}
public static void Square(double side)
{
double perimeter=4*side;
System.out.println("perimeter of a square " + perimeter);
return;
}
public static void Cylinder(double rad, double h)
{
double area=2*3.142*rad *(rad+h);
System.out.println("Total surface area of a cylinder is "+area);
return;
}
public static void Cube(double side)
{
double volume=side*side*side;
System.out.println("Volume of a cube is = " +volume);
return;
}
public static void SimpleInterest(double p, double r, double t)
{
double si=(p*r*t)/100;
System.out.println("Simple Interest is " + si);
return;
}
public static void main(String[] args)
{
Circum(5);
Square(5);
Cylinder(5,7);
Cube(5);
SimpleInterest(1000, 2, 2);
}
}