package Lab4;
import java.util.Scanner;
import java.io.File;

public class codeReview {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Skriv in namnet på filen du vill söka inuti: ");
	
		String fileName = scan.nextLine() + "txt";
		
		Scanner s = new Scanner(new File(fileName));	
		
		System.out.println("Skriv in vilket ord du letar efter: ");
		
		String search = scan.nextLine();
	
		while(s.hasNext()) {
			String [] temp =s.nextLine().split(" ");
			for(int i = 0; i<temp.length; i++) {
				if(temp[i].equals(search)) {
					System.out.println(s.nextLine());
				}	
			}
		}
	}
}