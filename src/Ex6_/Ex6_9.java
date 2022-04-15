package Ex6_;

class MyMath2 {
	long a, b;
	long add() {return a + b;}
	long subtract() {return a - b;}
	long multiply() {return a * b;}
	double divide() {return a / b;}
	static long add(long a, long b) {return a + b;}
	static long subtract(long a, long b) {return a - b;}
	static long multiply(long a, long b) {return a * b;}
	static double divide(long a, long b) {return a / (double) b;}
}

public class Ex6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1 : " +MyMath2.add(0, 100L));	
		System.out.println("2 : " +MyMath2.subtract(200L, 100L));
		System.out.println("3 : " +MyMath2.multiply(200L, 100L));
		System.out.println("4 : " +MyMath2.divide(200L, 100L));

		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;

		System.out.println("5 : " +mm.add());
		System.out.println("6 : " +mm.subtract());
		System.out.println("7 : " +mm.multiply());
		System.out.println("8 : " +mm.divide());

	}

}
