package Q6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square ob1=new Square();
ob1.setSquare(5);
System.out.println("Area of Square= "+ob1.area());
Triangle ob2=new Triangle();
ob2.setTriangle(8,3,9);
System.out.println("Area of Triangle= "+ob2.area());
Circle ob3=new Circle();
ob3.setCircle(5);
System.out.println("Area of Circle= "+ob3.area());
	}

}
