package xloul;

public class Polozka {
	private String name;
	private int age;
	Polozka next;
	Polozka(String name, int age){
		this.name = name;
		this.age = age;
	}
	void vypsat(){

		System.out.println(name + ", " + age);
		if(next!=null){
			next.vypsat();
		}
	}
}