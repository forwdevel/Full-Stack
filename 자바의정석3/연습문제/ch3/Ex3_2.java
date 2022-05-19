package ch3;

public class Ex3_2 {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = ((numOfApples / sizeOfBucket == 0) ? numOfApples / sizeOfBucket
				: numOfApples / sizeOfBucket + 1);
		
		/*	삼항연산자 사용하지 않은 코드
		 * 
		 * if(numOfApples / sizeOfBucket == 0){
		 * 	//짝수면 나눈 몫의 바구니만 나옴
		 * 	int numOfBucket = numOfApples / sizeOfBucket;
		 * }else{// 홀수면 나눈 몫의 바구니 + 1
		 * 	int numOfBucket = numOfApples / sizeOfBucket + 1;
		 * }
		 * */
		
		System.out.println("The number of bucket: " + numOfBucket);
	}
}
