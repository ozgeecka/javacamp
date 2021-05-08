package entities.concretes.leect4hw2;

import entities.abstracts.Entity;


	public class Customer implements Entity {
        
		private int Id;
		private String FirstName;
		private String LastName;
		private int BirthDate;
		private String NationalityId;
		
		public Customer(int id, String firstName, String lastName, int birthDate, String nationalityId) {
			super();
			Id = id;
			FirstName = firstName;
			LastName = lastName;
			BirthDate = birthDate;
			NationalityId = nationalityId;
		}

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public String getFirstName() {
			return FirstName;
		}

		public void setFirstName(String firstName) {
			FirstName = firstName;
		}

		public String getLastName() {
			return LastName;
		}

		public void setLastName(String lastName) {
			LastName = lastName;
		}

		public int getBirthDate() {
			return BirthDate;
		}

		public void setBirthDate(int birthDate) {
			BirthDate = birthDate;
		}

		public String getNationalityId() {
			return NationalityId;
		}

		public void setNationalityId(String nationalityId) {
			NationalityId = nationalityId;
		}

}
