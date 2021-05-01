
	public class Student extends User {
		
		private String studentNumber;

		public Student(int userId, String firstName, String lastName, String email, String country, int age,int password,String studentNumber) {
			super(userId, firstName, lastName, email, country, age,password);
			this.studentNumber=studentNumber;

		}

		public String getStudentNumber() {
			return studentNumber;
		}

		public void setStudentNumber(String studentNumber) {
			this.studentNumber = studentNumber;
		}

	}

