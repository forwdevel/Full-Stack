package ch3;

public class Ex3_9 {
	public static void main(String[] args) {
		//ch�� ��,�ҹ��� �� ������ ��쿡�� true
		
		char ch = '8';
		
		//�����ڵ��
		//65-90 : �빮��, 97-122 : �ҹ���, 48-57 : ����
		boolean b = (65 <= ch && ch <= 90) ? true
				: ((97 <= ch && ch <= 122) ? true : ((48 <= ch && ch <= 57) ? true : false));
		
		/* �����ڵ��� 10�������� �ƴ� character�� �״�� �Ἥ �ϴ� ���
		 * + ���׿����� Ǭ �ڵ�
		 * (��ư� �����ڵ� ���� �� �ʿ� ����. ���� �����ڵ� ��������.
		 *  �ʹݿ��� �ͼ��� ���� ����ϴ°� ������ �� ����)
		 * 
		 * if('A' <= ch && ch <= 'Z'){ //�빮���ΰ�?
		 * 		boolean b = true;
		 * }else{
		 * 		if('a' <= ch && ch <= 'z'){ //�ҹ����ΰ�?
		 * 			boolean b = true;
		 * 		}else{
		 * 			if('0' <= ch && ch <= '9'){//�����ΰ�?
		 * 				boolean b = true;
		 * 			}else{//��� ���� ������Ű�� ���� ���
		 * 				boolean b = false;
		 * 			}
		 * 		}
		 * }
		 * 	
		 * */
		
		

		System.out.println(b);

	}
}
