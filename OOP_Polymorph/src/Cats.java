
public class Cats extends Animal{
	public String favoriteToy = "yarn";
	
	public void playWith(){
		System.out.println("Yeah" + favoriteToy);
		
	}
	
	@Override
	public void walkAround(){
		System.out.println(this.getName() + " is stalking around");
	}
	
	public String getToy(){
		return this.favoriteToy;
	}

	public Cats(String name, String favFood, String favToy){
		super(name,favFood);
		this.favoriteToy = favToy;
	}
	
	public void eat(String x){
		super.eat();
		System.out.println("cat food is enjoyable");
		System.out.println(x);
	}
	
}
