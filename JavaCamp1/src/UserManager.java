
public class UserManager {	
	public void add(User user) {
		System.out.println(user.getId()+""+ user.getUserName()+""+user.getUserSurname()+""+ user.getUserEmail() +""+ "Kullanýcý giriþ yaptý");
		
	}
public void addMultiple(User[] users) {
	for(User user: users) {
		add(user);
	   }
			
	} 
    

}

