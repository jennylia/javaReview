public class B extends A {
	int intB = 20;

	public B() {
		super(0);
		System.out.println("B");

	}
	
	public B(int no1, int no2){
		super(no2);
		//intB = no2;
		System.out.println(intA);
		System.out.println(intB);
		
	}
}
