package model;

public class Memory {
	String ID;
	String Name;
	String Date;
	String Description;
	
	public Memory(String iD, String name, String date, String description) {
		super();
		ID = iD;
		Name = name;
		Date = date;
		Description = description;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Memory(String name, String date, String description) {
		super();
		Name = name;
		Date = date;
		Description = description;
	}
	public Memory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
