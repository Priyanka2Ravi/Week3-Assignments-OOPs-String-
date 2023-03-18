package week3.day1.Assignment4;

public class Students {

	public static void getStudentInfo(int id) {
		
		System.out.println("Student id number is : "+ id);
		
	}
	
public static void getStudentInfo(int id, String name) {
		
	System.out.println("Student id number and  name are : " + id +" "+ name);
	}


public static void getStudentInfo(String email,long phonenumber) {
	
	System.out.println("student email and phonenumber are "+ email +" " + phonenumber);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getStudentInfo(2525822);
		getStudentInfo(587587,"Parameshwaran");
		getStudentInfo("orea@gmail.com", 91578125583369l);
	}

}
