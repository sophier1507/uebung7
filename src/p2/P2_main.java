package p2;

import java.util.Arrays;

public class P2_main {

	public static void main(String[] args) {
		int[] a = {0,1,2,43};
		int[] b = {6, 7, 23, 7};
		int[] c = {14, 2, 0, 0, 19, 19};
		
		LetterGame l = new LetterGame();
		l.setWord(a);
		System.out.println(l.word);
		l.setWord(b);
		System.out.println(l.word);
		l.setWord(c);
		System.out.println(l.word);
		l.findCode("UNI");
		System.out.println(Arrays.toString(l.a));
	}

}
