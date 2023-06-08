import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

	public static void main(String[] args) {
		
		String [] name = new String[1000];
		String [] phoneNumber = new String[1000];
		int n = 0;
		
		
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
		
		
		for(int i=0; i<n; i++)
			System.out.println(name[i] + " : " + phoneNumber[i]);
	}

}
