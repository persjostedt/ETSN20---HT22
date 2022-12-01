package Lab4;

import java.util.Scanner;
import java.io.File;

public class codeReview {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Försöker öppna namnet på en fil och hämta information om den.
		// Om det går skickas ett FileNotFoundException
		System.out.println("Skriv in namnet på filen du vill söka inuti: ");
		String fileName = scan.nextLine();
		File file = new File(fileName);
		Scanner s = new Scanner(file);

		System.out.println("Skriv in vilket ord du letar efter: ");
		String search = scan.nextLine();

		// Söker igenom en linje text i taget. Delar upp varje rad av text i
		// individuella ord.
		// och söker igenom dem, hittar de en match printas hela raden.
		while (s.hasNext()) {
			String[] temp = s.nextLine().split(" ");
			for (int i = 0; i < temp.length; i++) {
				if (temp[i].equals(search)) {
					System.out.println(s.nextLine());
				}
			}
		}
	}
}