
public class UserManager {	
	public void add(User user) {
		System.out.println(user.getId()+""+ user.getUserName()+""+user.getUserSurname()+""+ user.getUserEmail() +""+ "Kullan�c� giri� yapt�");
		
	}
public void addMultiple(User[] users) {
	for(User user: users) {
		add(user);
	   }
			
	} 
    

}

