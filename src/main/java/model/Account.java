package model;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Accounts")
public class Account {
   @Id
   private String ID;
   private String UserName;
   private String Password;
   private String mail;
   private String gender;
   private String image ;
   private List<Child> Children;
   private List<Problem> Problems;
   private List<Memory> Memories;
   
public Account() {
	super();
	Children = new ArrayList<>();
	Problems = new ArrayList<>();
	Memories = new ArrayList<>();
	
}
public Account( String userName, String password, String mail, String gender, String image) {
	super();
	UserName = userName;
	Password = password;
	this.mail = mail;
	this.gender = gender;
	this.image = image;
}
public Account(String userName, String password, String mail, String gender, String image, List<Child> children,
		List<Problem> problems, List<Memory> memories) {
	super();
	UserName = userName;
	Password = password;
	this.mail = mail;
	this.gender = gender;
	this.image = image;
	Children = children;
	Problems = problems;
	Memories = memories;
}
public Account(String iD, String userName, String password, String mail, String gender, String image,
		ArrayList<Child> children, ArrayList<Problem> problems, ArrayList<Memory> memories) {
	super();
	ID = iD;
	UserName = userName;
	Password = password;
	this.mail = mail;
	this.gender = gender;
	this.image = image;
	Children = children;
	Problems = problems;
	Memories = memories;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public List<Child> getChildren() {
	return Children;
}
public void setChildren(ArrayList<Child> children) {
	Children = children;
}
public List<Problem> getProblems() {
	return Problems;
}
public void setProblems(ArrayList<Problem> problems) {
	Problems = problems;
}
public List<Memory> getMemories() {
	return Memories;
}
public void setMemories(ArrayList<Memory> memories) {
	Memories = memories;
}
   
   
   
   
}
