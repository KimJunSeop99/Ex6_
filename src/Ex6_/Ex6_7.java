package Ex6_;

public class Ex6_7 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("1 main() : x = " + d.x);
		
		change(d);
		System.out.println("3 After change(d)");
		System.out.println("4 main() : x = " + d.x);
		
		
	}
	static void change(Data2 d) {
		d.x = 1000;
		System.out.println("2 change() : x = " + d.x);
	}
}
class Data2 { int x; }