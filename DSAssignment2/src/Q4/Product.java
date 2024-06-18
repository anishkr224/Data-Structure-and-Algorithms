package Q4;

public class Product {
private int pid;
private double price;
static double tot_price; 

Product(int pid, double price){
	this.pid=pid;
	this.price=price;
	this.tot_price+=price;
}

void display() {
	System.out.println("Product id :"+this.pid);
	System.out.println("Price :"+this.price);
}
public static double getPrice() {
    return tot_price;
}
}

