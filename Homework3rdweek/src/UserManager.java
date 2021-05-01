public class UserManager {

	public void addUser (User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " baþarý ile eklenmiþtir.");
	}
	
	public void deleteUser (User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " baþarý ile eklenmiþtir.");
	}
	
	public void updateUser (User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " baþarý ile eklenmiþtir.");
	}
	
	public User[] getAll() {
		System.out.println("Kullanýcý listesi");
		return new User[] {};
	}
}