package Lesson01;
import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		String str = "Hello World";
		String input = null;
		
		System.out.println("Please type a string: ");
		Scanner kb = new Scanner(System.in);
		input = kb.next();
		
//		문자열의 경우에 == 연산자를 통해서 동일한지 여부를 확인할 수 없음
//		문자열의 동일 여부는 equals()메소드를 활용해야 함
		if(str.equals(input)) {
			System.out.println("Strings match");
		}
		else {
			System.out.println("Strings do not match");
		}
		
		kb.close();
	}
}
