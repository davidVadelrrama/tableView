package model;

public class Student {

	private String code;
	private String name;
	private int natID;

	// constructor
	public Student(String name, String code,  int natID) {
		this.code = code;
		this.name = name;
		this.natID = natID;
	}

	// getters & setters
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNatID() {
		return natID;
	}

	public void setNatID(int natID) {
		this.natID = natID;
	}

}
