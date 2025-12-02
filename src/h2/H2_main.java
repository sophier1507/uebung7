package h2;

import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {
		/*int[] a = {2, 7, 1, 9};
		int[] b = {5, 6, 7};
		System.out.println(Arrays.toString(change(a, b, 2, 4)));
		System.out.println(Arrays.toString(change(a, a, 2, 4)));
		System.out.println(Arrays.toString(change(a, a, 3, 2)));*/

	}

	static public int[] change(int[] a, int[] b, int start, int end) {
		if (end > start) {
			if (Arrays.compare(a, b) != 0) {
					int[] result = Arrays.copyOfRange(a, 0, a.length);
					return result;
				} else {
					Arrays.sort(a);
					int[] result = Arrays.copyOfRange(a, start, end);
					return result;
				}
			} else {
				int[] result = {};
				return result;
			}	
	}
}
