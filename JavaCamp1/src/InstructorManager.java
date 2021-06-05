
public class InstructorManager extends UserManager{
	
	
	public void add(Instructor instrucktor) {
		System.out.println(instrucktor.getCertificate()+"kullanýcý giriþ yaptý");
	}
	
	public void delete(Instructor instrucktor) {
		System.out.println(instrucktor.getCertificate() + "silindi");
		
	}
}
