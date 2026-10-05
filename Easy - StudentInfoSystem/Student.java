public class Student extends Person {
	private String course; 
	private int yearLevel;

	public Student (String name, String idNumber, String course, int yearLevel) {
		super (name, idNumber);
		this.course = course;
		this.yearLevel = yearLevel;
	}
	public String getCourse() {
		return course;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public String studentStatus() {
		if (yearLevel >= 1 && yearLevel <=4) {
			if (yearLevel >= 3) {
				return "Senior";
			} else {
				return "Junior";
			}
		} else {
			return "Status is not available";
		}
	}
	
	
	public void personInfo() {
		System.out.println("\nSTUDENT INFORMATION");
		System.out.println("Name: " + getName());
		System.out.println("ID Number: " + getIdNumber());
		System.out.println("Course: " + course);
		System.out.println("Year Level: " + yearLevel);

		System.out.println();

	}
}
