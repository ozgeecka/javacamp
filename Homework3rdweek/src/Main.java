
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1, "Engin", "Demirog", "engindemirog@gmail.com", "Turkey", 35, 85294, "JAVA", "26");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor);
		
		System.out.println(instructor.getFirstName());
		
		
		Student student = new Student(2, "Ozge", "Akca", "ozgeeakca@gmail.com", "Turkey", 25, 12345556, "123478567");
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student);
		
		System.out.println(student.getFirstName());

	}

}
