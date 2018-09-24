
public class PersonRunner {
public static void main(String[] args) {
	

	Person p1 = new Person();
	Person p2 = new Person();
	Person p3 = new Person();
	
	p1.setSuperPower("Invisibility");
	p1.setName("Joe");
	p2.setSuperPower("Flying");
	p2.setName("Jerry");
	p3.setSuperPower("Teleportation");
	p3.setName("Jeff");
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
}
}
