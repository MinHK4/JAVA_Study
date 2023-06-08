import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code22 {

	static String[] words = new String[10000];
	static int[] count = new int[10000];
	static int n = 0;

	public static void main(String[] args) {


		Scanner kb = new Scanner(System.in);

		while(true) {

			System.out.println("$ ");
			String command = kb.next();

			if(command.equals("read")) {
				String fileName = kb.next();

				makeIndex(fileName);

				for(int i=0; i<n; i++)
					System.out.println(words[i] + " " + count[i]);

			} else if(command.equals("find")) {
				String str = kb.next();
				int index = findWord(str);
				if(index > 1)
					System.out.println("The word " + words[index] + " appears " + count[index] + " times.");
				else
					System.out.println("The word " + str + " does not appear.");

			} else if(command.equals("saveAs")) {
				String fileName = kb.next();
				saveAs(fileName);
			} else if(command.equals("eixt")) {
				break;
			}
		}
		kb.close();
	}

	static void saveAs(String fileName) {
		try {
			PrintWriter outFile = new PrintWriter(new FileWriter(fileName));

			for(int i=0; i<n; i++) {
				outFile.println(words[i] + " " + count[i]);
			}

			outFile.close();

		} catch (IOException e) {
			System.out.println("Save Failed");
			return;
		}
	}

	// 파일명 인자로 받아서 단어 인덱스 만들어주는 메소드
	static void makeIndex(String fileName) {
		try {
			Scanner inFile = new Scanner( new File(fileName));

			while(inFile.hasNext()) {
				String str = inFile.next();
				addWord(str);
			}

			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			return;
		}
	}

	// 해당 단어가 있는지 여부 확이내서 인덱드 업데이트해주는 메소드
	static void addWord(String str) {
		int index = findWord(str);
		if(index != -1) { // word is found!
			count[index]++;
		}
		else {	// word is not found!
			words[n] = str;
			count[n] = 1;
			n++;
		}
	}

	// 해당 단어가 인덱스에 이미 있는지 확인해주는 메소드
	static int findWord(String str) {
		for(int i=0; i<n; i++) {
			if(words[i].equalsIgnoreCase(str)) return i;
		}
		return -1;
	}
}


