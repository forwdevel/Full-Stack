package ch3;

public class Ex3_2 {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = ((numOfApples / sizeOfBucket == 0) ? numOfApples / sizeOfBucket
				: numOfApples / sizeOfBucket + 1);
		
		/*	���׿����� ������� ���� �ڵ�
		 * 
		 * if(numOfApples / sizeOfBucket == 0){
		 * 	//¦���� ���� ���� �ٱ��ϸ� ����
		 * 	int numOfBucket = numOfApples / sizeOfBucket;
		 * }else{// Ȧ���� ���� ���� �ٱ��� + 1
		 * 	int numOfBucket = numOfApples / sizeOfBucket + 1;
		 * }
		 * */
		
		System.out.println("The number of bucket: " + numOfBucket);
	}
}
