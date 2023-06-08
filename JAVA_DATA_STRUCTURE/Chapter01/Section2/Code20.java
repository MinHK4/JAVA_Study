import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

	static String [] name = new String[1000];
	static String [] phoneNumber = new String[1000];
	static int n = 0;
	
	public static void main(String[] args) {
		
		// Java 프로젝트 최상단을 기본 위치로 해서 파일 시스템 읽어옴
		// 해당 파일명이 존재하지 않을 수도 있는 경우에 대한 예외처리
		Scanner inFile;
		try {
			inFile = new Scanner( new File("input.txt"));
			
			// detect End of File
			while(inFile.hasNext()) {
				name[n] = inFile.next();
				phoneNumber[n] = inFile.next();
				n++;
			}
			
			inFile.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("No File");
			System.exit(1);
		}
		
		// 정의한 메소드 활용해서 연락처 이름 순으로 정렬
		bubbleSortByName();
		
		for(int i=0; i<n; i++)
			System.out.println(name[i] + " : " + phoneNumber[i]);
	}
	
	static void bubbleSortByName() {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(name[j].compareTo(name[j+1]) > 0) {
					String temp = name[j];
					name[j] = name[j+1];
					name[j+1] = temp;
					
					temp = phoneNumber[j];
					phoneNumber[j] = phoneNumber[j+1];
					phoneNumber[j+1] = temp;
				}
			}
		}
	}
	
}
