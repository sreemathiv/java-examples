import java.util.Scanner;

public class SystemInput {

	public static void main(String[] args) {
		System.out.print("Enter a message ");
		Scanner scanner = new Scanner(System.in);
		String msg = scanner.nextLine();
		
		System.out.println("You have entered :"+msg.toUpperCase());

	}

}
