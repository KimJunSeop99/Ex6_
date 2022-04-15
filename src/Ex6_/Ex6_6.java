package Ex6_;

public class Ex6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;
		System.out.println("1 main() : x = " + d.x);

		change(d.x);
		
		System.out.println("3 After change(d.x)");
		System.out.println("4 main() : x = " + d.x);

	}

	static void change(int x) {
		x = 1000;
		System.out.println("2 change() : x = " + x);
	}
}

class Data {
	int x;
}
