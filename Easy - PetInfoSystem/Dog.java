public class Dog extends Animal {
	private String breed; 
	private double weight;

	public Dog (String name,  String breed, int age, double weight) {
		super(name, age);
		this.breed = breed;
		this.weight = weight;
	}

	public String getBreed() {
		return breed;
	}

	public double getWeight() {
		return weight;
	}
	
	public double dailyFoodIntake() {
		return this.weight / 30;
	}

	public String dogLifeStage() {
		if (getAge() >= 0) {
			if (getAge() >= 2) {
				return "Adult";
			} else {
				return "Puppy";
			}
		} else {
			return "Dog's age is unverified.";
		}
	}

	public void displayDogInfo() {
		System.out.println("\nDOG INFORMATION");
		System.out.println("Name: " + getName());
		System.out.println("Breed: " + getBreed());
		System.out.println("Age: " + getAge());
		System.out.println("Weight: " + getWeight());

		System.out.println();

		System.out.println("\nDAILY FOOD INTAKE");
		System.out.printf("Your %.2f lbs of food.\n", dailyFoodIntake());

	}
}
