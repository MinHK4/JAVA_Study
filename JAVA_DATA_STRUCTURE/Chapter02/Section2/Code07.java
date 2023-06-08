package Section2;

import java.util.Scanner;

public class Code07 {
	
	static Polynomial[] polys = new Polynomial[100];
	static int n = 0;
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			System.out.println("$ ");
			
			String command = kb.next();
			
			if(command.equals("create")) {
				char name = kb.next().charAt(0);
				
				polys[n] = new Polynomial();
				polys[n].name = name;
				polys[n].terms = new Term[100]; 
				polys[n].nTerms = 0;
				n++;
			} else if(command.equals("add")) {
				char name = kb.next().charAt(0);
				
				int index = findPoly(name);
				if(index == -1)	System.out.println("No such Polynomial exist.");
				else {
					int c = kb.nextInt();
					int e = kb.nextInt();
					polys[index].addTerm(c, e);
				}
				
			} else if(command.equals("calc")) {
				char name = kb.next().charAt(0);
				
				int index = findPoly(name);
				if(index == -1)	System.out.println("No such Polynomial exist.");
				else {
					int x = kb.nextInt();
					int result = polys[index].calcPolynomial(x);
					
					System.out.println(result);
				}
			} else if(command.equals("print")) {
				char name = kb.next().charAt(0);
				
				int index = findPoly(name);
				if(index == -1)	System.out.println("No such Polynomial exist.");
				else {
					polys[index].printPolynomial();
				}
				
			} else if(command.equals("exit")) {
				break;
			}
		}
		
		kb.close();
	}
		
	static int findPoly(char name) {
		for(int i=0; i<n; i++) {
			if(polys[i].name == name) return i;
		}
		return -1;
	}
}
