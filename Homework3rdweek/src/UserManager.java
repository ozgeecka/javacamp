public class UserManager {

	public void addUser (User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " ba�ar� ile eklenmi�tir.");
	}
	
	public void deleteUser (User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " ba�ar� ile eklenmi�tir.");
	}
	
	public void updateUser (User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " ba�ar� ile eklenmi�tir.");
	}
	
	public User[] getAll() {
		System.out.println("Kullan�c� listesi");
		return new User[] {};
	}
}