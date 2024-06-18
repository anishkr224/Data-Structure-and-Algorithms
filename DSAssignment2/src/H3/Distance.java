package H3;

public class Distance {
int meter;
int centimeter;

Distance(int meter,int centimeter){
	this.meter=meter;
	this.centimeter=centimeter;
}
void display() {
	System.out.println("meter="+meter+" centimeter="+centimeter);
}
Distance sum(Distance d1,Distance d2) {
	int temp=0;
	int tot_cm=d1.centimeter+d2.centimeter;
	while(tot_cm>=100) {
		tot_cm=tot_cm-100;
		temp++;
	}
	int tot_m=d1.meter+d2.meter+temp;
	 return new Distance(tot_m,tot_cm);
}
}
