
public class Monster {
		private String name = "Jenny";
		private Integer age = 24;
		private String species = "Bunny";
		
		public Friend Jo; 
		public String food = "pizza";
		
		
		//constructor 1
		public Monster(){
			
		}
		
		
		//constructor 2
		public Monster(String name, Integer age, String food){
		this.name = name;
		this.food = food;
		this.age = age;
		
		}
		
		//constructor 3
		public Monster(String name){
			this.name = name;
		}
		
		//constructor 4
		public Monster(String name, Integer age){
			this(name);
			this.age = age;
			
		}
		//Name
		public String getName() {
			this.food = "hello";
			this.Jo = new Friend("Kuku");
			return name;

		}
		public void setName(String name) {
			this.name = name;
		}
		
		//age
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		
		//species
		public String getSpecies() {
			return species;
		}
		public void setSpecies(String species) {
			this.species = species;
		}
		
}

