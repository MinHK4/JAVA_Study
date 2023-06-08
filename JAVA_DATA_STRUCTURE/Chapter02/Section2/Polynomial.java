package Section2;

public class Polynomial {
	public char name;		// 다항식의 이름
	public Term[] terms;	// 다항식의 항들 배열
	public int nTerms;		// 다항식의 항의 개수
	
	// 생성자 인자 수 다르게 해서 다양하게 선언해놓기
	public Polynomial() {
		terms = new Terms[100];
		nTerms = 0;
	}
	
	public Polynomial(char n) {
		name = n;
		terms = new Terms[100];
		nTerms = 0;
	}
	
	public int findTerm(int e) {
		for(int i=0; i<nTerms && terms[i].expo >= e; i++) {
			if(terms[i].expo == e) return i;
		}
		return -1;
	}
	
	public void addTerm(int c, int e) {
		int index = findTerm(e);
		if(index != -1) {
			terms[index].coef += c;
		} else {
			int i = nTerms -1;
			while(i>=0 && terms[i].expo < e) {
				terms[i+1] = terms[i];
				i--;
			}
			terms[i+1] = new Term(c, e);
			nTerms++;
		}
	}
	
	public int calcPolynomial(int x) {
		int result = 0;
		for(int i=0; i<nTerms; i++)
			result += terms[i].calcTerm(x);
		return result;
	}

	public void printPolynomial() {
		for(int i=0; i<nTerms; i++) {
			terms[i].printTerm();
			System.out.println(" + ");
		}
	}
}
