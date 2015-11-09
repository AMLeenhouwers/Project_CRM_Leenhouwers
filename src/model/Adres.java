package model;

public abstract class Adres {
	private String firstLine;
	private String secondLine;
	private String thirdLine;
	private String country;
	
	public Adres() {
	}
	
	public Adres(String f, String s, String t, String c){
		firstLine = f;
		secondLine = s;
		thirdLine = t;
		country = c;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	public String getThirdLine() {
		return thirdLine;
	}

	public void setThirdLine(String thirdLine) {
		this.thirdLine = thirdLine;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
