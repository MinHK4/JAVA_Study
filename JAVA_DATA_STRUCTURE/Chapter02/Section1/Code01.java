package Section1;

public class Code01 {

	public static void main(String[] args) {
		
		Person1 first = new Person1();
		first.name = "Jonn";
		first.number = "01066573847";
		
		System.out.println("Name: " + first.name + ", Number: "+ first.number);
		
		Person1[] members = new Person1[100];
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "Daviid";
		members[1].number = "01055486624";
	}
	
	/*
	 자바에서는 Primitive Type이 아니면 무조건 참조변수이다!!
	 
	*/
}
