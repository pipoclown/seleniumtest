package course.javafortesters.calculator;

public class ArrayCalculator {
	int sum(int[]  a) {
		int s =  0;
		for (int i = 0; i <a.length ; i++) {
			s += a[i];
		}
		return s;
	}
	
	int min(int[]  a) {
		int m =  Integer.MAX_VALUE;
		for (int i = 0; i <a.length ; i++) {
			if (a[i] < m ) {
				m = a[i];
			}
		}
		return m;
	}
	int max(int[]  a) {
		int m =  Integer.MIN_VALUE;
		for (int i = 0; i <a.length ; i++) {
			if (a[i] > m ) {
				m = a[i];
			}
		}
		return m;
	}
}