
public class practice091 {
	String name;
	int hp;
	int mp;
	
	public practice091(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public practice091(String name, int hp) {
		this(name, hp , 5);
	}
	
	public practice091(String name) {
		this(name, 40);
	}
}
