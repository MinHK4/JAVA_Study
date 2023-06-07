package Lesson01;

import java.util.Scanner;

public class Code05 {

	public static void main(String[] args) {
		
//		배열 정의 및 선언하기
//		아래와 같이 한 줄로 정의 및 선언할 수 있음
//		int [] grades = new int[5]; 
//		int [] grades;
//		grades = new int[5];
		
//		배열에 값 할당해주기
//		grades[0] = 100;
//		grades[1] = 67;
//		grades[2] = 18;
//		grades[3] = 24;
//		grades[4] = 37;
		
//		배열 값 출력하기 - 노가다
//		System.out.println("하나씩 다 출려하기");
//		
//		System.out.println(grades[0]);
//		System.out.println(grades[1]);
//		System.out.println(grades[2]);
//		System.out.println(grades[3]);
//		System.out.println(grades[4]);
		
		
		System.out.println("배열의 크기를 지정하시오: ");
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int [] grades = new int[num];
		
		
		for(int i=0; i<grades.length; i++) {
			System.out.println((i+1) + "번째 원소의 값을 지정하시오: ");
			grades[i] = kb.nextInt();
		}
		
//		배열 값 출력하기 - 반복문
		System.out.println("반복문으로 출력하기");
		for(int i=0; i<grades.length; i++) {
			System.out.println("Grade " + (i+1) + ": " + grades[i]);
		}
		
		kb.close();
	}

}
