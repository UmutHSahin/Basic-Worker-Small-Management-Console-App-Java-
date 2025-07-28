package a;

import java.util.Scanner;

public class Page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("-------------------------Welcome to App----------------------");
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter the worker number : ");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter the worker name : ");
		String name = scanner.nextLine();
		
		System.out.print("Enter the worker surname : ");
		String surname = scanner.nextLine();
		
		System.out.print("Enter the worker experiance : ");
		int experiance = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter the worker salary : ");
		double salary = scanner.nextDouble();
		scanner.nextLine();
		
		Worker worker1 = new Worker(number, name, surname, experiance, salary);

		String islem = "1-Show workers info\n" + "2- Do raise\n" + "3- Formatting";

		System.out.println("--------------------------------------");
		System.out.println(islem);
		System.out.print("Choose the process");
		int choosen = scanner.nextInt();
		
		scanner.nextLine();
		
		
		switch(choosen) {
		
		case 1:
			worker1.printInfoWorkers();
			break;
			
		case 2: 
			System.out.print("Enter amount of raise :");
			int amountRaise = scanner.nextInt();
			scanner.nextLine();
			worker1.raise (amountRaise);
			break;
			
		case 3:
				System.out.print("Enter name of who will do the formatting : ");
				String person = scanner.nextLine();
				System.out.print("Enter name of Oparating System of computer : ");
				String op = scanner.nextLine();
				worker1.formatting(op, person);
				

			break;
			
			default: System.out.println("Please Choose the thing in the list ");
				break;
		}
		
		
	}
}