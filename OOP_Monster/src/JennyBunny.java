
public class JennyBunny {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster Jenny = new Monster("Jenny2", 25);
		System.out.println(Jenny.getName());
		System.out.println(Jenny.food);
		
		Jenny.food = "Carrot";
		System.out.println(Jenny.food);
		System.out.println(Jenny.Jo.getName());
		System.out.println(Jenny.food);
		Jenny.Jo = new Friend("HY");
		System.out.println(Jenny.Jo.getName());
		
		
	}
}
