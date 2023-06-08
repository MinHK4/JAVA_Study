import java.util.Scanner;

public class Code18 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] data = new int[n];
		
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		kb.close();
		
		// 메소드 호출해서 함수 활용
		bubbleSort(n, data);
	
		System.out.println("Sorted Data: ");
		for(int i=0; i<n; i++)
			System.out.println(data[i]);
	}
	
	
//	Bubble Sort
	static void bubbleSort(int n, int [] data) {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(data[j] > data[j+1]) swap(data[j], data[j+1]);
			}
		}		
	}
	
	// Call by Reference
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
