package Ex6_;

class Data_1 {
	int value;
	// 개발자가 생성자를 하나도 만들지 않을 경우 : 자바가 자동 생성해줌
}
class Data_2 {
	int value;
	String singer;
	
	
	// 매개 변수 없는 생성자(기본생성자) 하나를 반드시 만들어야함
	// 목적 : 인스턴스 변수 초기화
	Data_2() {
		singer = "ABBA";
	}
	// 개발자 정의 : 매개변수 1개짜리 생성자
	// 그 전에 매개변수 없는 기본 생성자를 반드시 만들어야함
	Data_2(int x) {
		value = x;
		
	}
}


public class Ex6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();
		
	}

}
