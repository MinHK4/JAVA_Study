package Section2;

import java.util.Scanner;

public class Scheduler {
	
	// 다형성 이용해서 SuperClass로 다양한 Sub Class 이벤트들을 묶어서 저장해주기
	public Event[] events = new Event[100];
	public int n = 0;
	private Scanner kb;
	
	public void processCommand() {
		kb = new Scanner(System.in);
		while(true) {
			System.out.println("$ ");
			String command = kb.next();
			
			if(command.equals("addevent")) {
				String type = kb.next();
				if(type.equalsIgnoreCase("oneday")) {
					handleAddOneDayEvent();
				} else if(type.equalsIgnoreCase("duration")) {
					handleAddDurationEvent();
				} else if(type.equalsIgnoreCase("deadline")) {
					handleAddDeadlineEvent();
				}
			} else if (command.equals("list")) {
				handleList();
			} else if (command.equals("show")) {
				
			} else if (command.equals("exit")) {
				break;
			}
		}
		kb.close();
	}
	
	private void handleList() {
		for(int i=0; i<n; i++) {
			System.out.println("    "+events[n].toString()); // dynamic binding
		}
		
	}

	private void handleAddDeadlineEvent() {
		// TODO Auto-generated method stub
		
	}

	private void handleAddDurationEvent() {
		// TODO Auto-generated method stub
		
	}

	private void handleAddOneDayEvent() {
		System.out.print("  when: ");
		String dateString = kb.next();
		
		
		System.out.print("  title: ");
		String title = kb.next();
		
		MyDate date = parseDateString(dateString);
		
		OneDayEvent ev = new OneDayEvent(title, date);
		events[n++] = ev;
	}
	
	// dateString을 파싱해서 MyDate 형태로 반환해주는 메소드
	private MyDate parseDateString(String dateString) {
		String[] tokens = dateString.split("/");
		
		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		
		return new MyDate(year, month, day);
	}
	
	public static void main(String[] args) {
		Scheduler app = new Scheduler();
		app.processCommand();
	}
}
