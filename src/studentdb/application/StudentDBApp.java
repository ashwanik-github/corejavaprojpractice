/*
 * @author : Ashwani K
 * @version :1.0
 */
package studentdb.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The Class StudentDBApp.
 */
public class StudentDBApp {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		//Scanner for taking the input
		Scanner scan = new Scanner(System.in);
		List<StudentModel> studList = new ArrayList<StudentModel>();
		//now implementing the logic here
		System.out.println("***************** Welcome to Student Portal *******************");
		System.out.print("Enter the number of student to be enrolled : ");
		int studNum = scan.nextInt();
		System.out.println();
		while(studNum >0 ) {
		//create the instant of the model we are creating here
		StudentModel  stud = new StudentModel();
		//ask the name and year of the student
		System.out.print("Enter the name of the student : ");
		String studName = scan.next();
		System.out.println();
		System.out.print("Enter the Year of Course Study : ");
		int gradYear = scan.nextInt();
		System.out.println();
		System.out.print("Select the course s.no. you wanted to enroll below : ");
		System.out.println();
		System.out.print(
				"1. History 101\r\n" + 
				"2. Mathematics 101\r\n" + 
				"3. English 101\r\n" + 
				"4. Chemistry 101\r\n" + 
				"5. Computer Science 101");
				
		System.out.println();
		int choice = scan.nextInt();
		int tuitionFees = 0;
		List<String>myCourse = new ArrayList<String>();
		do {
		//if the course selected then calculate the fees 
		if(choice==1) {
				 System.out.println("The Selected Course : History 101 ");
				 myCourse.add("History 101");
				 System.out.println("The Course Enrollment costs : $600");
				 System.out.println("You need to pay : $"+tuitionFees+600);
		} 
		else if(choice==2) {
				 System.out.println("The Selected Course : Mathematics 101 ");
				 myCourse.add("Mathematics 101");
		 		 System.out.println("The Course Enrollment costs : $700");
		 		 System.out.println("You need to pay : $"+tuitionFees+700);
		}		
		else if(choice==3) {		
				 System.out.println("The Selected Course : English 101");
				 myCourse.add("English 101");
		 		 System.out.println("The Course Enrollment costs : $700");
		 		 System.out.println("You need to pay : $"+tuitionFees+700);
		}	
		else if(choice==4) {
				 System.out.println("The Selected Course : Chemistry 101 ");
				 myCourse.add("Chemistry 101");
		 		 System.out.println("The Course Enrollment costs : $600");
		 		 System.out.println("You need to pay : $"+tuitionFees+600);
		}
		else if(choice==5) {
				 System.out.println("The Selected Course : Computer Science 101 ");
				 myCourse.add("Computer Science 101");
		 		 System.out.println("The Course Enrollment costs : $600");
		 		 System.out.println("You need to pay : $"+tuitionFees+800);
		} 		
		else { 		
		System.out.println("The Course you entered doesn't exits.Please try again..."); 		 
		}
		}while();
		stud.getStudID();
		stud.setStudName(studName);
		stud.setGradeYear(gradYear);
		stud.setCourses(myCourse);
		stud.setTuitionBal(tuitionFees);
		//adding the details to the the Student List hereby
		studList.add(stud);
		//reduce the counter here
		studNum--;
		System.out.println();
		System.out.println();
		}//end of while
		//Show the details of the Student here
		System.out.println("==================+++++++++++++++++++++++++++++++++++++++=================");
		System.out.println("                   The List of the Student Data Entered                   ");
		System.out.println("==================+++++++++++++++++++++++++++++++++++++++=================");
		/*ListIterator iter = studList.listIterator();
		while(iter.hasNext()) {
			System.out.print(" "+iter.next());
			System.out.println();
		} */
		System.out.println("Name \t GradeYear \t CoursesEnrolled \t Tuition Fees \t");
		for(StudentModel stud : studList){
			
			System.out.print(""+stud.getStudName());
			System.out.print("\t "+stud.getGradeYear());
			System.out.print("\t\t "+stud.getCourses());
			System.out.print("\t\t "+stud.getTuitionBal());
			System.out.println();
		}
		scan.close();
	}

}
