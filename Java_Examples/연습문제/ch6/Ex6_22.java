package ch6;

public class Ex6_22 {
	public static boolean isNumber(String str) {
		//String.isEmpty()�� �ش� String�� ������� �ƴ��� Ȯ���ϰ� boolean���� ��ȯ
		
		//str == null�̶�� �̾߱��, �ּҸ� ������ ���� �ʴٴ� �̾߱�. �ʱ�ȭ�� �ʿ��� ����.
		//ex) String str;
		//system.out.printLn(str); => error!
		//=> �ʱ�ȭ�� ���߱⶧���� �⺻���� �ּҵ� ����. �ε������� ������, ���㰡 + ���Ű� ������.
		//���� �����ϴ� �Ǽ��̴� ����!
		
		if(str == null || str.isEmpty()) {
			return false;
		}//���� ����ٸ�
		for(int i = 0;i<str.length();i++) {
			//���ڰ� �ƴϸ�
			if(str.charAt(i)<'0'||str.charAt(i)>'9') {
				return false;
			}
		}
		//return�� ������ break;ó�� �ٷ� �ߴ��ϰ� ������ �ȵ��� ��������
		//�̰� �𸣰� �Ǽ��ϴ� ��� ���� ������ ����.
		//�ǵ������� �� �����ϰ�Ͱų�, �޸� ������� ª�Ը� �����ϰ� ���� �� ��ġ�� �߿�
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println("are "+ str + " numbers? "+isNumber(str));
		
		str = "1234o";
		System.out.println("are "+ str + " numbers? "+isNumber(str));
	}
}
