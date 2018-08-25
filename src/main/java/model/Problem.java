package model;

public class Problem {
	String ID;
	String Name;
	String Description;
	String Solution;
	boolean Solved;
	public Problem(String iD, String name, String description, String solution, boolean solved) {
		super();
		ID = iD;
		Name = name;
		Description = description;
		Solution = solution;
		Solved = solved;
	}
	public boolean isSolved() {
		return Solved;
	}
	public void setSolved(boolean solved) {
		Solved = solved;
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
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getSolution() {
		return Solution;
	}
	public void setSolution(String solution) {
		Solution = solution;
	}
	public Problem(String iD, String name, String description, String solution) {
		super();
		ID = iD;
		Name = name;
		Description = description;
		Solution = solution;
	}
	public Problem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
