package H1;

public class Commission {
double sales;
Commission(double sales){
	this.sales=sales;
}
public static double getCommission(double sales) {
	double commission=0;
	if(sales<0) {
		return 0;
	} else if(sales<100) {
		commission=(sales*2)/100;
	} else if(sales>=500 && sales<5000) {
		commission=(sales*5)/100;
	} else if(sales>=5000) {
		commission=(sales*8)/100;
	}
	return commission;
}
}
