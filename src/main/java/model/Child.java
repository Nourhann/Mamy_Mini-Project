package model;

public class Child {
	String ID;
	
	String Name;
	String birthDate;
	String Gender;
	String Image;
	
	public Child() {
		super();
	}
	
	public Child(String iD, String name, String birthDate, String gender, String image) {
		super();
		ID = iD;
		Name = name;
		this.birthDate = birthDate;
		Gender = gender;
		Image = image;
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
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	
}
