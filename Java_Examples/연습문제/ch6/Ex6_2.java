package ch6;

public class Ex6_2 {
	public static void main(String[] args) {
		//�ν��Ͻ� ���� ����
		//Ŭ�����̸� �ν��Ͻ������̸� = new Ŭ����������ȣ��(������ ��);
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}//main()
}//Main

//���θ޼ҵ�� ���� Ŭ������ �׻� ǥ���صα�!, ��԰��ִٰ� static������ �Ǽ��ϸ� �������� �ȵ��ư�
//����Ŭ����(���� �޼ҵ尡 �ִ� �޼ҵ�)�� �� ������Ʈ �� �Ϲ������� �Ѱ�!!!
//�� �ܴ� ���� ����Ŭ����

class SutdaCard {
	//private�� �������� �� Ŭ������ �����ϰ�� �� ��𿡼��� �޼ҵ带 ������ �ʰ��� ���� �Ұ�
	//ex) SutdaCard.num = 10; => error
	private int num;
	private boolean isKwang;

	//�����ڸ� ���� �ϳ� ������ٸ�, �⺻�����ڴ� ���� �������� ��
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}//������

	//�⺻������
	public SutdaCard() {
		num = 1;
		isKwang = true;
	}//������
	
	
	//String�� ��ȯ������ ����
	//�ش� ī���� ������ ��ȯ
	public String info() {
		if(isKwang) {
			return num+"K";
		}else {
			return ""+num;	//�׳� num�� ������, ���ڷ� �ν��ؼ� int�� ��ȯ�� �ƴ϶�� �����Ѹ�
		}
	}
}//SutdaCard
