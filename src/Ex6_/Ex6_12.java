package Ex6_;

class Car {
	String color;
	String gearType;
	int door;

	Car() {}
	
	Car(String cc, String gg, int dd) {
		color = cc;
		gearType = gg;
		door = dd;
	}
	
}


public class Ex6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나쁜 코딩
		Car c1= new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		// 좋은 코딩
		// 매개변수 3개짜리 생성자 호출 : 변수초기화
		Car c2 = new Car("green" , "auto" , 6);
		
		System.out.println("c1의 color = "  + c1.color + ", gearType = " + c1.gearType + ", door = " + c1.door);
		System.out.println("c2의 color = "  + c2.color + ", gearType = " + c2.gearType + ", door = " + c2.door);
		
	}

}
