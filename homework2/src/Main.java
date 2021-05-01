
public class Main {

	public static void main(String[] args) {
		
		Courses courses1 = new Courses (1,"Java1","JavaCourse1",20.4) ;

		
		//System.out.println(courses1.title);
		
		Courses courses2 = new Courses (2,"Java2","JavaCourse2", 65.0) ;
		
		//System.out.println(courses2.detail);
		
		Courses courses [] = {courses1,courses2};
		
		for (Courses i :courses ) {
			System.out.println(i.title);
		}
	
		Categories category1 = new Categories (5, "Java") ;
		
		System.out.println(category1.id);
		
		Categories category2 = new Categories (8, "Jav") ;
		
		Categories category [] =  {category1, category2};
		
		for( Categories a :category) {
			System.out.println(a.name);
			
		}
		
		

	}

}
