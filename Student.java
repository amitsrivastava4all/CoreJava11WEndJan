
public class Student {
	private int rollno;  // scope is till class (Member Variable)
	private String name;
	private String course;
	private String phone;
	private String email;
	private String address;
	private double fees;
	private static String collegeName;
	private String offers;
	
	
	
	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public static String getCollegeName() {
		return collegeName;
	}

	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}

	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}

	Student(int rollno , String name, String course){
		this();
		this.rollno = rollno + offers.length();
		this.name = name;
		this.course = course;
	}
	
	Student(){
		offers = "Joining Offer 2000 Discount";
		System.out.println("this is default cons");
	}
	// Pre Constructor call
	{
		System.out.println("this is init block "+rollno+" "+name);
	}
	{
		System.out.println("init block2");
	}
	static {
		collegeName = "SRCC";
		System.out.println("I Will Call Only ONce when class is loaded...");
	}
	
	// r is a local variable
	public void takeInput(int rollno, String name , String course) {
		if(rollno>0 && name.length()>0 && course.length()>0) {
		//rollno = r;
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
		System.out.println("Phone "+phone);
		System.out.println("Email "+email);
		System.out.println("CollegeName "+collegeName);
		System.out.println("Offer "+offers);
	}
}
