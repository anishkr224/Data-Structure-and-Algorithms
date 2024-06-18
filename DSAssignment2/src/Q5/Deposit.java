package Q5;

public class Deposit {
long Principal;
int Time;
double rate;
double Total_amt;

Deposit(){
	System.out.println("Deposit Default");
}
Deposit (long p,int t, double r){
	this(p,t);
	rate=r;
}
Deposit(long p, int t){
	Principal=p;
	Time=t;
}
Deposit(long p, double r){
	Principal=p;
	rate=r;
}
void display() {
	System.out.println("Principal= "+Principal+" Time= "+Time+" Rate="+rate);
	System.out.println("Total amount="+Total_amt);
}
void calc_amt(long p,int t, double r) {
	Total_amt = p+(p*r*t)/100;
}
}
