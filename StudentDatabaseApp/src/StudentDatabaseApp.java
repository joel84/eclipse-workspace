import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
      /*Student student1 = new Student();
	   student1.enroll();
	   student1.payTuition();
	   System.out.println(student1.toString());*/

		//Ask how many new students we want to add
		System.out.println("Enter the number of new students to enroll: ");
		Scanner scan = new Scanner(System.in);
		int numOfStudents = scan.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Create n number of new students
		for(int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].toString());
		}
	}

}
