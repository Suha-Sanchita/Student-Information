package arr;
import java.util.Scanner;
public class class_Names {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner (System.in);
		
		// declares an Array of integers.
		Student[] class_Member;
		
		// allocating memory for 5 objects of type Student.
		class_Member = new Student[5];
		
		// initializing the elements of the array
		class_Member[0] = new Student(1, scanner.nextLine());
		class_Member[1] = new Student(2, scanner.nextLine());
		class_Member[2] = new Student(3, scanner.nextLine());
		class_Member[3] = new Student(4, scanner.nextLine());
		class_Member[4] = new Student(5, scanner.nextLine());
		
		// accessing the elements of the specified array
		
		for (int i = 0; i < class_Member.length; i++)
			System.out.println("The student with the ID number " + class_Member[i].ID_no + " is " + class_Member[i].student_Name);
	}
}