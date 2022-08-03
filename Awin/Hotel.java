import java.util.Scanner;
public class Hotel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Customer Name: ");
		String name = scanner.next();
		System.out.print("Choose room type(1,2,3): \n1 : Sea View - $ 12\n2 : Second Sea View - $ 4\n3 : Garden View - $ 22\n");
		String rt = scanner.next();
		System.out.print("Enter Total Room(1,2,3,4,5,etc..): ");
		String tr = scanner.next();
		System.out.println("Welcome to Ngapali Hotel");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("CUSTOMER NAME\n" + name);
		// System.out.println("ROOM TYPE\n" + );
		// System.out.println("CUSTOMER NAME\tROOM TYPE\tTOTAL ROOM\tPRICES");
		// System.out.print(name);
		String price = 0;
		if(rt.equals("1")) {
			System.out.println("ROOM TYPE\nSea View");
			price = 12;
			// System.out.println("Sea View");
		} else if(rt.equals("2")) {
			price = 4;
			System.out.println("ROOM TYPE\nSecond Sea View");
		} else if(rt.equals("3")) {
			price = 22;
			System.out.println("ROOM TYPE\nGarden View");
		}
		if(tr.equals("1")) {
			System.out.println("TOTAL ROOM\n1");
		} else if(tr.equals("2")) {
			System.out.println("TOTAL ROOM\n2");
		} else if(tr.equals("3")) {
			System.out.println("TOTAL ROOM\n3");
		}
			System.out.println("PRICES\n" + (price*tr));
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
	}
}