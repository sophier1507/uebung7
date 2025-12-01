package h1;

public class Zahl {
	boolean even; //ka 
	boolean small;
	boolean positive;
	int num;
	
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
