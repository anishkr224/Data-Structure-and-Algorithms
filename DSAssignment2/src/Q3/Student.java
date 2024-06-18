package Q3;

public class Student {
int roll;
String name;
double DSA_Mark;
void getData(int roll, String name, double DSA_Mark) {
	this.roll=roll;
	this.name=name;
	this.DSA_Mark=DSA_Mark;
}
void showData() {
	System.out.println("Name="+name+" Roll="+roll+" DSA_Mark="+DSA_Mark);
}
}
