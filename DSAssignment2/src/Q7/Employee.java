package Q7;

class Employee extends Person {
int Eid;
double salary;
Employee(String name, int age, int Eid,double salary) {
	super(name,age);
	this.Eid=Eid;
	this.salary=salary;
}
void empDisplay() {
	System.out.println("Name="+name+" Age="+age+" Eid="+Eid+" Salary="+salary);
}
}
