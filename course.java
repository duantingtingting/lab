package choose;

public class course {
	public String id;
	public String name;
	public String place;
	public String time;
	public String tname;
	String getID(){
		return id;
	}
	String getName(){
		return name;
	}
	String getPlace(){
		return place;
	}
	String getTime(){
		return time;
	}
	String getTname(){
		return tname;
	}
	public course(String id,String name,String place,String time,String Tname)
	{
		this.id = id;
		this.name = name;
		this.place = place;
		this.time = time;
		this.tname = tname;
	}
}
