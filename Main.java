package kampOdev2;

public class Main {
	
	public static void main(String[] args) {
		
		
		StudentManager studentManager = new StudentManager();
		Student student = new Student(2, "Selma", "Kara", "selmasifre");
		
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		Instructor instructor = new Instructor(1, "Seyda", "Tasdan", "sifrembu");
		
		instructorManager.add(instructor);
		
		UserManager userManager = new UserManager();
		User user = new User(3, "Aysem", "Böcek", "aysemsifre");
		
		userManager.add(user);
	}

}
