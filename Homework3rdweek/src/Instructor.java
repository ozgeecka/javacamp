
public class Instructor extends User {
	
	String certification;
	String yearsOfExperience;

	public Instructor(int userId, String firstName, String lastName, String email, String country, int age,int password,String certification,String yearsOfExperience) {
		super(userId, firstName, lastName, email, country, age,password);
		this.certification=certification;
		this.yearsOfExperience=yearsOfExperience;

	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

}
