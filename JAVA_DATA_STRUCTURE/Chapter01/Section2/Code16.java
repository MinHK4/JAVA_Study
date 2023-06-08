import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt();
		int b = kb.nextInt();
		
		int result = power(a, b);
		
		System.out.println(result);
		
		kb.close();
	}
	
	// 새로운 함수, 즉 메서드를 정의할 때는 static을 붙여줘야 함
	static int power(int a, int b){
		int prod = 1;
		
		for(int i=0; i<b; i++)
			prod *= a;
		
		return prod;
	}	
}
