package Section2;


public class DeadlineEvent extends Event{
	public String title;
	public MyDate deadline;
	
	public DeadlineEvent(String title, MyDate d) {
		super(title);
		deadline = d;
	}
	
	public String toString() {
		return title + ", " + deadline.toString();
	}
}