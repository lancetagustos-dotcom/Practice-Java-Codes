import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner jw = new Scanner(System.in);
		System.out.println("Problem Set 2: Student Information System\n");
		
		System.out.println("Enter your name: ");
		String name = jw.nextLine();
		System.out.println("Enter your ID Number: ");
		String idNumber = jw.nextLine();
		System.out.println("Enter your Course: ");
		String course = jw.nextLine();
		System.out.println("Enter your Year Level: ");
		int yearLevel = jw.nextInt();

		Student student = new Student(name, idNumber, course, yearLevel);

		student.personInfo();

		System.out.println("\nSTUDENT STATUS");
		System.out.println("Status: " + student.studentStatus());
	}
}
