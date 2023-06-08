package Section2;

public class Term {
	public int coef;
	public int expo;
	
	public int calcTerm(int x) {
		return (int)(coef * Math.pow(x, expo));
	}
	
	public void printTerm() {
		System.out.println(coef + "x^" + expo);
	}
}