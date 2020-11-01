package choose;

public class teacher {
	public String id;	 
	public String name;
	public String sex;
	public String teach;
	String getID(){
		return id;
	}
	String getName(){
		return name;
	}
	String getSex(){
		return sex;
	}
	String getTeach(){
		return teach;
	}
	public teacher(String id,String name,String sex,String teach)
	{
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.teach = teach;
	}
}
