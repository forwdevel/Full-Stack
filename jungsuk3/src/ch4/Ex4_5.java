package ch4;

public class Ex4_5 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		/* for문과 while문은 사실상 동일,
		 * 
		 * while문은 주로 변수가 0부터 시작하지 않거나, 
		 * 무한루프(true)를 돌린 후, 특정 조건을 만족할때만 break하고 싶은 경우,
		 * 일정한 규칙을 가지지 않은 상태값(대표적으로, 순차적으로 증가하지 않는)을 
		 * 기준으로 작동할 때 주로 사용
		 * 
		 * 반면 for문은 변수선언 및 증감조건을 한문장안에 넣을 수 있어서,
		 * 간단하고 직관적인 코딩 가능.
		 * 반면, 일정한 규칙을 가지지 않은 상태값을 기준으로 작동할 때 사용하기 힘듦.
		 * 
		 *	while문
		 *		=> 조건에 들어갈 변수가 무조건 바깥에 선언되어야 함.
		 *		=> 무한루프를 돌지않도록, 조건문을 false로 만들 수 있게 증감연산자를 두거나, break필수.
		 *
		 * 	for문
		 * 		=> 최상단에 변수, 조건문, 증감연산자가 모두 들어가기 때문에 무한루프를 돌릴 가능성이 적음
		 * 		=> 가독성이 좋음
		 * 
		 * */
		
		
		while(i<=10) {
			while(j<=i) {
				System.out.println("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
