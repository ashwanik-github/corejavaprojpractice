/*
 * @author : Ashwani K
 * @version :1.0
 */
package studentdb.application;

import java.util.List;

/**
 * The Class StudentModel.
 */
public class StudentModel {
	
	private int uuid = 1000;
	
	/** The stud name. */
	private String studName;
	
	/** The grade year. */
	private int gradeYear;
	
	/** The stud ID. */
	private String studID;
	
	/** The courses. */
	private List<String> courses;
	
	/** The tuition bal. */
	private int tuitionBal;
	
	/** The cost of course. */
	private  int costOfCourse = 600;
	
	/**
	 * Instantiates a new student model.
	 */
	//default constructor
		public StudentModel() {
			
		}

	/**
	 * Instantiates a new student model.
	 *
	 * @param studName  the stud name
	 * @param gradeYear the grade year
	 * @param courses   the courses
	 */
	public StudentModel(String studName, int gradeYear, List<String> courses) {
		this.studName = studName;
		this.gradeYear = gradeYear;
		this.courses = courses;
		this.uuid=uuid++;
	}



	/**
	 * Gets the stud name.
	 *
	 * @return the stud name
	 */
	public String getStudName() {
		return studName;
	}

	/**
	 * Sets the stud name.
	 *
	 * @param studName the new stud name
	 */
	public void setStudName(String studName) {
		this.studName = studName;
	}

	/**
	 * Gets the stud ID.
	 *
	 * @return the stud ID
	 */
	public String getStudID() {
		return (studID=gradeYear+""+uuid);
	}
	
	
	/**
	 * Gets the courses.
	 *
	 * @return the courses
	 */
	public List<String> getCourses() {
		return courses;
	}

	/**
	 * Sets the courses.
	 *
	 * @param courses the new courses
	 */
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	/**
	 * Gets the grade year.
	 *
	 * @return the grade year
	 */
	public int getGradeYear() {
		return gradeYear;
	}

	/**
	 * Sets the grade year.
	 *
	 * @param gradeYear the new grade year
	 */
	public void setGradeYear(int gradeYear) {
		this.gradeYear = gradeYear;
	}

	/**
	 * Gets the tuition bal.
	 *
	 * @return the tuition bal
	 */
	public int getTuitionBal() {
		return costOfCourse+=tuitionBal;
	}

	/**
	 * Sets the tuition bal.
	 *
	 * @param tuitionBal the new tuition bal
	 */
	public void setTuitionBal(int tuitionBal) {
		this.tuitionBal=tuitionBal;
	}
	
	
	
}
