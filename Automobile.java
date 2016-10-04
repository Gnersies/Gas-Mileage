
public class Automobile {
	public int myBmw;
	public int mpg;
	public double gallons;
	
public Automobile(int i) {
	mpg = i;
	gallons = 0;
}
public void fillUp(double a) {
	gallons = gallons + a;
}
public void takeTrip(double b) {
	gallons = gallons - b/mpg;
}
public double reportFuel() {
	return gallons;
}
}