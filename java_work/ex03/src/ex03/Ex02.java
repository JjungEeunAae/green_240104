package ex03;

import java.util.Scanner;

/*
 * 입력받은 n만큼 str 값을 출력해라
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력");
		String str = sc.nextLine();
		
		System.out.println("반복횟수 입력");
		int n = sc.nextInt();
		
		System.out.println("str = " + str);
		System.out.println("n = " + n);
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print(str);
		}
	};
}
