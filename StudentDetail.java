package Assigment4;

public class StudentDetail {
	
		
		public void getStudentInfo(int ID) {
			System.out.println("ID: " + ID);
		}
		public void getStudentInfo(int ID, String Name) {
			System.out.println("ID: " + ID + " & " + "Name: " + Name);
		}
		public void getStudentInfo(String email, long phoneNumber) {
			System.out.println("Email: " + email + " & " + "Phone Number: " + phoneNumber);
		}
		
		
		public static void main(String[] args) {
			StudentDetail det = new StudentDetail();
			det.getStudentInfo(1233);
			det.getStudentInfo(1233, "sathish");
			det.getStudentInfo("gss2@gmail.com", 123456778L);
		}

	

}
