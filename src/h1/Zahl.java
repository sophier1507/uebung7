package h1;

public class Zahl {
	boolean even = false; 
	boolean small = false;
	boolean positive = false;
	int num = 0;
	
	public Zahl(boolean e, boolean s, boolean p, int n) {
		even = e;
		small = s;
		positive = p;
		num = n;
	}
	
	public void setEven() {
		even = (num % 2 == 0);
	}
	
	public void setSmall() {
		small = (num < 100);
	}
	public void setPositive() {
		positive = (num > 0);
	}
}
