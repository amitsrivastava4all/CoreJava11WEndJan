import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class Employee{
	int id ;
	String name;
	double salary;
	Employee(){
		System.out.println("Default Emp Cons");
	}
	Employee(int id , String name , double salary){
		System.out.println("Param Emp Cons");
		this.id = id; 
		this.name = name;
		this.salary = salary;
	}
	void print() {
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		 
	}
	void takeSalary(double salary) {
		this.salary = salary;
		System.out.println("Salary Take "+this.salary);
	}
	int add(int x,int y, int z) {
		return x + y +z;
	}
}
public class Demo3 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// Java 9 Syntax 
		String className = "Employee";
		Object object = Class.forName(className).getDeclaredConstructor(int.class, String.class, double.class).newInstance(1001,"Ram",9999);
		Method methods [] = object.getClass().getDeclaredMethods();
		System.out.println("Enter the Method to Be Call");
		Scanner s = new Scanner(System.in);
		String methodName = s.next();
		for(Method m : methods) {
			if(m.getName().equals(methodName)) {
				Method method = object.getClass().getDeclaredMethod(methodName, m.getParameterTypes());
				Class cls[] = m.getParameterTypes();
				System.out.println("It take "+cls.length+" Parameters");
				int index = 0;
				Object paramArr []  = null;
				for(Class para : cls) {
					System.out.println("Enter  "+para.getName() +" Type Only....");
					if(cls.length>0) {
					if(paramArr==null) {	
					 paramArr = new Object[cls.length];
					}
					if(para.getName().equals("int")) {
						paramArr[index]  = s.nextInt();
						
						index++;
					}
					else
					if(para.getName().equals("double")) {
						paramArr[index]  = s.nextDouble();
						index++;
					}
					}
				} // Loop End
				System.out.println("Params are ::: ");
				if(paramArr!=null) {
				for(Object o : paramArr) {
					System.out.println(o);
				}
				}
				System.out.println("****************************");
				
				Object result= method.invoke(object, paramArr);
				System.out.println("result is "+result);
				
				
				
				
			}
			
			
		}
	}

}
