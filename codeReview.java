package Lab4;
import java.util.Scanner;
import java.io.*;

public class codeReview {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Skriv in namnet på filen du vill söka inuti");
		String fileName = scan.nextLine() +".txt";
		File file = new File(fileName);
		System.out.println("Skriv in vilket ord du letar efter: ");
		String search = scan.nextLine();
		Scanner s = new Scanner(file);


		while (s.hasNext()) {
			if (search.equals(s.nextLine())) {
				System.out.println(s.nextLine());
			}
		}
	}
}
