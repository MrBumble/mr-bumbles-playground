public class Playground {

	public static void main(String args[]) {

		System.out.println(f(5));
	}

	static int f(int x) {
		if (x == 0)
			return 1;
		else
			return f(x - 1) + g(x - 1);
	}

	static int g(int x) {
		if (x == 0)
			return 1;
		else
			return g(x - 1) * f(x - 1);
	}
	
	

}
