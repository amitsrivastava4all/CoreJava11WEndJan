
public class Student {
	private int rollno;  // scope is till class (Member Variable)
	private String name;
	private String course;
	
	// r is a local variable
	public void takeInput(int rollno, String name , String course) {
		if(rollno>0 && name.length()>0 && course.length()>0) {
		this.rollno = rollno;  // member variable = local variable
		this.name = name;
		this.course = course;
		}
		else {
			System.out.println("Invalid Data...");
		}
	}
	public void print() {
		System.out.println("ID "+this.rollno);
		System.out.println("Name "+name);
		System.out.println("Course "+course);
	}
}
