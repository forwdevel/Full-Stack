package ch6;

public class Ex6_23 {
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		
		//java.util.Arrays.toString();
		//java.util ��Ű���� �⺻������ ���ԵǾ�����.
		//�迭�� ������ ���
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("MAX: " + max(data));
		System.out.println("MAX: " + max(null));
		System.out.println("MAX: " + max(new int[] {}));
	}

	private static int max(int[] data) {
		if (data == null || data.length == 0)
			return -999999;//������� �˸��� ���� ��, Ư���� �ǹ̴� ����, ���� �������̶�� �˼��� ������ ��
		int max = 0;
		for (int i = 0; i < data.length; i++) {
			if (max < data[i])
				max = data[i];
		}
		return max;
	}
}
