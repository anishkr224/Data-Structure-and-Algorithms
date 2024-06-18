package Q1;

public class Phone {
int area_code;
int exchange;
int number;
void setPhone(int code, int exchange, int number) {
	  this.area_code=code;
	  this.exchange=exchange;
	  this.number=number;
}
void display(){
	  System.out.println("("+area_code+") "+exchange+"-"+number);
}
	

}
