package Q6;

abstract class Shape {
abstract double area();
}
class Square extends Shape{
	int a;
	void setSquare(int a) {
		this.a=a;
	}
	double area() {
		return a*a;
	}
}
class Triangle extends Shape{
	int a,b,c;
	void setTriangle(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	double area() {
		double s=(a+b+c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
class Circle extends Shape{
	int r;
	void setCircle(int r) {
		this.r=r;
	}
	double area() {
		return Math.PI*r*r;
	}
}