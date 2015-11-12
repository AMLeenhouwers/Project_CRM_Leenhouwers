package model;

public abstract class UserValidator {

	public static boolean verifyUser(User user){
		User dbUser = UserDoa.findUserByName(user.getName());
		if (dbUser == null) return false;
		else if(dbUser.getPassword().equals(user.getPassword())) return true;
		else return false;
		
	}
	
}
