package chap04;
import java.util.*;

class FlowEx28 {
	public static void main(String[] args) { 
		int input  = 0;
		int answer = 0;

		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("1과 100사이의 정수를 입력하세요>");

			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);

			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해봐");	
			} else if(input < answer) {
				System.out.println("더 큰수로 다시 시도해봐");			
			}
		} while(input!=answer);

		System.out.println("정답!");
	}
}
