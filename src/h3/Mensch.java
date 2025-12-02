package h3;

public class Mensch {
	public String name = "";
	public int gebJahr = 0;
	public int alter = 0;
	
	public void setName(String new_name) {
		name = new_name;
	}
	
	public void setGebJahr(int new_gebJahr) {
		gebJahr = new_gebJahr;
	}
	
	public void setAlter() {
		alter = 2025 - gebJahr;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGebJahr() {
		return gebJahr;
	}
	
	public int getAlter() {
		return alter;
	}
}
