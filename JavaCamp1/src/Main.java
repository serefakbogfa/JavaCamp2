
public class Main {

	public static void main(String[] args) {
	Instructor �nstructor = new Instructor();
	�nstructor.setId(1);
	�nstructor.setUserName(", engin ,");
	�nstructor.setUserSurname("demiro� ,");
	�nstructor.setUserEmail("engin@gmail ,");
    �nstructor.setCertificate("java ,");
	
	
	
	
	Student student = new Student();
	student.setId(2 );
	student.setUserName(", �eref ,");
	student.setUserSurname("akbo�a , ");
	student.setUserEmail("seref@gmail ,");
	student.setCourse("JavaCamp");
	
	
	
    InstructorManager �nstructorManager = new InstructorManager();
    //�nstructorManager.add(�nstructor);
    �nstructorManager.delete(�nstructor);
    
    StudentManager studentManager = new StudentManager();
    //studentManager.add(student);
    studentManager.delete(student);
    
    
    UserManager userManager = new UserManager();
    User[] user = {�nstructor , student , };
    userManager.addMultiple(user);
    
    
    
    UserManager userzManager = new UserManager();
    
	
	 
	 
	 
	 
	 
	}

}
