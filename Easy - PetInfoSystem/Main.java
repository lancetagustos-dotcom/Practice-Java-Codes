import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner jw = new Scanner(System.in);
		System.out.println("Problem Set 3: Pet Information System\n");

		System.out.println("Enter your Pet's name: ");
		String name = jw.nextLine();

		System.out.println("Enter your Pet's breed: ");
		String breed = jw.nextLine();

		System.out.println("Enter your Pet's age: ");
		int age = jw.nextInt();

		System.out.println("Enter your Pet's weight: ");
		double weight = jw.nextDouble();

		Dog dog = new Dog(name, breed, age, weight);

		dog.displayDogInfo();

		System.out.println("\nPET'S LIFE STAGE");
		System.out.println("\nStatus: " + dog.dogLifeStage());
	}
}
