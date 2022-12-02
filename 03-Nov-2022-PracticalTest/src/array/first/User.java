package array.first;

public class User {
	int uID;
	String uName;
	
	public User(int id,String name)
	{
		uID=id;
		uName=name;
	}
	
	void setUserID(int id)
	{
		uID = id;
	}
	
	void setUserName(String s)
	{
		uName = s;
	}
	
	int getUserID()
	{
		return uID;
	}
	
	String setUserName()
	{
		return uName;
	}
}

