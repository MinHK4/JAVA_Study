package Section1;

import java.util.Scanner;

public class Code06 {
	
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
					addTerm(polys[index], c, e);
					
				}
				
			} else if(command.equals("calc")) {
				char name = kb.next().charAt(0);
				
				int index = findPoly(name);
				if(index == -1)	System.out.println("No such Polynomial exist.");
				else {
					int x = kb.nextInt();
					int result = calcPolynomial(polys[index], x);
					
					System.out.println(result);
				}
			} else if(command.equals("print")) {
				char name = kb.next().charAt(0);
				
				int index = findPoly(name);
				if(index == -1)	System.out.println("No such Polynomial exist.");
				else {
					printPolynomial(polys[index]);
				}
				
			} else if(command.equals("exit")) {
				break;
			}
		}
		
		kb.close();
	}
	
	static int calcTerm(Term term, int x) {
		return (int)(term.coef * Math.pow(x, term.expo));
	}
	
	static int calcPolynomial(Polynomial p, int x) {
		int result = 0;
		for(int i=0; i<p.nTerms; i++)
			result += calcTerm(p.terms[i], x);
		return result;
	}
	
	static void printTerm(Term t) {
		System.out.println(t.coef + "x^" + t.expo);
	}
	
	static void printPolynomial(Polynomial p) {
		for(int i=0; i<p.nTerms; i++) {
			printTerm(p.terms[i]);
			System.out.println(" + ");
		}
	}
	
	
	static int findTerm(Polynomial p, int e) {
		for(int i=0; i<p.nTerms && p.terms[i].expo >= e; i++) {
			if(p.terms[i].expo == e) return i;
		}
		return -1;
	}
	
	static void addTerm(Polynomial p, int c, int e) {
		int index = findTerm(p, e);
		if(index != -1) {
			p.terms[index].coef += c;
		} else {
			int i = p.nTerms -1;
			while(i>=0 && p.terms[i].expo < e) {
				p.terms[i+1] = p.terms[i];
				i--;
			}
			p.terms[i+1] = new Term();
			p.terms[i+1].coef = c;
			p.terms[i+1].expo = e;
			p.nTerms++;
		}
	}
	
	static int findPoly(char name) {
		for(int i=0; i<n; i++) {
			if(polys[i].name == name) return i;
		}
		return -1;
	}
	
	
}
