
public class Dogs extends Animal{
	
	public Dogs(String name, String food){
		super(name, food);
	}
	
	public void eat(){
		super.eat();
		System.out.println("I'm a dog");
	}

}
