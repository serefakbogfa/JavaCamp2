
public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println(student.getCourse()+"kullan�c� giri� yapt�");
	}
	public void delete(Student student) {
		System.out.println(student.getCourse()+"kullan�c� ��k�� yapt� ");
		
	}
	
}


