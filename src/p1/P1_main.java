package p1;

public class P1_main {

	public static void main(String[] args) {
		multFrac(5,2,3,4);
		Bruch b1 = new Bruch(5,2);
		Bruch b2 = new Bruch(3,4);
		multFrac(b1,b2);
		b1.toString();
		b2.toString();
		System.out.println(b1);
		System.out.println(b1.toString());

	}

	public static void multFrac(int z1, int n1, int z2, int n2) {
		int z = z1 * z2;
		int n = n1 * n2;
		System.out.println(z + ":" + n);
	}
	
	public static void multFrac(Bruch a, Bruch b) {
		int z = a.z * b.z;
		int n = a.n * b.n;
		System.out.println(z + ":" + n); // oder ef multFrac(a.z, a.n, b.z, b.n);
	}
}
