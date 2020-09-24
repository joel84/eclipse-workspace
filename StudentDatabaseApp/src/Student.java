import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	//Constructor: prompt user to enter student's name and year
	public Student () {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = scan.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = scan.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level");
		this.gradeYear = scan.nextInt();
		
		setStudentID();
		
	}
	
	//generate ID 
	private void setStudentID () {
		//grade level + ID 
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		//get inside a loop, user hits 0
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner scan = new Scanner(System.in);
			String course = scan.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				
				break;
			}
		} while (1!= 0);
		
	}
	
	//View balance
	public void viewBalance () {
		System.out.println("Your Balance is: $" + tuitionBalance);
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner scan = new Scanner(System.in);
		int payment = scan.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of: " + payment);
		viewBalance();
	}
	
	//Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses enrolled: " + courses +
				"\nBalance: $ " + tuitionBalance;
		
	}
}
