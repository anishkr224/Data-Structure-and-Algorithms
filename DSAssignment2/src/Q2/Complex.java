package Q2;

public class Complex {
int real, imag;
void setData(int real, int imag) {
	this.real=real;
	this.imag=imag;
}
void display() {
	System.out.println(real+"+i"+imag);
}
public Complex add(Complex c1, Complex c2) {
	Complex c3=new Complex();
	c3.real=c1.real+c2.real;
	c3.imag=c1.imag+c2.imag;
	return c3;
	}

}
