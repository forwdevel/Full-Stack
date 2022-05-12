package ch6;

public class Ex6_20 {
	
	//�ռ� ����ߵ��� �� Ŭ�������� Ŭ���� ������ ����,
	//������ ������ ���� �ٷ��� �ʰ�, ������������ �ٷ�� �޼ҵ��
	//static�̾�߸� �Ѵ�.
	public static int[] shuffle(int[] arr) {
		int temp;
		int[] result = new int[arr.length];
		int index = (int)(Math.random()*9);
		
		//Copy => static�̶� �̰����� ��ȯ�� arr�� �ٱ������� ��ȯ�� ���� �����Ѵ�.
		//main�޼ҵ忡�� ���� �ٲٴ� �Ŷ� ��������
		//C������ �Լ����� ����
		for(int i = 0; i< arr.length;i++) {
			result[i] = arr[i];
		}
		
		//Shuffle
		for(int i = 0; i< result.length;i++) {
			temp = result[i];
			result[i] = result[index];
			result[index] = temp;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}//main()
}//Main
