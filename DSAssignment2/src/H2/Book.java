package H2;

public class Book {
String BName;
int BEdition;
double BPrice;
Book(String BName, int BEdition, double BPrice){
	this.BName=BName;
	this.BEdition=BEdition;
	this.BPrice=BPrice;
}
void display() {
	System.out.println("BName= "+BName+", BEdition= "+BEdition+", BPrice= "+BPrice);
}

}
