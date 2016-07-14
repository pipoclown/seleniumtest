package course.javafortesters.calculator;

public class Calculator {
	public int add(int x, int y) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return x + y;
	}

	public int subtract(int x, int y) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return x - y;
	}

	public int multiply(int x, int y) {
		return x * y;
	}

	public int divide(int x, int y) {
		return x / y;
	}
}