
public class InstructorManager extends UserManager{
	
	
	public void add(Instructor instrucktor) {
		System.out.println(instrucktor.getCertificate()+"kullan�c� giri� yapt�");
	}
	
	public void delete(Instructor instrucktor) {
		System.out.println(instrucktor.getCertificate() + "silindi");
		
	}
}
