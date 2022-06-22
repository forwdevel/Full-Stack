package ch6;

public class Ex6_2 {
	public static void main(String[] args) {
		//인스턴스 변수 선언
		//클래스이름 인스턴스변수이름 = new 클래스생성자호출(생성자 값);
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}//main()
}//Main

//메인메소드랑 메인 클래스는 항상 표기해두기!, 까먹고있다가 static같은거 실수하면 에러나서 안돌아감
//메인클래스(메인 메소드가 있는 메소드)는 한 프로젝트 당 일반적으로 한개!!!
//그 외는 전부 서브클래스

class SutdaCard {
	//private라 지금현재 이 클래스를 제외하고는 그 어디에서도 메소드를 통하지 않고서는 접근 불가
	//ex) SutdaCard.num = 10; => error
	private int num;
	private boolean isKwang;

	//생성자를 내가 하나 만들었다면, 기본생성자는 따로 만들어줘야 함
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}//생성자

	//기본생성자
	public SutdaCard() {
		num = 1;
		isKwang = true;
	}//생성자
	
	
	//String을 반환값으로 가짐
	//해당 카드의 정보를 반환
	public String info() {
		if(isKwang) {
			return num+"K";
		}else {
			return ""+num;	//그냥 num만 적으면, 숫자로 인식해서 int형 반환이 아니라고 에러뿌림
		}
	}
}//SutdaCard
