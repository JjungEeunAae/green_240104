package ex03;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.printf("a = %d, b = %d", a, b);
		
		int c = 300;
		byte d = (byte) c;
		System.out.printf("c = %d, d = %d", c, d);
		
		// 교수님 풀이
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		char str[] = A.toCharArray();
		for(int i = 0 ; i < str.length ; i++) {
			if(str[i] > 90) {
				str[i] = (char)((int)str[i] - 32);
			} else {
				str[i] = (char)((int)str[i] + 32);
			}
		}
		System.out.println(new String(str));
	}
}
