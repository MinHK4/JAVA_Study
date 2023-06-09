package Section1;

// Sub Class
public class Notebook extends Computer{
	public double screenSize;
	public double weight;
	
	
	public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight) {
		super(man, proc, ram, disk, speed);
		screenSize = screen;
		this.weight = weight;
	}
	
	// method overriding
	public double computerPower() {
		return ramSize * processorSpeed * 4;
	}
	
	public static void main(String[] args) {
		// Polymorphism 다형성
		// 슈퍼 글래스 타입의 변수가 서브 클래스 타입의 객체의 주소를 참조할 수 있다
		Computer gram = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);
		
		// computerPower는 슈퍼클래스, 서브클래스 양쪽에서 모두 정의되서 오버라이딩 되어 있음
		// 이런 상황에서 다형성 방식으로 정의한 변수 gram에서 호출하면 어떤 값을..?
		
		// Computer 타입이니까 그에 따른다 -> static binding
		// 실제 코드 진행 상황에 따라 -> dynamic binding
		// JAVA에서는 dynamic binding 채택
		System.out.println(gram.computerPower());
	}
}
