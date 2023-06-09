package Section1;

// Super Class
public class Computer {
	
	// private으로 사용하면 자식 클래스에서 사용 할 수 없음
	// protected로 사용하면 자식 클래스에서 상속받아서 메소드에서 활용할 수 있음
	
	// 혹은 private으로 선언하고 자식에서 활용하려고 할 떄 super.메소드 이런 방식으로 활용 가능

	public String manufacturer;
	public String processor;
	public int ramSize;
	public int diskSize;
	public double processorSpeed;
	
	// constructor
	public Computer(String man, String proc, int ram, int disk, double speed) {
		manufacturer = man;
		processor = proc;
		ramSize = ram;
		diskSize = disk;
		processorSpeed = speed;
	}
	
	public double computerPower() {
		return ramSize * processorSpeed;
	}
}
