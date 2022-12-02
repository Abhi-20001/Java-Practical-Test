package array.main;
import array.first.User;

public class userMain {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int id = sc.nextInt();
		sc.nextLine();
		
		String s = sc.nextLine();
		
		User user = new User(id,s);
		
		User[] u = new User[3];
	}

}
