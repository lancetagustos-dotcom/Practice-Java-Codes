public class Customer extends Movie {
	private int age, numberOfTickets;

	public Customer(String title, String genre, double ticketPrice, int age, int numberOfTickets) {
		super(title, genre, ticketPrice);
		this.age = age;
		this.numberOfTickets = numberOfTickets;
	}

	public int getAge() {
		return age;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public double calculateOriginalCost() {
		return getTicketPrice() * getNumberOfTickets();
	}

	public double calculateTotalDiscount() {
		double totalDiscount = 0;
		if (getAge() > 0) {
			if (getAge() < 13) {
				totalDiscount += 0.3;
			} else if (getAge() >= 13 && getAge() <= 59) {
				totalDiscount += 0;
			} else if (getAge() >= 60) {
				totalDiscount += 0.2;
			}
		} else {
			System.out.println("Error");
		}
		
		if (getNumberOfTickets() >= 5) {
			if (getNumberOfTickets() < 13) {
				totalDiscount += 0.1;
			} else {
				System.out.println("Error");
			}
		}
		return totalDiscount;
	}

	public double calculateTotalCost() {
		double totalCost = getTicketPrice() - (getTicketPrice() * calculateTotalDiscount());
		return totalCost;
	}

	public void displayMovieInfo() {
		System.out.println("\nTICKET RECEIPT\n");

		System.out.println("\nMOVIE INFORMATION");
		System.out.println("Movie Title: " + getTitle());
		System.out.println("Genre: " + getGenre());
		System.out.println("Base Ticket Price: PHP" + getTicketPrice());

		System.out.println();

		System.out.println("\nCUSTOMER DETAILS");
		System.out.println("Age: " + getAge());
		System.out.println("Number of Tickets: " + getNumberOfTickets());

		System.out.println();

		System.out.println("\nPAYMENT");
		System.out.printf("Original Cost: PHP %.2f\n", calculateOriginalCost());
		System.out.printf("Total Discount: %.2f%%\n", calculateTotalDiscount());
		System.out.printf("Final Cost: %.2f\n", calculateTotalCost());

	}
}
