package chap04;
class FlowEx14 {
	public static void main(String[] args) { 
		for(int i=1, j=10 ; i <= 10 && j >= 0 ; i++, j--)
			System.out.printf("%d \t %d%n", i, j);
	}
}
