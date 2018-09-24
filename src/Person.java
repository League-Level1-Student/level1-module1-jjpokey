
public class Person {

	private String name;
	private String superPower;
	
	public String getName() {
		return this.name;
	}
	public String getSuperPower() {
		return this.superPower;
	}
	void setName(String name) {
		this.name = name;
	}
	void setSuperPower(String superPower) {
		this.superPower = superPower;
	}
	public String toString() {
		return getName() + " has mad " + getSuperPower() + " skills.";
		
	}
}
