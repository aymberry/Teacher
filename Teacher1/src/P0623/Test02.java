package P0623;
import	java.util.*;
/*
 * 	문제
 * 		10개의 배열 공간에 랜덤하게 숫자를 입력한 후
 * 
 * 		이것을 크기 순서대로 출력하세요
 * 
 * 		정렬 알고리즘
 * 		==>		 보조설명 참조
 * 
 *	참고
 *		객체지향 언어란?
 *		개발자가 필요한 기능을 부품화 시켜서 제작한 후
 *		개발자는 필요한 부품을 필요한 위치에 사용만 하면 해결되도록 하는 언어이다. 
 */
public class Test02 {

	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * (100 - 0 + 1) + 0);
		}
		//	현재 순서를 출력해본다.
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "   ");
		}
		System.out.println();
		//	정렬을 시도한다.
		//	라운드 회수만큼 반복을 한다.
		for(int i = 1; i <= 9; i++) {
			//	몇줄을 출력하는지 반복한다.
			//	각 라운드의 반복 회수를 지정한다.
			//	1R		9번
			//	2R		8번
			for(int j = i; j <= 9; j++) {
				//	한줄에 출력할 개수만큼 반복한다.
				//	이제 두 데이터를 비교한다.
				if(num[i -1] > num[j]) {
					//	두 데이터를 교환해라
					int	temp = num[i - 1];
					num[i - 1] = num[j];
					num[j] = temp;
				}
			}
		}

		//	바뀐 결과를 출력해본다.
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "   ");
		}
		System.out.println();
	}
}
