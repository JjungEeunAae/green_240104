package ex04;

public class Ex02 {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = !a;		// a의 boolean 값의 반대를 b에 주입
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int c = 10;
		int d = 20;
		
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		d += c;		// d = d + c;
		System.out.println("d = " + d);
	}
}
