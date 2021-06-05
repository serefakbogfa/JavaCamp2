
public class Main {

	public static void main(String[] args) {
	Instructor ınstructor = new Instructor();
	ınstructor.setId(1);
	ınstructor.setUserName(", engin ,");
	ınstructor.setUserSurname("demiroğ ,");
	ınstructor.setUserEmail("engin@gmail ,");
    ınstructor.setCertificate("java ,");
	
	
	
	
	Student student = new Student();
	student.setId(2 );
	student.setUserName(", şeref ,");
	student.setUserSurname("akboğa , ");
	student.setUserEmail("seref@gmail ,");
	student.setCourse("JavaCamp");
	
	
	
    InstructorManager ınstructorManager = new InstructorManager();
    //ınstructorManager.add(ınstructor);
    ınstructorManager.delete(ınstructor);
    
    StudentManager studentManager = new StudentManager();
    //studentManager.add(student);
    studentManager.delete(student);
    
    
    UserManager userManager = new UserManager();
    User[] user = {ınstructor , student , };
    userManager.addMultiple(user);
    
    
    
    UserManager userzManager = new UserManager();
    
	
	 
	 
	 
	 
	 
	}

}
