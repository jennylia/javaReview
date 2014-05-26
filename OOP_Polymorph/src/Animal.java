
public class Animal {
	private String name = "Animal";
	public String favFood = "Food";
	
	protected final void changeName(String name){
		this.name = name;
	}
	
	protected final String getName(){
		return this.name;
	} 
	
	public void eatStuff(){
		System.out.println("Yum" + favFood);
	}
	
	public void walkAround(){
		System.out.println(this.name + "walking");
	}
	
	public Animal(){}
	
	public Animal(String name, String food){
		System.out.println("Animal Constructor");
		this.name = name;
		this.favFood = food;
	}
	
	protected void eat(){
		
		System.out.println("Eating yum yum");
	}
	
}
