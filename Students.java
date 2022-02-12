package week3.day1;

public class Students {
	public void getStudentInfo(int id ) {
		System.out.println("Student ID -->"+ id);
	}
	public void getStudentInfo(int id,String Name ) {
		System.out.println("Student ID -->"+ id   + "Student Name-->" + Name);
	}
	public void getStudentInfo(String Emailid, long phoneNo) {
		System.out.println("Student Email ID -->"+ Emailid   +  "Phone Number -->" + phoneNo);
	}
public static void main(String [] args) {
	Students student= new Students();
	student.getStudentInfo(2405);
	student.getStudentInfo(1342 ,"parthi");
	student.getStudentInfo("parthigmail" , 4567899845L);
	
	
}
	

}
