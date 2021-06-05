
public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println(student.getCourse()+"kullanıcı giriş yaptı");
	}
	public void delete(Student student) {
		System.out.println(student.getCourse()+"kullanıcı çıkış yaptı ");
		
	}
	
}


