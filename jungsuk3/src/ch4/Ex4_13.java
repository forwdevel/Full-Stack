package ch4;

public class Ex4_13 {
	public static void main(String[] args) {
		
		/*
		 * �ּ��� ���� Ǯ��� �ȵǸ� �Ʒ� �ڵ��� ���� ����
		 * �ȵǴ°� �鳯 �ٵ����� �ȴð� �ϱ⸸ �Ⱦ����ϱ� �Ʒ� �ڵ�����
		 * ���� �Ȱ��� �ٸ� ������ �Ѿ�� ���߿� �ٽ� Ǯ���
		 * 
		 * �ش� ���α׷��� ���߿� ��й�ȣ ���α׷������� ���� �� ���������Ƿ�,
		 * �����ϰ� �Ѿ�°� ����.
		 * 
		 * charAt(index)�� value.length��ŭ ������ �ϳ��ϳ� �� �˻��غ���,
		 * char���� ���ڸ�, isNumber�� true�� ��ȯ,
		 * char���� ������ �������� ���ٸ� isNumber�� false�� ��ȯ
		 * 
		 */
		
		
		
		String value = "123t5";
		char ch = ' ';
		boolean isNumber = true;

		for (int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);
			if ('1' <= ch && ch <= '9') {
				isNumber = true;
			} else {
				isNumber = false;
				break;//�����ָ� ������ charAt(5)�� ���ڶ� true��ȯ, �ϳ��� ���ڰ� �ƴѰ� ������ �ٷ� ���� ���������
			}
		}

		if (isNumber) {
			System.out.println(value + " are numbers");
		} else {
			System.out.println(value + " are not numbers");
		}
	}
}
