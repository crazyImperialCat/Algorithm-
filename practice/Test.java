package practice;

import com.algs4.stdlib.StdOut;
import com.algs4.stdlib.StdRandom;

public class Test {
	public static void main(String[] args) {
		int a = 1000000;
		int SIDES = 6;
		Counter[] rolls = new Counter[SIDES+1];
		for(int i = 1; i <= SIDES; i++ ){
			rolls[i] = new Counter(i+"'s");
		}
		for(int j = 0; j < a; j++){
			int result = StdRandom.uniform(1, SIDES+1);
			rolls[result].increment();
		}
		for(int k = 1; k <=SIDES; k++ ){
			StdOut.println(rolls[k]);
		}
	}
}
