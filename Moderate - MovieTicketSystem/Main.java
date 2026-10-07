import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner jw = new Scanner(System.in);
		System.out.println("Problem Set 4: Movie Ticket System\n");

		System.out.print("Enter Movie Title: ");
		String title = jw.nextLine();

		System.out.print("Enter Movie Genre: ");
		String genre = jw.nextLine();

		System.out.print("Enter Ticket Price: ");
		double ticketPrice = jw.nextDouble();

		System.out.print("Enter Customer Age: ");
		int age = jw.nextInt();

		System.out.print("Enter Number of Tickets: ");
		int numberOfTickets = jw.nextInt();

		Customer customer = new Customer(title, genre, ticketPrice, age, numberOfTickets);

		customer.displayMovieInfo();
	}
}
